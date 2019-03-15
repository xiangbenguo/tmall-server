package com.tmall.controller;

import com.tmall.common.GlobalHandler;
import com.tmall.common.CodeMessageDef;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.Product;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by yangxiong on 2019/2/17.
 */
@CrossOrigin(allowCredentials = "true", value = "http://localhost:8081")
@RestController
@RequestMapping(value = "/product")
public class ProductController extends GlobalHandler {

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
     * @throws MyException
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam (required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        Product product = productService.get(id);
        return new ResultBean(product);
    }

    /**
     * 添加产品
     * @param product
     * @return
     * @throws MyException
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Product product) throws MyException {
        if (product == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        productService.add(product);
        return new ResultBean();
    }

    /**
     * 修改产品
     * @param product
     * @return
     * @throws MyException
     */
    @RequestMapping(value = "/update", method =  RequestMethod.POST)
    public Object update(@RequestBody Product product) throws MyException {
        if (product == null || product.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        productService.update(product);
        return  new ResultBean();
    }

    /**
     * 删除产品
     * @param product
     * @return
     * @throws MyException
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete (@RequestBody Product product) throws MyException {
        if (product == null || product.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        productService.delete(product.getId());
        return new ResultBean();
    }

    @RequestMapping(value = "getCidList", method = RequestMethod.GET)
    public Object getCidList (@RequestParam (required = false) Integer cid) throws MyException {
        if (cid == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        List<Product> list = productService.getCidList(cid);
        return new ResultBean(list);
    }
}
