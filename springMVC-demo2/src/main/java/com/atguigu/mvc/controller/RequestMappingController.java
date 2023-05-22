package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.POST, RequestMethod.GET},
            params = {"username"})
    public String success() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }

    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut() {
        return "success";
    }


    @RequestMapping(value = "/testParamAndHeaders", params = {"username", "password!=123456"},
            headers = "Host=localhost:8080")
    public String testParamAndHeader() {
        return "success";
    }

    //    @RequestMapping("/a?a/testAnt")
//    @RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("id:" + id + " username:" + username);
        return "success";
    }


    @RequestMapping("/testBean")
    public String testPOJO(User user) {
        System.out.println(user);
        return "success";
    }
}
