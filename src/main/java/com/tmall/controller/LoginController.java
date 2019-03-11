package com.tmall.controller;

import com.tmall.common.GlobalHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.User;
import com.tmall.service.LoginService;
import com.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin(allowCredentials = "true", value = "http://localhost:8081")
@RestController
@RequestMapping("/login")
public class LoginController extends GlobalHandler {

    @Autowired
    LoginService loginService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/loginVerify",method = RequestMethod.POST)
    public Object loginVerify(@RequestBody User user, HttpServletRequest request) throws MyException {
        HttpSession session = request.getSession();

        User userInDB = loginService.login(user);
        session.setAttribute("user", userInDB);
        return new ResultBean();
    }

    /**
     * 获取当前登录的用户
     * @return
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Object getSessionUser() throws MyException {
        User user = userService.get(getUserId());
        return new ResultBean(user);
    }
}
