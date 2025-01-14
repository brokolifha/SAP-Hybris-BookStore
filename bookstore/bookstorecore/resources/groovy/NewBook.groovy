package groovy

import com.ecommint.bookstore.core.model.NewBookModel
import com.ecommint.bookstore.core.model.PublisherModel
import com.ecommint.bookstore.core.model.WriterModel
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import groovy.transform.Field

@Field FlexibleSearchService flexibleSearchService = spring.getBean("flexibleSearchService");
@Field ModelService modelService = spring.getBean("modelService");


execute();

private void execute(){
    PublisherModel publisher = modelService.create(PublisherModel.class);
    publisher.setName("Barış Yayınevi")
    modelService.save(publisher);

    WriterModel writer = modelService.create(WriterModel.class);
    writer.setFirstName("Ceren")
    writer.setLastName("Güze")
    modelService.save(writer);

    NewBookModel newBookModel = modelService.create(NewBookModel.class);
    newBookModel.setName("BarisYrd");
    newBookModel.setDate(new Date())İ
    newBookModel.setBookCode(35);
    newBookModel.setPublisher(publisher);
    newBookModel.setWriters(Collections.singletonList(writer));//setWriters bizden bir liste olarak veri eklememizi ister.
    //Elimizde tek bir writer olduğu için Collection.singletonList fonksiyonu ile bir elemanlı bir liste oluışturmuş oluyoruz.
    modelService.save(newBookModel);
}