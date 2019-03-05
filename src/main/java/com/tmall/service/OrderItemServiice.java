package com.tmall.service;


import com.tmall.entity.OrderItem;

import java.util.List;

public interface OrderItemServiice {
    List<OrderItem> list();

    OrderItem get(Integer id);

    void add(OrderItem orderItem);

    void update(OrderItem orderItem);

    void delete(Integer id);

    List<OrderItem> getOrderItem(Integer oid);
}
