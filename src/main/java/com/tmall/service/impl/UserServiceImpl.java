package com.tmall.service.impl;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.MyException;
import com.tmall.dao.UserMapper;
import com.tmall.entity.User;
import com.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User get(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(User user) throws MyException {
        User userInDb = userMapper.getUserByUserName(user.getUsername());
        if (userInDb != null) {
            throw new MyException(CodeMessageDef.USER_ALREADY_EXISTS_ERROR);
        }
        userMapper.insertSelective(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }
}
