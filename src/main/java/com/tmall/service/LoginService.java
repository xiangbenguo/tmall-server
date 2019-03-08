package com.tmall.service;

import com.tmall.common.MyException;
import com.tmall.entity.User;

public interface LoginService {
    User login(User user) throws MyException;
}
