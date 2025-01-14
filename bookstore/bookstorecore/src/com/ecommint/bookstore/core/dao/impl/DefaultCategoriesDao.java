package com.ecommint.bookstore.core.dao.impl;

import com.ecommint.bookstore.core.dao.CategoriesDao;
import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.CategoryForNewBookModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import javax.annotation.Resource;

public class DefaultCategoriesDao extends AbstractItemDao implements CategoriesDao {
    @Resource
    private FlexibleSearchService flexibleSearchService;


    @Override
    public CategoryForNewBookModel findCategoryByCategoryName(BookCategories bookCategories) {
        String query = "SELECT {cFB.pk} FROM {CategoryForNewBook AS cFB} WHERE {cFB.categoryName} = ?categoryName";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.addQueryParameter("categoryName",bookCategories);
        SearchResult<CategoryForNewBookModel> searchResult = flexibleSearchService.search(fQuery);
        return searchResult.getResult().get(0);
    }
}
