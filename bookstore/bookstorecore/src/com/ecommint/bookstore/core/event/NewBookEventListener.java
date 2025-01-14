package com.ecommint.bookstore.core.event;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.model.CategoryForNewBookModel;
import com.ecommint.bookstore.core.model.ReaderModel;
import com.ecommint.bookstore.core.model.WriterModel;
import com.ecommint.bookstore.core.service.BookService;
import com.ecommint.bookstore.core.service.CategoriesService;
import com.ecommint.bookstore.core.service.ReaderService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NewBookEventListener extends AbstractEventListener<NewBookEvent> {
    @Resource
    private ModelService modelService;

    @Resource
    private ReaderService readerService;

    @Resource
    private BookService bookService;

    @Resource
    private CategoriesService categoryService;


    private void addCategoryInBookModel(BookModel bookModel){
        CategoryForNewBookModel categoryForNewBookModel = categoryService.findCategoryByCategoryName(BookCategories.YENI);
        List<BookModel> newBooks = new ArrayList<>(categoryForNewBookModel.getBook());
        newBooks.add(bookModel);
        categoryForNewBookModel.setBook(newBooks);
        modelService.save(categoryForNewBookModel);
        System.out.println("Yeni kitap eklendi!"+bookModel.getName());
    }




    @Override
    protected void onEvent(NewBookEvent newBookEvent) {
        Logger logger = Logger.getLogger(NewBookEventListener.class);

        BookModel book = bookService.getBookByBookCode(newBookEvent.getBookCode());

        if(book != null){

            Set<ReaderModel> notif = new HashSet<>();
            List<WriterModel> writers = book.getWriters();

            String writerName = writers.stream().map(WriterModel::getFullName).collect(Collectors.joining(","));
            String message = "Favorilerinizde bulunan yazarın yeni kitabı eklendi. Kitabın adı : "+book.getName()+" Kitabın yazarları :"+ writerName;

            for (WriterModel writer : writers){
                List<ReaderModel> readerModelList = readerService.findReadersByFavoriteAuthor(writer.getWriterCode());

                for (ReaderModel readerModel : readerModelList){
                    if(notif.add(readerModel)){
                        readerModel.setNotification(message);
                        modelService.save(readerModel);
                        logger.info("Gönderilen bildirim : " +message);
                        //facade kısmı yapılacak 
                    }

                }
            }
            addCategoryInBookModel(book);

        }



    }
}
