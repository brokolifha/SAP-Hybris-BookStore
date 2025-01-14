package com.ecommint.bookstore.facades.populators;

import com.ecommint.bookstore.core.model.WriterModel;
import com.ecommint.bookstore.facades.book.data.WriterData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class ModelToDataWriterPopulator implements Populator<WriterData, WriterModel> {
    

    @Override
    public void populate(WriterData writerData, WriterModel writerModel) throws ConversionException {
        writerModel.setWriterCode(writerData.getWriterCode());
        writerModel.setFirstName(writerData.getFirstName());
        writerModel.setLastName(writerData.getLastName());
    }
}
