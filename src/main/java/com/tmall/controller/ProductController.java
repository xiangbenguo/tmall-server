package com.tmall.controller;

import com.tmall.common.ResultBean;
import com.tmall.entity.Product;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/2/17.
 */
@RestController
@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * 产品列表
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<Product> list = productService.list();
        return new ResultBean(list);
    }

    /**
     * 根据id获取
     * @param id
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam (required = false) Integer id) {
        if (id == null) {
            // TODO 返回异常
        }
        Product product = productService.get(id);
        return new ResultBean(product);
    }

    /**
     * 添加产品
     * @param product
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Product product) {
        if (product == null) {
            // TODO
        }

        productService.add(product);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method =  RequestMethod.POST)
    public Object update(@RequestBody Product product){
        if (product == null || product.getId() == null) {
            // TODO
        }

        productService.update(product);
        return  new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete (@RequestBody Product product) {
        if (product == null || product.getId() == null) {
            // TODO
        }

        productService.delete(product.getId());
        return new ResultBean();
    }
}
