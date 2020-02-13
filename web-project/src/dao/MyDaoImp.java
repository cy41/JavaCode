package dao;

import entity.Dept;
import link.MyCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyDaoImp implements MyDao{

    @Override
    public String query() {
        return "select * from dept where deptno = ";
    }

    @Override
    public ResultSet qq(Connection conn,int id) throws Exception {
        return conn.prepareStatement(query()+id).executeQuery();
    }

    @Override
    public String insert() {
        return "insert into dept(deptno,dname,loc) values(?,?,?)";
    }

    @Override
    public int ii(Connection conn, Dept dept) throws Exception {
        PreparedStatement ps=conn.prepareStatement(insert());
        ps.setInt(1,dept.getDeptno());
        ps.setString(2,dept.getDname());
        ps.setString(3,dept.getLoc());
        int row=ps.executeUpdate();
        ps.close();
        return row;
    }
}
