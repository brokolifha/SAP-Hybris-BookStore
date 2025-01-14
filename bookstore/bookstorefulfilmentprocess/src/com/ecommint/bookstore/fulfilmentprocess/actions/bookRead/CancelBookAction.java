package com.ecommint.bookstore.fulfilmentprocess.actions.bookRead;

import com.ecommint.bookstore.fulfilmentprocess.model.BookReadProcessModel;
import de.hybris.platform.processengine.action.AbstractAction;
import de.hybris.platform.task.RetryLaterException;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;


public class CancelBookAction extends AbstractAction<BookReadProcessModel> {

    private static final Logger LOG = Logger.getLogger(CancelBookAction.class);


    //Tanımlaması sabit bir enumdır, Her Action class'ı içerisinde bulunur ve kullanılır!
    protected enum Transition{
        OK,NOK;
        public static Set<String> getStringValues(){
            final Set<String> res = new HashSet<>();
            for (Transition transition : Transition.values()) {
                res.add(transition.toString());
            }
            return res;
        }
    }



    @Override
    public String execute(BookReadProcessModel bookReadProcessModel) throws RetryLaterException, Exception {
       LOG.warn("Bu kitap şuan okunulabilir durumda değil");
        return Transition.OK.toString();
    }

    @Override
    public Set<String> getTransitions() {
        return Set.of();
    }
}
