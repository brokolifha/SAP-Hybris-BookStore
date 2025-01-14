package com.ecommint.bookstore.core.service;



import com.ecommint.bookstore.core.model.ReaderModel;

import java.util.List;

public interface ReaderService {

    List<ReaderModel> getReadersIn24Hour();
    ReaderModel getReaderByReaderCode(String readerCode);
    void readerReportTask();
    List<ReaderModel> findReadersByFavoriteAuthor(String writerCode);
}
