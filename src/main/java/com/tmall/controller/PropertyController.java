package com.tmall.controller;

import com.tmall.common.ResultBean;
import com.tmall.entity.Property;
import com.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */

@RestController
@RequestMapping(value = "property")
public class PropertyController {
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
    public Object get(@RequestParam (required = false) Integer id) {
        if (id == null) {
            // TODO
        }

        Property property = propertyService.get(id);
        return new ResultBean(property);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Property property) {
        if (property == null) {
            // TODO
        }

        propertyService.add(property);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody Property property) {
        if (property == null || property.getId() == null) {
            // TODO
        }

        propertyService.update(property);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody Property property) {
        if (property == null || property.getId() == null) {
            // TODO
        }

        propertyService.delete(property.getId());
        return new ResultBean();
    }
}
