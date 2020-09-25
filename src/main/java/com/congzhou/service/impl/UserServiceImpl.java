package com.congzhou.service.impl;

import com.congzhou.dao.UserDao;
import com.congzhou.model.User;
import com.congzhou.service.UserService;
import com.congzhou.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private Logger logger;

    // 统一使用基于构造函数方法注入bean，否则易出现使用时值为null的情况
    @Autowired
    public UserServiceImpl(UserDao userDao, Logger logger) {
        this.userDao = userDao;
        this.logger = logger;
    }

    @Override
    public void say(){
        System.out.println("hey yeah");
    }

    @Override
    public List<User> getList(){
        logger.log("获取用户列表");
        return userDao.getList();
    }
}
