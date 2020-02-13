package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.Orders;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao ud;

    public User getUserOrders(int id){
        return ud.getUserOrders(id);
    }

    public Orders getOrdersById(int id){
        return ud.getOrdersById(id);
    }
}
