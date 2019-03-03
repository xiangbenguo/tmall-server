package com.tmall.service;

import com.tmall.entity.Category;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/2.
 */
public interface CategoryService {
    List<Category> list();

    Category get(Integer id);

    void add(Category category);

    void update(Category category);

    void delete(Integer id);
}
