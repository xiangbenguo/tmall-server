package com.tmall.dao;


import com.tmall.entity.Category;
import com.tmall.entity.Property;

import java.util.List;

public interface PropertyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);

    List<Property> list();

    List<Property> getCidList(Integer cid);
}