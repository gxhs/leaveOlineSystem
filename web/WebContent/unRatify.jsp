<%--
  Created by IntelliJ IDEA.
  User: GengXiaohu
  Date: 2018/6/20
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入jQuery核心js文件 -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <!-- 引入BootStrap核心js文件 -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-10">
            <h2>该学生请假记录</h2>
        </div>
        <div class="row">
            <div class="col-md-10">
                <table class="table table-hover">
                    <tr>
                        <th>请假时间</th>
                        <th>截止时间</th>
                        <th>请假类型</th>
                        <th>状态</th>
                    </tr>
                    <c:forEach items="${leaveList1}" var="leaveList1">
                        <tr>
                            <td><fmt:formatDate value="${leaveList1.starttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            <td><fmt:formatDate value="${leaveList1.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            <td>${leaveList1.type}</td>
                            <td>${leaveList1.state}</td>
                            <td>
                                <a href="${pageContext.request.contextPath }/leave/onLeave?id=${leaveList1.studentId}">查看</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
