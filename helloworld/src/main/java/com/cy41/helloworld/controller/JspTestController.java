package com.cy41.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jsptest")
public class JspTestController {

    @GetMapping("/test")
    public String Ask(){
        return "/file/hello";
    }
    @PostMapping("/asdf")
    @ResponseBody
    public String hello(@RequestParam("hello") String name){
        System.out.println(name);
        return name;
    }
}
