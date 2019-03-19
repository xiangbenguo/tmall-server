package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.ProductImg;
import com.tmall.service.ProductImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@CrossOrigin(allowCredentials = "true",value = {"http://localhost:8081", "http://localhost:8082"})
@RestController
@RequestMapping(value = "/productImg")
public class ProductImgController extends GlobalHandler {
    @Autowired
    ProductImgService productImgService;

    /**
     * 图片列表
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
    public Object get(@RequestParam(required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        ProductImg ProductImg = productImgService.get(id);
        return new ResultBean(ProductImg);
    }

    /**
     * 添加图片
     * @param productImg
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody ProductImg productImg) throws MyException {
        if (productImg == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        productImgService.add(productImg);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method =  RequestMethod.POST)
    public Object update(@RequestBody ProductImg productImg) throws MyException {
        if (productImg == null || productImg.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        productImgService.update(productImg);
        return  new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete (@RequestBody ProductImg productImg) throws MyException {
        if (productImg == null || productImg.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        productImgService.delete(productImg.getId());
        return new ResultBean();
    }

    @RequestMapping(value = "/getPidList", method = RequestMethod.GET)
    public Object getPidList (@RequestParam(required = false) Integer pid) throws MyException {
        if (pid == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        List<ProductImg> list = productImgService.getPidList(pid);
        return new ResultBean(list);
    }
}
