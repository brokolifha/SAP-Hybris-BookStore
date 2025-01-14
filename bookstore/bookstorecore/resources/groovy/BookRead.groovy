package groovy

import com.ecommint.bookstore.core.jalo.Book
import com.ecommint.bookstore.core.model.BookModel
import com.ecommint.bookstore.core.model.PublisherModel
import com.ecommint.bookstore.core.model.ReaderModel
import com.ecommint.bookstore.fulfilmentprocess.model.BookReadProcessModel
import de.hybris.platform.core.PK
import de.hybris.platform.processengine.BusinessProcessService
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.search.SearchResult
import groovy.transform.Field

@Field FlexibleSearchService flexibleSearchService = spring.getBean("flexibleSearchService");
@Field ModelService modelService = spring.getBean("modelService");
@Field BusinessProcessService bussinesProcessService = spring.getBean("businessProcessService");

execute();

private void execute(){
    BookModel book = modelService.get(PK.parse("8796125900513"));
    ReaderModel reader = modelService.get(PK.parse("8796093066985"));
    BookReadProcessModel bookReadProcess =bussinesProcessService.createProcess("bookread-Process"+ System.currentTimeMillis(), "book-read-process");
    bookReadProcess.setReader(reader);
    bookReadProcess.setBook(book);
    modelService.save(bookReadProcess);
    bussinesProcessService.startProcess(bookReadProcess);
}