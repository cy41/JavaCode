package service;

import dao.MyDao;
import dao.MyDaoImp;
import entity.Dept;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MyServiceImp implements  MyService{
    @Override
    public List<Dept> query(Connection conn, int id) throws Exception {
        MyDao md=new MyDaoImp();
        ResultSet rs=md.qq(conn,id);
        List<Dept> list=new ArrayList<>();
        while(rs.next()){
            Dept dept=new Dept();
            dept.setDeptno(rs.getInt("deptno"));
            dept.setDname(rs.getString("dname"));
            dept.setLoc(rs.getString("loc"));
            list.add(dept);
        }
        rs.close();
        return list;
    }

    @Override
    public int insert(Connection conn, Dept dept) throws Exception {
        MyDao md=new MyDaoImp();
        return md.ii(conn,dept);
    }
}
