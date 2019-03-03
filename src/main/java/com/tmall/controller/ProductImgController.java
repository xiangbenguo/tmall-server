package com.tmall.controller;

import com.tmall.common.ResultBean;
import com.tmall.entity.ProductImg;
import com.tmall.service.ProductImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@RestController
@RequestMapping(value = "productImg")
public class ProductImgController {
    @Autowired
    ProductImgService productImgService;

    /**
     * 产品列表
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<ProductImg> list = productImgService.list();
        return new ResultBean(list);
    }

    /**
     * 根据id获取
     * @param id
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam(required = false) Integer id) {
        if (id == null) {
            // TODO 返回异常
        }
        ProductImg ProductImg = productImgService.get(id);
        return new ResultBean(ProductImg);
    }

    /**
     * 添加产品
     * @param productImg
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody ProductImg productImg, Integer status) {
        if (productImg == null) {
            // TODO
        }

        productImgService.add(productImg);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method =  RequestMethod.POST)
    public Object update(@RequestBody ProductImg productImg){
        if (productImg == null || productImg.getId() == null) {
            // TODO
        }

        productImgService.update(productImg);
        return  new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete (@RequestBody ProductImg productImg) {
        if (productImg == null || productImg.getId() == null) {
            // TODO
        }

        productImgService.delete(productImg.getId());
        return new ResultBean();
    }
}
