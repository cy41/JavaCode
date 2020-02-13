package com.cy41.helloworld.mydao;

import com.cy41.helloworld.myuse.User;

import java.util.*;

public interface Database {
    public boolean insert(User user);
    public User findById(String id);
    public List<User> findAll();
    public boolean delById(String id);
    public boolean upd(User user);
    public boolean delAll();


}
