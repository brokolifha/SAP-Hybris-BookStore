package com.ecommint.bookstore.core.dao;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.jalo.Book;
import com.ecommint.bookstore.core.model.BookModel;

import java.util.List;

public interface BookDao {
    List<BookModel> getAllBooksWriterPk(String writerPk);
    List<BookModel> getAllBooksWriterCode(String writerCode);
    List<BookModel> findBooksByCategory(BookCategories category);
    List<BookModel> getBookByBookName(String name);
    BookModel getBookByBookCode(String bookCode);//Tek bir veri getireceğimiz için Liste olarak döndürmemize gerek yok!
    List<BookModel> listOldBooksByBookCategory(BookCategories bookCategories);
}
