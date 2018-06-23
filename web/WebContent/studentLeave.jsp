<%--
  Created by IntelliJ IDEA.
  User: So
  Date: 2018/6/15
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>insert</title>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入jQuery核心js文件 -->
    <script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
    <!-- 引入BootStrap核心js文件 -->
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-12">
<table class="table table-hover">
    <tr>
        <td>姓名</td>
        <td>${student.sname}</td>
    </tr>
    <form action="/leave/insert" method="post">
        <%--<input type="hidden" name="id" value="${student.id}">--%>
        <tr>
            <td>请假时间</td>
            <td>截止时间</td>
            <td>请假类型</td>
        </tr>
        <tr>
            <input type="hidden" name="id" value="${student.majorId}">
            <td><input type="text" name="starttime" placeholder="yyyy-MM-dd HH:mm:ss"></td>
            <td><input type="text" name="endtime" placeholder="yyyy-MM-dd HH:mm:ss"></td>
            <td><input type="text" name="type"></td>
        </tr>
        <tr>
            <td>请假原因</td>
            <td colspan="2"><input type="" name="reason"></td>
        </tr>
        <tr align="center">
            <td colspan="3">
                <button type="submit">insert</button>
            </td>
        </tr>
    </form>
    <a href="/leave/leaveRecordOne?id=${student.id}">查看请假结果</a>
</table>
</div>
    </div>
</div>
</body>
</html>
