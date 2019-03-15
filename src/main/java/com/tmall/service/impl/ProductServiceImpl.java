package com.tmall.service.impl;

import com.tmall.dao.ProductImgMapper;
import com.tmall.dao.ProductMapper;
import com.tmall.entity.Product;
import com.tmall.entity.ProductImg;
import com.tmall.entity.tool.ProductQuery;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yangxiong on 2019/2/17.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductImgMapper productImgMapper;

    @Override
    public List<Product> list(ProductQuery query) {
        List<Product> list = productMapper.list(query);

        List<Integer> pidList = list.stream().map(Product::getId).collect(Collectors.toList());
        List<ProductImg> images = productImgMapper.listByPids(pidList);

        list.forEach(product -> {
            Stream<ProductImg> stream = images.stream().filter(img -> img.getPid().equals(product.getId()));
            product.setImgs(stream.collect(Collectors.toList()));
        });

        return list;
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

    @Override
    public List<Product> getCidList(Integer cid) {
        return productMapper.getCidList(cid);
    }
}
