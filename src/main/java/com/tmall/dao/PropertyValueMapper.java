package com.tmall.dao;


import com.tmall.entity.PropertyValue;

import java.util.List;

public interface PropertyValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PropertyValue record);

    int insertSelective(PropertyValue record);

    PropertyValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PropertyValue record);

    int updateByPrimaryKey(PropertyValue record);

    List<PropertyValue> list();

    List<PropertyValue> getPidValueList(Integer pid);

    void deletePidList(Integer id);
}