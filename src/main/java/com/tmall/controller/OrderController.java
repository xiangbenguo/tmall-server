package com.tmall.controller;

import com.tmall.common.ResultBean;
import com.tmall.entity.Order;
import com.tmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */

@Controller
@RequestMapping(value = "order")
public class OrderController {
    @Autowired
    OrderService orderService;

    /**
     * 订单列表
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<Order> list = orderService.list();
        return new ResultBean(list);
    }

    /**
     * 根据id获取
     * @param id
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public  Object get(@RequestParam(required = false) Integer id) {
        if (id == null) {
            // TODO
        }
        Order order = orderService.get(id);
        return new ResultBean(order);
    }

    /**
     * 添加订单
     * @param order
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Order order) {
        if (order == null) {
            // TODO
        }

        orderService.add(order);
        return new ResultBean();
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public Object update(@RequestBody Order order) {
        if (order == null || order.getId() == null) {
            // TODO
        }

        orderService.update(order);
        return new ResultBean();
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public Object delete(@RequestBody Order order) {
        if (order == null || order.getId() == null) {
            // TODO
        }

        orderService.delete(order.getId());
        return new ResultBean();
    }
}
