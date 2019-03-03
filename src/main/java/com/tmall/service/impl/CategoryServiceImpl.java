package com.tmall.service.impl;

import com.tmall.dao.CategoryMapper;
import com.tmall.entity.Category;
import com.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/2.
 */

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public Category get(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Category category) {
        categoryMapper.insertSelective(category);
    }

    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public void delete(Integer id) {
        categoryMapper.deleteByPrimaryKey(id);
    }
}
