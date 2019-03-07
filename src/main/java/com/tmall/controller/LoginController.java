package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalExceptionHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.User;
import com.tmall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController extends GlobalExceptionHandler {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/loginVerify",method = RequestMethod.GET)
    public Object loginVerify(@RequestBody User user) throws MyException {
        if (user == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        loginService.login(user);
        return new ResultBean();
    }
}
