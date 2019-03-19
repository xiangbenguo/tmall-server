package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.User;
import com.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@CrossOrigin(allowCredentials = "true",value = {"http://localhost:8081", "http://localhost:8082"})
@RestController
@RequestMapping(value = "/user")
public class UserController extends GlobalHandler {
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

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get() throws MyException {

        User user = userService.get(getUserId());
        return new ResultBean(user);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody User user) throws MyException {
        if (user == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        userService.add(user);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody User user) throws MyException {
        if (user == null || user.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        userService.update(user);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody User user) throws MyException {
        if (user == null || user.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        userService.delete(user.getId());
        return new ResultBean();
    }
}
