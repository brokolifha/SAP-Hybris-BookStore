package com.ecommint.bookstore.facades.populators;

import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.model.WriterModel;
import com.ecommint.bookstore.facades.book.data.BookData;
import com.ecommint.bookstore.facades.book.data.WriterData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class BookPopulator implements Populator<BookModel, BookData> {


    private Converter<WriterModel, WriterData> converter;


    @Override
    public void populate(BookModel bookModel, BookData bookData) throws ConversionException {
        bookData.setName(bookModel.getName());
        bookData.setSelling(bookModel.getSelling());
        bookData.setSellingCount(bookModel.getSellingCount());
        bookData.setWriterName(converter.convertAll(bookModel.getWriters()));
        bookData.setCategory(bookModel.getCategory());
    }
}
