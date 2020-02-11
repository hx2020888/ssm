<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2020/2/7
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/update" method="get">
    编号：<input type="text" name="id" value="${user.id}"><br><br>
    用户名:<input type="text" name="name" value="${user.name}"><br><br>
    密  码:<input type="text" name="password" value="${user.password}"><br><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
