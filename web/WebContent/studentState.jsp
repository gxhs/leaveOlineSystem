<%--
  Created by IntelliJ IDEA.
  User: GengXiaohu
  Date: 2018/6/22
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table table-hover">
    <tr>
        <th>编号</th>
        <th>请假时间</th>
        <th>截止时间</th>
        <th>审批人</th>
        <th>请假类型</th>
        <th>原因</th>
        <th>状态</th>
    </tr>
        <tr>
            <th>${leave.id}</th>
            <th><fmt:formatDate value="${leave.starttime}" pattern="yyyy-MM-dd HH:mm:ss"/></th>
            <th><fmt:formatDate value="${leave.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/></th>
            <th>${leave.approver}</th>
            <th>${leave.type}</th>
            <th>${leave.reason}</th>
            <th>${leave.state}</th>
        </tr>
</table>
</body>
</html>
