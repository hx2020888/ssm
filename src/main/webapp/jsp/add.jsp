<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2020/2/5
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add" method="get">
    用户名:<input type="text" name="name"><br><br>
    密  码:<input type="text" name="password"><br><br>
            <input type="submit" value="提交">
</form>
</body>
</html>
