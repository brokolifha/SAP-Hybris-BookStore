package com.ecommint.bookstorecommercewebservices.v2.controller;

import com.ecommint.bookstore.core.enums.BookCategories;
import com.ecommint.bookstore.facades.book.BookFacade;
import com.ecommint.bookstore.facades.book.data.BookData;
import com.ecommint.bookstorecommercewebservices.dto.product.BookWsDTO;
import com.ecommint.bookstorecommercewebservices.dto.product.CreateBookWsDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.List;

@Controller
@RequestMapping(value = "{baseSiteId}/books")
@Api(tags = "Books")
public class BookController extends BaseController{
    @Resource
    private BookFacade bookFacade;



    @RequestMapping(value = "writerPk/{writerPk}",method = RequestMethod.GET)
    @ResponseBody
    @ApiBaseSiteIdParam
    public List<BookWsDTO> getBooksByWriterPk(@PathVariable("writerPk") String writerPk, @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET)  String field){
        List<BookData> bookList = bookFacade.getAllBooksWriterPk(writerPk);
        return getDataMapper().mapAsList(bookList,BookWsDTO.class,field);
    }


    @RequestMapping(value = "writerCode/{writerCode}", method = RequestMethod.GET)
    @ResponseBody
    @ApiBaseSiteIdParam
    public List<BookWsDTO> getBooksByWriterCode(@PathVariable("writerCode") String writerCode,
                                                @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET)  String fields) {
        List<BookData> bookDataList = bookFacade.getAllBooksWriterCode(writerCode);
        return getDataMapper().mapAsList(bookDataList, BookWsDTO.class, fields);
    }

    @RequestMapping("/categories/{category}")
    @ResponseBody
    @ApiBaseSiteIdParam
    public List<BookWsDTO> getBooksByCategory(@PathVariable("category") String category, @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) String field){
        BookCategories bookCategories = BookCategories.valueOf(category);
        List<BookData> bookList = bookFacade.getAllBooksByCategory(bookCategories);
        return getDataMapper().mapAsList(bookList, BookWsDTO.class, field);
    }


    @ResponseBody
    @RequestMapping(value = "/createbook", method = RequestMethod.POST)
    @ApiBaseSiteIdParam
    public void createBook(@RequestBody CreateBookWsDTO createBookWsDTO){
        BookData bookData = getDataMapper().map(createBookWsDTO,BookData.class);
        bookFacade.createBook(bookData);
    }





}
