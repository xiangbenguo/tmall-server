package com.tmall.controller;

import com.tmall.common.ResultBean;
import com.tmall.entity.User;
import com.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 产品列表
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<User> list = userService.list();
        return new ResultBean(list);
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public Object get(@RequestParam(required = false) Integer id) {
        if (id == null) {
            // TODO
        }

        User user = userService.get(id);
        return new ResultBean(user);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody User user) {
        if (user == null) {
            // TODO
        }

        userService.add(user);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody User user) {
        if (user == null || user.getId() == null) {
            // TODO
        }

        userService.update(user);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody User user) {
        if (user == null || user.getId() == null) {
            // TODO
        }

        userService.delete(user.getId());
        return new ResultBean();
    }
}
