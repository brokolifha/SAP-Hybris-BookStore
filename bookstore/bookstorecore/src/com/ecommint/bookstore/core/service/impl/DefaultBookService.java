package com.ecommint.bookstore.core.service.impl;

import com.ecommint.bookstore.core.dao.BookDao;
import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.event.NewBookEvent;
import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.service.BookService;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;
import java.util.List;

public class DefaultBookService implements BookService {

    @Resource
    private BookDao bookDao;
    @Resource
    private ModelService modelService;
    @Resource
    private EventService eventService;

    @Override
    public List<BookModel> getAllBooksWriterPk(String writerPk) {
        return bookDao.getAllBooksWriterPk(writerPk);
    }

    @Override
    public List<BookModel> getAllBooksWriterCode(String writerCode) {
        return bookDao.getAllBooksWriterCode(writerCode);
    }

    @Override
    public List<BookModel> findBooksByCategory(BookCategories category) {
        return bookDao.findBooksByCategory(category);
    }

    @Override
    public void createNewBook(BookModel bookModel) {
        modelService.save(bookModel);
        eventService.publishEvent(new NewBookEvent(bookModel.getBookCode()));

    }

    @Override
    public BookModel getBookByBookCode(String bookCode) {
        return bookDao.getBookByBookCode(bookCode);

    }

    @Override
    public List<BookModel> listOldBooksByBookCategory(BookCategories bookCategories) {
        return bookDao.listOldBooksByBookCategory(bookCategories);
    }
}
