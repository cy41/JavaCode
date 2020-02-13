package com.cy41.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lt")
public class TextHello {
    @RequestMapping("/fff")
    public String text(){
        return "hello";
    }
}
