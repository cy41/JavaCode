<%@ page import="java.sql.Connection" %>
<%@ page import="link.MyCon" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <%
      Connection conn= MyCon.getCon();
      if(conn!=null){
        out.println("success");
        conn.close();
      }
      else{
        out.println("fail");
      }
    %>
  </body>
</html>