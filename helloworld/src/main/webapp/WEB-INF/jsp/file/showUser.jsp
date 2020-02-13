<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/10/31
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showUser</title>
</head>

<body>
<center>
    <form action="/select" method="get">
        <table border="1">
            <tr>
                <td>name:</td>
                <td><c:out value="${user.name}"></c:out></td>

            </tr>
            <tr>
                <td>id:</td>
                <td><c:out value="${user.id}"></c:out></td>
            </tr>
            <tr>
                <td>age:</td>
                <td><c:out value="${user.age}"></c:out></td>
            </tr>
            <tr>
                <td><input value="返回" type="submit"/></td>
            </tr>
        </table>

    </form>
</center>
</body>
</html>
