package com.ecommint.bookstorecommercewebservices.v2.controller;

import com.ecommint.bookstore.facades.reader.data.ReaderData;
import com.ecommint.bookstore.facades.reader.impl.DefaultReaderFacade;
import com.ecommint.bookstorecommercewebservices.dto.ReaderWsDto;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/{baseSiteId}/readers")
public class ReaderController extends BaseController{
    @Resource
    DefaultReaderFacade readerFacade;

    @ResponseBody
    @RequestMapping(value = "/userRegister24h", method = RequestMethod.GET)
    @ApiBaseSiteIdParam
    public List<ReaderWsDto> getReaderIn24Hours(@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) String field){
        List<ReaderData> readerData = readerFacade.getReadersIn24Hour();
        return getDataMapper().mapAsList(readerData, ReaderWsDto.class, field);


    }


    @ResponseBody
    @RequestMapping(value = "/update/{readerCode}", method = RequestMethod.GET)
    @ApiBaseSiteIdParam
    public String updateReader(@PathVariable String readerCode, ReaderWsDto readerWsDto, @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) String field){
        ReaderData readerData = getDataMapper().map(readerWsDto,ReaderData.class,field);
        readerFacade.updateReader(readerData,readerCode);
        return "Reader ınfos updated!";
    }
}
