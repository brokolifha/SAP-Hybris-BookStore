package com.ecommint.bookstore.fulfilmentprocess.actions.bookRead;

import com.ecommint.bookstore.core.service.BookService;
import com.ecommint.bookstore.fulfilmentprocess.model.BookReadProcessModel;
import de.hybris.platform.processengine.action.AbstractAction;
import de.hybris.platform.task.RetryLaterException;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

public class BookReadebleAction extends AbstractAction<BookReadProcessModel> {


    protected enum Transition{
        OK,NOK,WAIT;
        public static Set<String> getTransitions(){
            Set<String> transitions = new HashSet<>();
            for(BookStockAction.Transition transition : BookStockAction.Transition.values()){
                transitions.add(transition.toString());
            }
            return transitions;
        }
    }





    final Logger logger = Logger.getLogger(BookReadebleAction.class);

    @Resource
    private BookService bookService;


    @Override
    public String execute(BookReadProcessModel bookReadProcessModel) throws RetryLaterException, Exception {





        return "";
    }

    @Override
    public Set<String> getTransitions() {
        return Set.of();
    }
}
