package com.ecommint.bookstore.fulfilmentprocess.actions.bookRead;

import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.model.ReaderModel;
import com.ecommint.bookstore.fulfilmentprocess.model.BookReadProcessModel;
import de.hybris.platform.processengine.action.AbstractAction;
import de.hybris.platform.task.RetryLaterException;

import java.util.HashSet;
import java.util.Set;

public class ApproveBookAction extends AbstractAction<BookReadProcessModel> {

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
        BookModel book = bookReadProcessModel.getBook();
        ReaderModel reader = bookReadProcessModel.getReader();
        book.setReader(reader);
        getModelService().save(book);
        return Transition.OK.toString();
    }

    @Override
    public Set<String> getTransitions() {
        return Set.of();
    }
}
