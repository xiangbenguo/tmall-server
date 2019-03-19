package com.tmall.service;

import com.tmall.entity.Order;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
public interface OrderService {
    List<Order> list();

    Order get(Integer id);

    Order add(Order order);

    void update(Order order);

    void delete(Integer id);

    List<Order> getUserOrder(Integer uid);

    void pay(Order order);

    void theDelivery(Order order);

    void confirmGoods(Order order);

    void complete(Order order);

    List<Order> userOrderStatus(Integer uid, Integer status);
}
