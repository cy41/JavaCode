<%@ page import="dao.Work" %><%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/12/29
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>buy</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String food=request.getParameter("food");
        Work work=new Work();
        session.setAttribute("food",food);
        if(work.getFood(food)){
    %>
    <%= food%>已经准备好了，可以做菜了
    <%
        response.setHeader("refresh","3;URL=cookfood.jsp");
    %>
    <%
        }
        else{
            out.println("材料不够了，我立马去买！");
            response.setHeader("refresh","3;URL=cookfood.jsp");
        }
    %>

</body>
</html>
