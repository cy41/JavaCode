package com.cy41.helloworld.myservice.impl;

import com.cy41.helloworld.mydao.Database;
import com.cy41.helloworld.myuse.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements com.cy41.helloworld.myservice.UserService {

    @Autowired
    private Database ab;
    @Override
    public boolean insert(User user) {
        return ab.insert(user);
    }

    @Override
    public boolean delById(String id) {
        return ab.delById(id);
    }

    @Override
    public boolean delAll() {
        return ab.delAll();
    }

    @Override
    public boolean upd(User user) {
        return ab.upd(user);
    }

    @Override
    public User findById(String id) {
        return ab.findById(id);
    }

    @Override
    public List<User> findAll() {
        return ab.findAll();
    }
}
