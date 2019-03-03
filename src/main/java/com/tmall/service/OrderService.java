package com.tmall.service;

import com.tmall.entity.Order;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
public interface OrderService {
    List<Order> list();

    Order get(Integer id);

    void add(Order order);

    void update(Order productImg);

    void delete(Integer id);

    List<Order> getUserOrder(Integer id);
}
