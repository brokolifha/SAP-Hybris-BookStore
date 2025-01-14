package com.ecommint.bookstore.core.dao;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.CategoryForNewBookModel;

public interface CategoriesDao {
    CategoryForNewBookModel findCategoryByCategoryName(BookCategories bookCategories);
}
