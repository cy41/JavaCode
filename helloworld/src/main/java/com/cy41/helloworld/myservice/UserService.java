package com.cy41.helloworld.myservice;

import com.cy41.helloworld.myuse.User;

import java.util.List;

public interface UserService {
    public boolean insert(User user);
    public boolean delById(String id);
    public boolean delAll();
    public boolean upd(User user);
    public User findById(String id);
    public List<User> findAll();
}
