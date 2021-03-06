package com.tmall.dao;


import com.tmall.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> list();

    List<Order> getUserOrder(Integer uid);

    List<Order> userOrderStatus(@Param("uid") Integer uid, @Param("status") Integer status);
}