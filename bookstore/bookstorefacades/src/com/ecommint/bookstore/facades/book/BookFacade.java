package com.ecommint.bookstore.facades.book;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.facades.book.data.BookData;

import java.util.List;

public interface BookFacade {
    List<BookData> getAllBooksWriterPk(String writerPk);
    List<BookData> getAllBooksWriterCode(String writerCode);
    List<BookData> getAllBooksByCategory(BookCategories bookCategories);
    void createBook(BookData bookData);

}
