package com.tmall.service;

import com.tmall.entity.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    List<PropertyValue> list();

    PropertyValue get(Integer id);

    void add(PropertyValue propertyValue);

    void update(PropertyValue propertyValue);

    void delete(Integer id);
}
