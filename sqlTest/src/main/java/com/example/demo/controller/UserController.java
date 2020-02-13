package com.example.demo.controller;

import com.example.demo.entity.Orders;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService us;

    @GetMapping("/getOrdersById/{id}")
    @ResponseBody
    public Orders getOrdersById(@PathVariable("id") int id){
        System.out.println(id);

        return us.getOrdersById(id);
    }

    @GetMapping("/getUserOrders/{id}")
    @ResponseBody
    public User getUserOrders(@PathVariable("id") int id){
        System.out.println(id);
        return us.getUserOrders(id);
    }
}
