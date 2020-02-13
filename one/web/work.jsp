<%--
  Created by IntelliJ IDEA.
  User: 11979
  Date: 2019/12/29
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>work</title>
</head>
<body>
    <form action="buy.jsp" method="post">
        <%
            request.setCharacterEncoding("UTF-8");
            String need=request.getParameter("need");
            session.setAttribute("need",need);
            out.println("厨师需要做"+need);
        %>
        厨师需要的材料<input type="text" name="food"/>
        <br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
