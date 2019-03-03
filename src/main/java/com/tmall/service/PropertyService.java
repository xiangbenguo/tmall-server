package com.tmall.service;

import com.tmall.entity.Property;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/2.
 */
public interface PropertyService {
    List<Property> list();

    Property get(Integer id);

    void add(Property property);

    void update(Property property);

    void delete(Integer id);
}
