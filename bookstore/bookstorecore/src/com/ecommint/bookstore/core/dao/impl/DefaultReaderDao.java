package com.ecommint.bookstore.core.dao.impl;

import com.ecommint.bookstore.core.dao.ReaderDao;
import com.ecommint.bookstore.core.jalo.Reader;
import com.ecommint.bookstore.core.model.ReaderModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class DefaultReaderDao extends AbstractItemDao implements ReaderDao {
    @Resource
    private FlexibleSearchService flexibleSearchService;


    @Override
    public List<ReaderModel> getReadersIn24Hour() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateBefore24Hours = now.minusHours(24);
        Date dateBefore24HoursAsDate = Date.from(dateBefore24Hours.atZone(ZoneId.systemDefault()).toInstant());

        String query = "SELECT {reader.pk} " +
                "FROM {Reader AS reader} " +
                "WHERE {reader.creationtime} >= ?dateBefore24Hours";


        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("dateBefore24Hours",dateBefore24HoursAsDate);
        SearchResult<ReaderModel> searchResult = flexibleSearchService.search(fQuery);
        return searchResult.getResult();
    }

    @Override
    public ReaderModel getReaderByReaderCode(String readerCode) {
        String query = "SELECT {reader.pk}"+
                "FROM {Reader as reader}" +
                "WHERE {reader.readerCode} = ?readerCode ";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("readerCode",readerCode);
        SearchResult<ReaderModel> searchResult = flexibleSearchService.search(fQuery);
        return (ReaderModel) searchResult.getResult();
    }

    @Override
    public List<ReaderModel> findReadersByFavoriteAuthor(String writerCode) {
        String query = "SELECT {reader.pk} " +
                "FROM {Reader AS reader " +
                "JOIN ReaderAndWriterRelation AS rwl ON {reader.pk} = {rwl.source} " +
                "JOIN Writer AS writer ON {rwl.target} = {writer.pk}} " +
                "WHERE {writer.writerCode} = ?writerCode";

        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("writerCode",writerCode);
        SearchResult<ReaderModel> searchResult = flexibleSearchService.search(fQuery);
        return searchResult.getResult();
    }
}
