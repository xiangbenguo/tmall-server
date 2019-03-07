package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalExceptionHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.PropertyValue;
import com.tmall.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/propertyValue")
public class PropertyValueController extends GlobalExceptionHandler {

    @Autowired
    PropertyValueService propertyValueService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<PropertyValue> list = propertyValueService.list();
        return new ResultBean(list);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam(required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        PropertyValue propertyValue = propertyValueService.get(id);
        return new ResultBean(propertyValue);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody PropertyValue propertyValue) throws MyException {
        if (propertyValue == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        propertyValueService.add(propertyValue);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody PropertyValue propertyValue) throws MyException {
        if (propertyValue == null || propertyValue.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        propertyValueService.update(propertyValue);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody PropertyValue propertyValue) throws MyException {
        if (propertyValue == null || propertyValue.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        propertyValueService.delete(propertyValue.getId());
        return new ResultBean();
    }
}
