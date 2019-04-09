package com.tmall.controller;

import com.tmall.common.*;
import com.tmall.entity.Category;
import com.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xiangbenguo on 2019/3/2.
 */
@CrossOrigin(allowCredentials = "true",value = {"http://localhost:8081", "http://localhost:8082"})
@RestController
@RequestMapping(value = "/category")
public class CategoryController extends GlobalHandler {
    @Autowired
    CategoryService categoryService;

    /**
     * 分类列表
     * @return
     */

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<Category> list = categoryService.list();
        return new ResultBean(list);
    }

    /**
     * 根据id获取
     * @param id
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public  Object get(@RequestParam(required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        Category category = categoryService.get(id);
        return new ResultBean(category);
    }

    /**
     * 添加分类
     * @param category
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Category category) throws MyException{
        if (category == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        categoryService.add(category);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody Category category) throws MyException {
        if (category == null || category.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        categoryService.update(category);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody Category category) throws MyException {
        if (category == null || category.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        categoryService.delete(category.getId());
        return new ResultBean();
    }
}
