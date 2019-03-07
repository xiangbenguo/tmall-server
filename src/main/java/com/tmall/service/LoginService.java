package com.tmall.service;

import com.tmall.common.MyException;
import com.tmall.entity.User;

public interface LoginService {
    void login(User user) throws MyException;
}
