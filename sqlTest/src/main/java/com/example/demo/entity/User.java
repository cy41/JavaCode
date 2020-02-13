package com.example.demo.entity;

import org.apache.ibatis.type.Alias;

import java.util.ArrayList;
import java.util.List;

@Alias("User")
public class User {
    private int id;
    private String username;
    private String realname;
    private String password;
    private List<Orders> list=new ArrayList<>();
    public List<Orders> getList() {
        return list;
    }

    public void setList(Orders orders) {
        list.add(orders);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
