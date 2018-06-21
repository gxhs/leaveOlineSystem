<%--
  Created by IntelliJ IDEA.
  User: So
  Date: 2018/6/15
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>insert</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <td>姓名</td>
        <td>${student.sname}</td>
    </tr>
    <form action="/leave/insert" method="post">
        <input type="hidden" name="id" value="${student.id}">
        <tr>
            <td>请假时间</td>
            <td>截止时间</td>
            <td>请假类型</td>
        </tr>
        <tr>
            <td><input type="text" name="starttime" placeholder="yyyy-MM-dd HH:mm:ss"></td>
            <td><input type="text" name="endtime" placeholder="yyyy-MM-dd HH:mm:ss"></td>
            <td><input type="text" name="type"></td>
        </tr>
        <tr>
            <td>请假原因</td>
            <td colspan="2"><input type="" name="reason"></td>
        </tr>
        <tr align="center">
            <td colspan="3"><button type="submit">insert</button></td>
        </tr>
    </form>
</table>
</body>
</html>
