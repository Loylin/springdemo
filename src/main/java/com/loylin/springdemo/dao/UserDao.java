package com.loylin.springdemo.dao;

import com.loylin.springdemo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User queryUser(@Param("account") String account, @Param("password") String password);
}
