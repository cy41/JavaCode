package com.example.demo.entity;

import org.apache.ibatis.type.Alias;

@Alias("Orders")
public class Orders {
    private int id;
    private int user_id;
    private User user;

    /*public Orders(int id, int user_id){
        this.id = id;
        this.user_id = user_id;
    }
    public Orders(int id, int user_id, User user) {
        this.id = id;
        this.user_id = user_id;
        this.user = user;
    }*/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
