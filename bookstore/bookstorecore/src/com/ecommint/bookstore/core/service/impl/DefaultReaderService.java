package com.ecommint.bookstore.core.service.impl;

import com.ecommint.bookstore.core.dao.ReaderDao;
import com.ecommint.bookstore.core.model.ReaderModel;
import com.ecommint.bookstore.core.service.ReaderService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.task.TaskService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

public class DefaultReaderService implements ReaderService {
    @Resource
    private ReaderDao readerDao;

    @Resource
    private ModelService modelService;

    @Resource
    private TaskService taskService;


    @Override
    public List<ReaderModel> getReadersIn24Hour() {
        return readerDao.getReadersIn24Hour();
    }

    @Override
    public ReaderModel getReaderByReaderCode(String readerCode) {
        return readerDao.getReaderByReaderCode(readerCode);
    }

    @Override
    public void readerReportTask() {
        TaskModel task = modelService.create(TaskModel.class);
        task.setRunnerBean("readerReportTask");
        task.setExecutionDate(new Date());
        taskService.scheduleTask(task);
    }

    @Override
    public List<ReaderModel> findReadersByFavoriteAuthor(String writerCode) {
        return readerDao.findReadersByFavoriteAuthor(writerCode);
    }


}
