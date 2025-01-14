package com.ecommint.bookstore.facades.populators;

import com.ecommint.bookstore.core.model.ReaderModel;
import com.ecommint.bookstore.facades.reader.data.ReaderData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class ReaderPopulator implements Populator<ReaderModel, ReaderData> {


    @Override
    public void populate(ReaderModel readerModel, ReaderData readerData) throws ConversionException {
        readerData.setFirstName(readerModel.getFirstName());
        readerData.setLastName(readerModel.getLastName());
        readerData.setCreateTime(readerModel.getCreationtime());
    }
}
