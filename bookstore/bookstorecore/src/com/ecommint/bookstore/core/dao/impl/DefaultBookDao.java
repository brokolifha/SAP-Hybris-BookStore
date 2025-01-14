package com.ecommint.bookstore.core.dao.impl;

import com.ecommint.bookstore.core.dao.BookDao;
import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.BookModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DefaultBookDao extends AbstractItemDao implements BookDao {



    @Override
    public List<BookModel> getAllBooksWriterPk(String writerPk) {
        String query = "SELECT {b.pk} FROM {Book AS b JOIN WriterAndBookRelation AS rel ON {b.pk} = {rel.source} JOIN Writer AS w ON {rel.target} = {w.pk}} WHERE {w.pk} = ?writerPk";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("writerPk",writerPk);
        SearchResult<BookModel> searchResult = getFlexibleSearchService().search(fQuery);
        return searchResult.getResult();


    }

    @Override
    public List<BookModel> getAllBooksWriterCode(String writerCode) {
        String query = "SELECT {b.pk} FROM {Book AS b JOIN WriterAndBookRelation AS rel ON {b.pk} = {rel.source} JOIN Writer AS w ON {rel.target} = {w.writerCode}} WHERE {w.writerCode} = ?writerCode";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("writerCode",writerCode);
        SearchResult<BookModel> searchResult = getFlexibleSearchService().search(fQuery);
        return searchResult.getResult();
    }

    @Override
    public List<BookModel> findBooksByCategory(BookCategories category) {
        String query = "SELECT {b.pk} FROM {Book AS b } WHERE {b.category} = ?category ";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("category",category);
        SearchResult<BookModel> searchResult = getFlexibleSearchService().search(fQuery);
        return searchResult.getResult();
    }

    @Override
    public List<BookModel> getBookByBookName(String name) {

        String query = "SELECT {b.pk} FROM {Book as b} WHERE {b.name} = ?name";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("name",name);
        SearchResult<BookModel> searchResult = getFlexibleSearchService().searchUnique(fQuery);
        return searchResult.getResult();
    }

    @Override
    public BookModel getBookByBookCode(String bookCode) {
        String query = "SELECT {b.pk} FROM {Book as b} WHERE {b.bookCode} = ?bookCode";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("bookCode",bookCode);
        //BookModel bookModel = getFlexibleSearchService().searchUnique(fQuery);
        SearchResult<BookModel> searchResult = getFlexibleSearchService().searchUnique(fQuery);
        return searchResult.getResult().get(0);
    }

    @Override
    public List<BookModel> listOldBooksByBookCategory(BookCategories bookCategories) {

        String query = "SELECT {b.pk} FROM {Book AS b JOIN BookAndBookCategoryRelation AS rel ON {b.pk} = {rel.source} " +
                "JOIN CategoryForNewBook AS nB ON {rel.target} = {nB.pk} }" +
                "WHERE {nB.categoryName} = ?category" +
                "AND {b.creationtime} <= ?creationTime";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("category",bookCategories);
        Date dateTime = Calendar.getInstance().getTime();
        fQuery.addQueryParameter("creationTime",dateTime);
        SearchResult<BookModel> searchResult = getFlexibleSearchService().search(fQuery);
        return searchResult.getResult();


    }
}
