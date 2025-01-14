package com.ecommint.bookstore.facades.populators;

import com.ecommint.bookstore.core.model.WriterModel;
import com.ecommint.bookstore.facades.book.data.WriterData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class WriterPopulator implements Populator<WriterModel, WriterData> {
    @Override
    public void populate(WriterModel writerModel, WriterData writerData) throws ConversionException {
        writerData.setWriterCode(writerModel.getWriterCode());
        writerData.setFirstName(writerModel.getFirstName());
        writerData.setLastName(writerModel.getLastName());
        writerData.setFullName(writerModel.getFullName());
    }
}
