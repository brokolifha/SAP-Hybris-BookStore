package com.ecommint.bookstore.core.service;

import com.ecommint.bookstore.core.model.WriterModel;

public interface WriterService {

    WriterModel getWriterByWriterCode(String writerCode);
}
