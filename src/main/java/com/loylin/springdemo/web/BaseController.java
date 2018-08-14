package com.loylin.springdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class BaseController {

    @RequestMapping(value = {"","/"})
    public String getIndex(){
        return "index";
    }

}
