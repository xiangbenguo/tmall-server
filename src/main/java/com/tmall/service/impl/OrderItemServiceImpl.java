package com.tmall.service.impl;

import com.tmall.dao.OrderItemMapper;
import com.tmall.entity.OrderItem;
import com.tmall.service.OrderItemServiice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemServiice {

    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> list() {
        return orderItemMapper.list();
    }

    @Override
    public OrderItem get(Integer id) {
        return orderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(OrderItem orderItem) {
        orderItemMapper.insertSelective(orderItem);
    }

    @Override
    public void update(OrderItem orderItem) {
        orderItemMapper.updateByPrimaryKeySelective(orderItem);
    }

    @Override
    public void delete(Integer id) {
        orderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<OrderItem> getOrderItem(Integer oid) {
        return orderItemMapper.getOrderItem(oid);
    }
}
