package com.tmall.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalExceptionHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.OrderItem;
import com.tmall.service.OrderItemServiice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orderItemService")
public class OrderItemController extends GlobalExceptionHandler {

    @Autowired
    OrderItemServiice orderItemServiice;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<OrderItem> list = orderItemServiice.list();
        return new ResultBean(list);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam(required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        OrderItem orderItem = orderItemServiice.get(id);
        return new ResultBean(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody OrderItem orderItem) throws MyException {
        if (orderItem == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        orderItemServiice.add(orderItem);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody OrderItem orderItem) throws MyException {
        if (orderItem == null || orderItem.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        orderItemServiice.update(orderItem);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody OrderItem orderItem) throws MyException {
        if (orderItem == null || orderItem.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        orderItemServiice.delete(orderItem.getId());
        return new ResultBean();
    }

    /**
     * 获取订单项
     * @param oid
     * @return
     * @throws MyException
     */
    @RequestMapping(value = "getOrderItem", method = RequestMethod.GET)
    public Object getOrderItem(@RequestParam(required = false) Integer oid) throws MyException {
        if (oid == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        List<OrderItem> list = orderItemServiice.getOrderItem(oid);
        return new ResultBean(list);
    }

}
