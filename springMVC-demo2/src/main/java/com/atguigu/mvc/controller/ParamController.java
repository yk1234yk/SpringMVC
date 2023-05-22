package com.atguigu.mvc.controller;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
//    形参位置的request表示当前请求参数
    public String testServletAPI(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + " password:" + password);
        return "success";
    }

    @RequestMapping("/testParamOne")
    public String testParamOne(String username, String password) {
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }

    @RequestMapping("/testParamTwo")
    public String testParamTwo(@RequestParam(value = "user_name", required = false, defaultValue = "心海") String username, String password, String[] hobby,
                               @RequestHeader("Host") String host, @CookieValue("JSESSIONID")String JSESSIONID) {
//        多请求参数中出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组接收
//        若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:" + username + ",password:" + password + ",hobby:" + Arrays.toString(hobby));
        System.out.println("Host:" + host);
        System.out.println("JSESSIONID:" + JSESSIONID);
        return "success";
    }
}
