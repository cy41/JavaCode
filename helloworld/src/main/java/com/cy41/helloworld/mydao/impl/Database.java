package com.cy41.helloworld.mydao.impl;

import com.cy41.helloworld.myuse.User;
import org.springframework.stereotype.Repository;
import java.util.*;
/*
* @Repository 用于标注这是一个DAO类
* */
@Repository
public class Database implements com.cy41.helloworld.mydao.Database {
    private List<User> list=new ArrayList<User>();

    public Database(){
        list.add(new User("123","123","cy"));
        list.add(new User("456","456","lt"));
    }
    @Override
    public User findById(String id) {
        for(User user:list){
            if(user.getId().equals(id)) return user;
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return list;
    }

    @Override
    public boolean delById(String id) {
        for(User user:list){
            if(user.getId().equals(id)) {
                list.remove(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean upd(User user) {
        for(User a:list){
            if(a.getId().equals(user.getId())){
                list.add(user);
                list.remove(a);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delAll() {
        list.clear();
        return true;
    }

    @Override
    public boolean insert(User user) {
        for(User a:list){
            if(a.compare(user)) return false;
        }
        list.add(user);
        return true;
    }
}
