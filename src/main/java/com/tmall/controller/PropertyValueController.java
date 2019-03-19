package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.PropertyValue;
import com.tmall.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowCredentials = "true",value = {"http://localhost:8081", "http://localhost:8082"})
@RestController
@RequestMapping(value = "/propertyValue")
public class PropertyValueController extends GlobalHandler {

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

    @RequestMapping(value = "getPidValueList", method = RequestMethod.GET)
    public Object getPidValueList(@RequestParam Integer pid) throws MyException {
        if (pid == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        List<PropertyValue> list  = propertyValueService.getPidValueList(pid);
        return new ResultBean(list);
    }

    @RequestMapping(value = "deletePidList", method = RequestMethod.POST)
    public Object deletePidList(@RequestBody PropertyValue propertyValue) throws MyException {
        if (propertyValue == null || propertyValue.getpid() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        propertyValueService.deletePidList(propertyValue.getpid());
        return new ResultBean();
    }
}
