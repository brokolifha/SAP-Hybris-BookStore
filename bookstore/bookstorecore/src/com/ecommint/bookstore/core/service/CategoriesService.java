package com.ecommint.bookstore.core.service;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.CategoryForNewBookModel;

public interface CategoriesService {//CategoryService ismi başka yerde kullanıldığı için hata veriyordu bu şekilde değiştirmek zorunda kaldım!
    CategoryForNewBookModel findCategoryByCategoryName(BookCategories bookCategories);
}
