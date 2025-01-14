package com.ecommint.bookstore.facades.book.impl;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.model.WriterModel;
import com.ecommint.bookstore.core.service.BookService;
import com.ecommint.bookstore.core.service.WriterService;
import com.ecommint.bookstore.facades.book.BookFacade;
import com.ecommint.bookstore.facades.book.data.BookData;
import com.ecommint.bookstore.facades.book.data.WriterData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class DefaultBookFacade implements BookFacade {

    @Resource
    private BookService bookService;
    @Resource
    private ModelService modelService;
    private Converter<BookModel,BookData> converter;
    @Resource
    private WriterService writerService;



    @Override
    public List<BookData> getAllBooksWriterPk(String writerPk) {
        return converter.convertAll(bookService.getAllBooksWriterPk(writerPk));
    }

    @Override
    public List<BookData> getAllBooksWriterCode(String writerCode) {
        return converter.convertAll(bookService.getAllBooksWriterCode(writerCode));
    }

    @Override
    public List<BookData> getAllBooksByCategory(BookCategories bookCategories) {
        return converter.convertAll(bookService.findBooksByCategory(bookCategories));
    }



    BookModel bookModel = null;
    @Override
    public void createBook(BookData bookData) {
        bookModel = modelService.create(BookModel.class);
        bookModel.setBookCode(bookData.getBookCode());
        bookModel.setCategory(bookData.getCategory());
        bookModel.setName(bookData.getName());
        bookModel.setSelling(bookData.getSelling());
        bookModel.setSellingCount(bookData.getSellingCount());
        List<WriterModel> writerModelList = new ArrayList<>();
        for (WriterData writers : bookData.getWriters()){
            WriterModel writerM =writerService.getWriterByWriterCode(writers.getWriterCode());
            if (writerM !=null)
                writerModelList.add(writerM);
        }
        bookModel.setWriters(writerModelList);
        bookService.createNewBook(bookModel);

    }
}
