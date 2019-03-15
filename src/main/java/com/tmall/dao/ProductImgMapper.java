package com.tmall.dao;


import com.tmall.entity.ProductImg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    ProductImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);

    List<ProductImg> productImgList(Integer id);

    List<ProductImg> getPidList(Integer pid);

    List<ProductImg> listByPids(@Param("pids") List<Integer> pids);
}
