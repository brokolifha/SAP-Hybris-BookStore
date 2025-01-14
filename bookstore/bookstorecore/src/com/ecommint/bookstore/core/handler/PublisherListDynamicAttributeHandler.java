package com.ecommint.bookstore.core.handler;


import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.model.NewBookModel;
import com.ecommint.bookstore.core.model.StoryBookModel;
import com.ecommint.bookstore.core.model.WriterModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.ArrayList;
import java.util.List;

public class PublisherListDynamicAttributeHandler implements DynamicAttributeHandler<List<String>, WriterModel> {

    @Override
    public List<String> get(WriterModel model) {
        List<String> publisherList = new ArrayList<>();
        if(model.getBooks() != null) {
            for (BookModel book : model.getBooks()) {

                StoryBookModel storyModel = (StoryBookModel) book;
                storyModel.getDate();


                NewBookModel newBookModel = (NewBookModel) book;
                newBookModel.getImageList();


                publisherList.add(book.getPublisher().getName());
            }
        }
        return publisherList;
    }

    @Override
    public void set(WriterModel model, List<String> strings) {

    }
}
