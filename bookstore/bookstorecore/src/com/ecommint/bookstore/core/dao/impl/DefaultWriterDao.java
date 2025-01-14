package com.ecommint.bookstore.core.dao.impl;

import com.ecommint.bookstore.core.dao.WriterDao;
import com.ecommint.bookstore.core.model.WriterModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import javax.annotation.Resource;

public class DefaultWriterDao implements WriterDao {

    @Resource
    private FlexibleSearchService flexibleSearchService;


    @Override
    public WriterModel getWriterByWriterCode(String writerCode) {
        String query = "SELECT {w.PK} FROM {Writer AS w } WHERE {w.writerCode} = ?writerCode";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("writerCode",writerCode);
        SearchResult<WriterModel> searchResult = flexibleSearchService.searchUnique(fQuery);
        return searchResult.getResult().get(0);

    }
}
