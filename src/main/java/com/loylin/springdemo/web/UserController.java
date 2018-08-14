package com.loylin.springdemo.web;

import com.loylin.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"", "/", "/login"})
    public String login(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("queryLogin")
    public String queryLogin(String account, String password){
        if (account == null || account.length() == 0
                || password == null || password.length() == 0){
            return "账号或密码为空!";
        }
        boolean isLogin = userService.queryLogin(account, password);
        return String.valueOf(isLogin);
    }
}
