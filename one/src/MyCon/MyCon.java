package MyCon;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyCon {
    private static String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=CTT&autoReconnect=true&failOverReadOnly=false";
    private static String username="root";
    private static String password="123456";
    public static Connection getCon() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,username,password);
    }
}