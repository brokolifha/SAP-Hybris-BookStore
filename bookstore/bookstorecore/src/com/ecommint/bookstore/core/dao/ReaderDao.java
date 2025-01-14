package com.ecommint.bookstore.core.dao;

import com.ecommint.bookstore.core.model.ReaderModel;

import java.util.List;

public interface ReaderDao {
    List<ReaderModel> getReadersIn24Hour();
    ReaderModel getReaderByReaderCode(String readerCode);
    List<ReaderModel> findReadersByFavoriteAuthor(String writerCode);
}
