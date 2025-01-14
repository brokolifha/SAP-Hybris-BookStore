package com.ecommint.bookstore.core.task;

import com.ecommint.bookstore.core.model.ReaderModel;
import com.ecommint.bookstore.core.service.ReaderService;
import de.hybris.platform.task.RetryLaterException;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.task.TaskRunner;
import de.hybris.platform.task.TaskService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

public class ReaderReportTask implements TaskRunner<TaskModel> {
    @Resource
    private ReaderService readerService;

    Logger logger = LoggerFactory.getLogger(ReaderReportTask.class);



    @Override
    public void run(TaskService taskService, TaskModel taskModel) throws RetryLaterException {
        List<ReaderModel> readerList =readerService.getReadersIn24Hour();
        for (ReaderModel readerModel : readerList) {
            logger.info("Information of users who have logged in in the last 24 hours : " + readerModel.getFirstName()+" "+readerModel.getLastName());
        }
    }

    @Override
    public void handleError(TaskService taskService, TaskModel taskModel, Throwable throwable) {
        logger.error("Error : ", throwable);
    }
}
