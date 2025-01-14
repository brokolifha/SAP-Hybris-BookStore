package com.ecommint.bookstore.core.service.impl;

import com.ecommint.bookstore.core.dao.CategoriesDao;
import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.CategoryForNewBookModel;
import com.ecommint.bookstore.core.service.CategoriesService;

import javax.annotation.Resource;


public class DefaultCategoriesService implements CategoriesService {


    private CategoriesDao categoryDao;

    @Override
    public CategoryForNewBookModel findCategoryByCategoryName(BookCategories bookCategories) {
        return categoryDao.findCategoryByCategoryName(bookCategories);
    }
}
