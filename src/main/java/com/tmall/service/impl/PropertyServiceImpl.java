package com.tmall.service.impl;

import com.tmall.dao.PropertyMapper;
import com.tmall.entity.Property;
import com.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/2.
 */
@Service ("propertyService")
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public List<Property> list() {
        return propertyMapper.list();
    }

    @Override
    public Property get(Integer id) {
        return propertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Property property) {
        propertyMapper.insertSelective(property);
    }

    @Override
    public void update(Property property) {
        propertyMapper.updateByPrimaryKeySelective(property);
    }

    @Override
    public void delete(Integer id) {
        propertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Property> getCidList(Integer cid) {
        return propertyMapper.getCidList(cid);
    }
}
