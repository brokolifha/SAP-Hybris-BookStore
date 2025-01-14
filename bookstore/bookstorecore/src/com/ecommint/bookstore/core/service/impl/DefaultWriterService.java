package com.ecommint.bookstore.core.service.impl;

import com.ecommint.bookstore.core.dao.WriterDao;
import com.ecommint.bookstore.core.model.WriterModel;
import com.ecommint.bookstore.core.service.WriterService;

import javax.annotation.Resource;

public class DefaultWriterService implements WriterService {

    @Resource
    private WriterDao writerDao;



    @Override
    public WriterModel getWriterByWriterCode(String writerCode) {


        return writerDao.getWriterByWriterCode(writerCode);
    }
}
