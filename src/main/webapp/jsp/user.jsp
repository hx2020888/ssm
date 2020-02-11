<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2020/2/5
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <td align="center">编号</td>
        <td align="center">用户名</td>
        <td align="center">密码</td>
        <td align="center">操作</td>
    </tr>
    <c:forEach items="${users}" var="u">
        <tr>
            <td align="center">${u.id}</td>
            <td align="center">${u.name}</td>
            <td align="center">${u.password}</td>
            <td align="center">
                <a href="${pageContext.request.contextPath}/selOne?id=${u.id}">修改</a>
                <a href="${pageContext.request.contextPath}/del?id=${u.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4" align="center">
            <a href="${pageContext.request.contextPath}/jsp/add.jsp">添加一条</a>
        </td>
    </tr>
</table>
</body>
</html>
