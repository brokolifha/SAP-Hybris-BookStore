package com.ecommint.bookstore.facades.reader;

import com.ecommint.bookstore.facades.reader.data.ReaderData;

import java.util.List;

public interface ReaderFacade {

    List<ReaderData> getReadersIn24Hour();

    void updateReader(ReaderData readerData, String readerCode);
}
