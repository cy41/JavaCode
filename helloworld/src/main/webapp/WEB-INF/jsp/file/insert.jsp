<%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/11/14
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>insert</title>
</head>
<body>
    <form action="/insert" method="post">
        <table border="1">
            <tr>
                <td>id: &nbsp;</td>
                <td><input name="id" type="text"/></td>
            </tr>
            <tr>
                <td>name: &nbsp;</td>
                <td><input name="name" type="text"/></td>
            </tr>
            <tr>
                <td>age: &nbsp;</td>
                <td><input name="age" type="text"/></td>
            </tr>
            <tr>
                <td><input type="submit"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
