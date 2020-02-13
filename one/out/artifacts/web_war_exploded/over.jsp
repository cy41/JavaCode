<%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/12/29
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>over</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String need=(String)session.getAttribute("need");
        out.println(need+"非常好吃，下次还吃！");
    %>
</body>
</html>
