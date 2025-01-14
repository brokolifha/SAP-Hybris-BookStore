package com.ecommint.bookstore.facades.reader.impl;

import com.ecommint.bookstore.core.event.UpdateReaderEvent;
import com.ecommint.bookstore.core.model.ReaderModel;
import com.ecommint.bookstore.core.service.ReaderService;
import com.ecommint.bookstore.facades.reader.ReaderFacade;
import com.ecommint.bookstore.facades.reader.data.ReaderData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.event.EventService;

import javax.annotation.Resource;
import java.util.List;

public class DefaultReaderFacade implements ReaderFacade {

    @Resource
    private ReaderService readerService;

    private Converter<ReaderModel,ReaderData> converter;
    @Resource
    private EventService eventService;



    @Override
    public List<ReaderData> getReadersIn24Hour() {

        readerService.readerReportTask();
        return converter.convertAll(readerService.getReadersIn24Hour());
    }

    @Override
    public void updateReader(ReaderData readerData, String readerCode) {
        UpdateReaderEvent updateReaderEvent = new UpdateReaderEvent("Event Updated : ",readerCode,readerData.getFirstName(),readerData.getLastName());
        eventService.publishEvent(updateReaderEvent);
    }


}
