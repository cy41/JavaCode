<%@ page import="entity.Worker" %><%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/12/29
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookfood</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String food=(String)session.getAttribute("food");
        String need=(String)session.getAttribute("need");
        Worker worker=new Worker();
        worker.setFood(food);
        worker.setNeed(need);
        String res=worker.cookFood();
        out.println(res);
        response.setHeader("refresh","3;URL=over.jsp");
    %>
</body>
</html>
