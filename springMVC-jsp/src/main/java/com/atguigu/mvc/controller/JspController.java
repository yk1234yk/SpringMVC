package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
    @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping("ForwardSuccess")
    public String testSuccess(){
        return "forward:success";
    }

    @RequestMapping("RedirectSuccess")
    public String RedirectSuccess(){
        return "redirect:success";
    }
}
