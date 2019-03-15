package com.tmall.dao;


import com.tmall.entity.Product;
import com.tmall.entity.tool.ProductQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> list(@Param("query")ProductQuery query);

    List<Product> getCidList(Integer cid);
}