package com.tmall.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.tmall.common.ResultBean;
import com.tmall.entity.OrderItem;
import com.tmall.service.OrderItemServiice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "orderItemService")
public class OrderItemController {

    @Autowired
    OrderItemServiice orderItemServiice;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<OrderItem> list = orderItemServiice.list();
        return new ResultBean(list);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam(required = false) Integer id) {
        if (id == null) {
            // TODO
        }
        OrderItem orderItem = orderItemServiice.get(id);
        return new ResultBean(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody OrderItem orderItem) {
        if (orderItem == null) {
            // TODO
        }
        orderItemServiice.add(orderItem);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody OrderItem orderItem) {
        if (orderItem == null || orderItem.getId() == null) {
            // TODO
        }

        orderItemServiice.update(orderItem);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody OrderItem orderItem) {
        if (orderItem == null || orderItem.getId() == null) {
            // TODO
        }

        orderItemServiice.delete(id);
        return new ResultBean();
    }

    @RequestMapping(value = "getOrderItem", method = RequestMethod.GET)
    public Object getOrderItem(@RequestParam(required = false) Integer oid) {
        if (oid == null) {
            // TODO
        }

        List<OrderItem> list = orderItemServiice.getOrderItem(oid);
        return new ResultBean(list);
    }

}
