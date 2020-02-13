package com.example.demo.dao;

import com.example.demo.entity.Orders;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    public User getUserOrders(int id);//通过id获取用户订单信息;
    public User getUser(int id);//通过id获取用户信息;
    //public int setUser(int id,String password);//修改用户信息;
    //public int deleteOrders(int user_id);//删除指定用户的订单;
    public Orders getOrdersById(int id);//通过订单号获取用户信息;
}
