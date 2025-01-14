package com.ecommint.bookstore.core.handler;

import com.ecommint.bookstore.core.model.WriterModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

public class WriteFullNameDynamicHandler implements DynamicAttributeHandler<String, WriterModel> {
    @Override
    public String get(WriterModel model) {
        return model.getFirstName() + " " + model.getLastName();
    }

    @Override
    public void set(WriterModel model, String s) {
        // do thing
    }
}
