package com.ecommint.bookstore.core.service;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.BookModel;

import java.util.List;

public interface BookService {
    List<BookModel> getAllBooksWriterPk(String writerPk);
    List<BookModel> getAllBooksWriterCode(String writerCode);
    List<BookModel> findBooksByCategory(BookCategories category);
    void createNewBook(BookModel bookModel);
    BookModel getBookByBookCode(String bookCode);
    List<BookModel> listOldBooksByBookCategory(BookCategories bookCategories);
}
