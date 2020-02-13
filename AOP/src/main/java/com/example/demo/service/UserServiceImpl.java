package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void printUser(User user) {
        if(user==null){
            throw new RuntimeException("null!!!!!");
        }
        System.out.println(user.getId());
        System.out.println(user.getName());

    }
}
