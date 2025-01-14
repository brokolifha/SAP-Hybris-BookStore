package groovy

import com.ecommint.bookstore.core.jalo.Book
import com.ecommint.bookstore.core.model.BookModel
import com.ecommint.bookstore.core.model.PublisherModel
import de.hybris.platform.core.PK
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.search.SearchResult
import groovy.transform.Field

//Diğer classlar içerisinde Beanlerde tanımlnan classları @Resource anotasyonu ile inject ediyoruz.
//Grovylerde ise @Field kullanarak bunu aşağıda ki gibi tanımlıyoruz.
@Field FlexibleSearchService flexibleSearchService = spring.getBean("flexibleSearchService");
@Field ModelService modelService = spring.getBean("modelService");

execute();

private void execute() {
    PublisherModel publisher = modelService.get(PK.parse("8796093230818"));
//Bir yayınevinin pk sını buraya girerek yayın evi olmayan kitaplara otomatik bir yayın evi ataması yapacağız!
    List<BookModel> bookList = getAllBooks();
    for (final BookModel book in bookList) {
        if (book.getPublisher() != null) {
            println("Kitap adı : " + book.getName() + " Yayın evi : " + book.getPublisher().getName());
        } else {
            println("Kitap adı : " + book.getName() + " Yayın evi yok");
            book.setPublisher(publisher);
            modelService.save(book);
        }

    }
}

private List<BookModel> getAllBooks() {
    String query = "SELECT {" + BookModel.PK + "} FROM {" + BookModel._TYPECODE + "}";
    FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
    SearchResult<BookModel> result = flexibleSearchService.search(fQuery);
    List<BookModel> bookList = result.getResult();
    return bookList;
}
