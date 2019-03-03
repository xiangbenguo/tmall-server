package com.tmall.service;

import com.tmall.entity.ProductImg;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
public interface ProductImgService {
    List<ProductImg> list();

    ProductImg get(Integer id);

    void add(ProductImg productImg);

    void update(ProductImg productImg);

    void delete(Integer id);

    List<ProductImg> getProductImg(Integer id);
}
