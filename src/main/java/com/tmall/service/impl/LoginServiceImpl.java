package com.tmall.service.impl;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.MyException;
import com.tmall.dao.UserMapper;
import com.tmall.entity.User;
import com.tmall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) throws MyException {
        if (user == null || StringUtils.isEmpty(user.getUsername())
                || StringUtils.isEmpty(user.getPassword())) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        User userInDB = userMapper.getUserByUserName(user.getUsername());
        if (StringUtils.isEmpty(userInDB.getUsername())) {
            throw new MyException(CodeMessageDef.USERNAME_ERROR);
        }

        if (StringUtils.isEmpty(userInDB.getPassword())
                || !userInDB.getPassword().equals(user.getPassword())) {
            throw new MyException(CodeMessageDef.USER_PASSWORD_ERROR);
        }

        return userInDB;
    }
}
