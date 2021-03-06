package com.tmall.service;

import com.tmall.entity.Product;
import com.tmall.entity.tool.ProductQuery;

import java.util.List;

/**
 * Created by xiangbenguo on 2019/2/17.
 */
public interface ProductService {
    List<Product> list(ProductQuery query);

    Product get(Integer id);

    void add(Product product);

    void update(Product product);

    void delete(Integer id);

    List<Product> getCidList(Integer cid);
}
