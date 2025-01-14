package com.ecommint.bookstore.core.dao;

import com.ecommint.bookstore.core.model.WriterModel;

public interface WriterDao {
    WriterModel getWriterByWriterCode(String writerCode);
}
