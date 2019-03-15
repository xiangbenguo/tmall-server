package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.Order;
import com.tmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */

@CrossOrigin(allowCredentials = "true", value = "http://localhost:8081")
@RestController
@RequestMapping(value = "/order")
public class OrderController extends GlobalHandler {
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
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public  Object get(@RequestParam(required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
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
    public Object add(@RequestBody Order order) throws MyException {
        if (order == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        orderService.add(order);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody Order order) throws MyException {
        if (order == null || order.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        orderService.update(order);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody Order order) throws MyException {
        if (order == null || order.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        orderService.delete(order.getId());
        return new ResultBean();
    }

    /**
     * 获取用户订单
     * @return
     * @throws MyException
     */
    @RequestMapping(value = "/getUserOrder", method = RequestMethod.GET)
    public Object getUserOrder() throws MyException {
        List<Order> orders = orderService.getUserOrder(getUserId());
        return new ResultBean(orders);
    }
}
