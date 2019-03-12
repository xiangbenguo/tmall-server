package com.tmall.service.impl;

import com.tmall.dao.ProductImgMapper;
import com.tmall.entity.ProductImg;
import com.tmall.service.ProductImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */

@Service("productImgService")
public class ProductImgServiceImpl implements ProductImgService {

    @Autowired
    ProductImgMapper productImgMapper;

    @Override
    public List<ProductImg> list() {
        return null;
    }

    @Override
    public ProductImg get(Integer id) {
        return null;
    }

    @Override
    public void add(ProductImg productImg) {
        productImgMapper.insertSelective(productImg);
    }

    @Override
    public void update(ProductImg productImg) {
        productImgMapper.updateByPrimaryKeySelective(productImg);
    }

    @Override
    public void delete(Integer id) {
        productImgMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProductImg> getProductImg(Integer id) {
        return productImgMapper.productImgList(id);
}

    @Override
    public List<ProductImg> getPidList(Integer pid) {
        return productImgMapper.getPidList(pid);
    }
}
