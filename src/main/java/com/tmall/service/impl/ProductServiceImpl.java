package com.tmall.service.impl;

import com.tmall.dao.ProductMapper;
import com.tmall.entity.Product;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/2/17.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> list() {
        return productMapper.list();
    }

    @Override
    public Product get(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Product product) {
        productMapper.insertSelective(product);
    }

    @Override
    public void update(Product product) {
        productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public void delete(Integer id) {
        productMapper.deleteByPrimaryKey(id);
    }
}
