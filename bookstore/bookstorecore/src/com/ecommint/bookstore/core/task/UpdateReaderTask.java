package com.ecommint.bookstore.core.task;

import com.ecommint.bookstore.core.event.UpdateReaderEvent;
import com.ecommint.bookstore.core.model.ReaderModel;
import com.ecommint.bookstore.core.service.ReaderService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.task.RetryLaterException;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.task.TaskRunner;
import de.hybris.platform.task.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class UpdateReaderTask implements TaskRunner<TaskModel> {

    @Resource
    private ReaderService readerService;

    Logger logger = LoggerFactory.getLogger(ReaderReportTask.class);

    @Resource
    private ModelService modelService;


    @Override
    public void run(TaskService taskService, TaskModel taskModel) throws RetryLaterException {
        UpdateReaderEvent updateReaderEvent = (UpdateReaderEvent) taskModel.getContext();
        ReaderModel readerModel =  readerService.getReaderByReaderCode(updateReaderEvent.getReaderCode());
        readerModel.setFirstName(updateReaderEvent.getFirstName());
        readerModel.setLastName(updateReaderEvent.getLastName());
        modelService.save(readerModel);
        logger.info("Updated reader! ");

    }

    @Override
    public void handleError(TaskService taskService, TaskModel taskModel, Throwable throwable) {
        logger.error("Error : ", throwable);
    }
}
