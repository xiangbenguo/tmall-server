package com.tmall.service;

import com.tmall.common.MyException;
import com.tmall.entity.User;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
public interface UserService {
    List<User> list();

    User get(Integer id);

    void add(User user) throws MyException;

    void update(User user);

    void delete(Integer id);

    User getUserByUserName(String userName);
}
