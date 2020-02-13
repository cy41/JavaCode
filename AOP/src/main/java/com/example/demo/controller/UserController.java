package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService us = null;

    @ResponseBody
    @RequestMapping("/print")
    public User printUser(int id,String name){
        User user=new User();
        user.setId(id);
        user.setName(name);
        us.printUser(user);
        //User user=null;
        us.printUser(user);
        return user;
    }

    @RequestMapping("/go")
    @ResponseBody
    public String go(){
        return "hello";
    }
}
