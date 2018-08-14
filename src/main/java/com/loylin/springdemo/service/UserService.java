package com.loylin.springdemo.service;

import com.loylin.springdemo.dao.UserDao;
import com.loylin.springdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean queryLogin(String account, String password){
        User user = userDao.queryUser(account, password);
        return user != null;
    }
}
