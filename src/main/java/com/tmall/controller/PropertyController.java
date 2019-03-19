package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.Property;
import com.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@CrossOrigin(allowCredentials = "true",value = {"http://localhost:8081", "http://localhost:8082"})
@RestController
@RequestMapping(value = "/property")
public class PropertyController extends GlobalHandler {
    @Autowired
    PropertyService propertyService;

    /**
     * 产品列表
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<Property> list = propertyService.list();
        return new ResultBean(list);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam (required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        Property property = propertyService.get(id);
        return new ResultBean(property);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Property property) throws MyException {
        if (property == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        propertyService.add(property);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody Property property) throws MyException {
        if (property == null || property.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        propertyService.update(property);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody Property property) throws MyException {
        if (property == null || property.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        propertyService.delete(property.getId());
        return new ResultBean();
    }

    @RequestMapping(value = "/getCidList", method = RequestMethod.GET)
    public Object getCidList(@RequestParam (required = false) Integer cid) throws MyException {
        if (cid == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        List<Property> list = propertyService.getCidList(cid);
        return new ResultBean(list);
    }
}
