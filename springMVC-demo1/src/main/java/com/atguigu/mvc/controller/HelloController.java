package com.atguigu.mvc.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@ComponentScan("com.atguigu.mvc.controller")
@Controller
public class HelloController {
//    “/”--> /WEB-INF/templates/index.html
    @RequestMapping("/")
    public String index() {
//        返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
