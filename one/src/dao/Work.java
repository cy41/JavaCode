package dao;

import MyCon.MyCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Work {

    public String sql(String food){
        return "select * from stock where food = '"+food+"'";
    }
    public boolean getFood(String food) throws Exception {
        MyCon mc=new MyCon();
        Connection conn=MyCon.getCon();
        System.out.println(sql(food));
        ResultSet rs=conn.prepareStatement(sql(food)).executeQuery();
        if(rs.next())
            return true;
        return false;
    }
}
