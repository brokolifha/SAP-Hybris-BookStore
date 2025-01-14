package com.ecommint.bookstore.core.job;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.core.model.BookModel;
import com.ecommint.bookstore.core.model.CategoryForNewBookModel;
import com.ecommint.bookstore.core.model.RemoveOldBookCjModel;
import com.ecommint.bookstore.core.service.BookService;
import com.ecommint.bookstore.core.service.CategoriesService;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class OldBookRemoveJobPerfomable extends AbstractJobPerformable <RemoveOldBookCjModel>{

    @Resource
    private ModelService modelService;
    @Resource
    private BookService bookService;

    private CategoriesService categoryService;

    private CategoryForNewBookModel categoryForNewBookModel= null;
    @Override
    public PerformResult perform(RemoveOldBookCjModel removeOldBookCjModel) {

        List<BookModel> bookModel = bookService.listOldBooksByBookCategory(BookCategories.YENI);
        categoryForNewBookModel = categoryService.findCategoryByCategoryName(BookCategories.YENI);
        List<BookModel> removedBook = new ArrayList<>(categoryForNewBookModel.getBook());
        try {
            for (BookModel bookModelList : bookModel){
                removedBook.remove(bookModelList);
            }
            categoryForNewBookModel.setBook(removedBook);
            modelService.save(categoryForNewBookModel);
            System.out.println("Eski kitaplar çıkartıldı");
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

    }
}
