package com.ecommint.bookstore.fulfilmentprocess.actions.bookRead;

import com.ecommint.bookstore.core.enums.BookStatus;
import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.service.BookService;
import com.ecommint.bookstore.fulfilmentprocess.model.BookReadProcessModel;
import de.hybris.platform.processengine.action.AbstractAction;
import de.hybris.platform.task.RetryLaterException;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookStockAction extends AbstractAction<BookReadProcessModel> {

    @Resource
    private BookService bookService;


    protected enum Transition{
        OK,NOK;
        public static Set<String> getStringValues(){
            final Set<String> res = new HashSet<>();
            for (ApproveBookAction.Transition transition : ApproveBookAction.Transition.values()) {
                res.add(transition.toString());
            }
            return res;
        }
    }



    @Override
    public String execute(BookReadProcessModel bookReadProcessModel) throws RetryLaterException, Exception {
        BookModel bookModel =bookService.getBookByBookCode(bookReadProcessModel.getBookCode());
        if (Objects.isNull(bookModel)) {
            bookReadProcessModel.setBookStatus(BookStatus.OUTSTOCK);
            bookReadProcessModel.setStock(Boolean.FALSE);
            return Transition.NOK.toString();
        }
        else {
            bookReadProcessModel.setBookStatus(BookStatus.INSTOCK);
            bookReadProcessModel.setStock(Boolean.TRUE);
            return Transition.OK.toString();
        }

    }

    @Override
    public Set<String> getTransitions() {
        return Set.of();
    }
}
