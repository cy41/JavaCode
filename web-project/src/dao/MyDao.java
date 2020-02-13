package dao;

import entity.Dept;

import java.sql.Connection;
import java.sql.ResultSet;

public interface MyDao {
    public String query();
    public ResultSet qq(Connection conn,int id) throws Exception;
    public String insert();
    public int ii(Connection conn, Dept dept) throws Exception;
}
