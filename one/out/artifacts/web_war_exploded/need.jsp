<%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/12/29
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>need</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
    %>
    <form method="post" action="work.jsp">
        你想吃什么：<input name="need" type="text"/>
        <br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
