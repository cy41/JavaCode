<%@ page import="java.util.List" %>
<%@ page import="entity.Dept" %><%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/12/28
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>
<body>
    <%
        List<Dept> list=(List<Dept>) request.getAttribute("list");
    %>
    <table border="1">
        <tr>
            <td>deptno</td>
            <td>dname</td>
            <td>loc</td>
        </tr>
        <%
            for(Dept dept:list){

        %>
            <tr>
                <td><%= dept.getDeptno()%></td>
                <td><%= dept.getDname()%></td>
                <td><%= dept.getLoc()%></td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>
