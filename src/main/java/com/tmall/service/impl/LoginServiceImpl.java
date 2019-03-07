package com.tmall.service.impl;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.MyException;
import com.tmall.dao.UserMapper;
import com.tmall.entity.User;
import com.tmall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void login(User user) throws MyException {
        User userName = userMapper.getUserByUserName(user.getUsername());
        if (userName == null) {
            throw new MyException(CodeMessageDef.USERNAME_ERROR);
        }

        if (userName.getPassword() != user.getPassword()) {
            throw new MyException(CodeMessageDef.USERPASSWORD_ERROR);
        }
    }
}
