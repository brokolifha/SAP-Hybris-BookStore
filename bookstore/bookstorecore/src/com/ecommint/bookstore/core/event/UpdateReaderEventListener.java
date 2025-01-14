package com.ecommint.bookstore.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.task.TaskConditionModel;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.task.TaskService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Random;

public class UpdateReaderEventListener extends AbstractEventListener<UpdateReaderEvent> {

     Logger logger = Logger.getLogger(UpdateReaderEventListener.class);

     @Resource
     private TaskService taskService;
     @Resource
     private ModelService modelService;

     private void updateTask(UpdateReaderEvent updateReaderEvent){
         TaskModel taskModel = modelService.create(TaskModel.class);
         TaskConditionModel taskConditionModel = modelService.create(TaskModel.class);
         taskModel.setRunnerBean("updateReaderTask");
         taskModel.setContext(updateReaderEvent);
         taskConditionModel.setUniqueID("Event - "+ new Random().nextInt());//sürekli bir id ile oluşuyor ve bu id random ile hep farklı olmasını sağlıyoruz.
         logger.info("ID : "+ taskConditionModel.getUniqueID());
         taskService.scheduleTask(taskModel);

     }








    @Override
    protected void onEvent(UpdateReaderEvent updateReaderEvent) {

    }
}
