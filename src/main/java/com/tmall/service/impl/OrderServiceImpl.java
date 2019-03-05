package com.tmall.service.impl;

import com.tmall.dao.OrderMapper;
import com.tmall.entity.Order;
import com.tmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> list() {
        return orderMapper.list();
    }

    @Override
    public Order get(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Order order) {
        orderMapper.insertSelective(order);
    }

    @Override
    public void update(Order productImg) {
        orderMapper.updateByPrimaryKeySelective(productImg);
    }

    @Override
    public void delete(Integer id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Order> getUserOrder(Integer uid) {
        return orderMapper.getUserOrder(uid);
    }
}
