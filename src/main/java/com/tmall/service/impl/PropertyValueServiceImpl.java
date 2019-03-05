package com.tmall.service.impl;

import com.tmall.dao.PropertyValueMapper;
import com.tmall.entity.PropertyValue;
import com.tmall.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("propertyValueService")
public class PropertyValueServiceImpl implements PropertyValueService {

    @Autowired
    PropertyValueMapper propertyValueMapper;

    @Override
    public List<PropertyValue> list() {
        return propertyValueMapper.list();
    }

    @Override
    public PropertyValue get(Integer id) {
        return propertyValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(PropertyValue propertyValue) {
        propertyValueMapper.insertSelective(propertyValue);
    }

    @Override
    public void update(PropertyValue propertyValue) {
        propertyValueMapper.updateByPrimaryKeySelective(propertyValue);
    }

    @Override
    public void delete(Integer id) {
        propertyValueMapper.deleteByPrimaryKey(id);
    }
}
