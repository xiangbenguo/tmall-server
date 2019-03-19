package com.tmall.service.impl;

import com.tmall.dao.OrderMapper;
import com.tmall.dao.ProductMapper;
import com.tmall.entity.Order;
import com.tmall.entity.Product;
import com.tmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Order> list() {
        return orderMapper.list();
    }

    @Override
    public Order get(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public Order add(Order order) {
        orderMapper.insertSelective(order);

        return orderMapper.selectByPrimaryKey(order.getId());
    }

    @Override
    public void update(Order order) {
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public void delete(Integer id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Order> getUserOrder(Integer uid) {
        return orderMapper.getUserOrder(uid);
    }

    @Override
    public void pay(Order order) {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        order.setPayTime(dateFormat.format(date));
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public void theDelivery(Order order) {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        order.setDeliveryTime(dateFormat.format(date));
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public void confirmGoods(Order order) {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        order.setConfirmTime(dateFormat.format(date));
        orderMapper.updateByPrimaryKeySelective(order);

        Integer monthSales = productMapper.selectByPrimaryKey(order.getPid()).getMonthSales();
        Product product = new Product();
        product.setId(order.getPid());
        product.setMonthSales(monthSales + 1);

        productMapper.updateByPrimaryKeySelective(product);

    }

    @Override
    public void complete(Order order) {

        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public List<Order> userOrderStatus(Integer uid, Integer status) {
        return orderMapper.userOrderStatus(uid, status);
    }
}
