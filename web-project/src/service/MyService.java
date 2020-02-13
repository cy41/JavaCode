package service;

import entity.Dept;

import java.sql.Connection;
import java.util.List;

public interface MyService {
    public List<Dept> query(Connection conn,int id) throws Exception;
    public int insert(Connection conn,Dept dept) throws Exception;
}
