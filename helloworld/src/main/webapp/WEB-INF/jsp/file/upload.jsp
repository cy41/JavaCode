<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传</title>
</head>
<body>
<center>
<form method="post"
      action="./multipart" enctype="multipart/form-data">
    <%
        for(int i=1;i<5;++i){
    %>
    <input type="file" name="photo" value="请选择上传的文件" />
    <br></br>
    <%
        }
    %>
    <input type="submit" value="提交" />
</form>
</center>
</body>
</html>
