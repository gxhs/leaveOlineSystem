<%--
  Created by IntelliJ IDEA.
  User: GengXiaohu
  Date: 2018/6/21
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="../WebContent/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入jQuery核心js文件 -->
    <script src="../WebContent/js/jquery-1.11.3.min.js"></script>
    <!-- 引入BootStrap核心js文件 -->
    <script src="../WebContent/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-10">
            <h2>请假状态中的学生记录</h2>
        </div>
        <div class="row">
            <div class="col-md-10">
                <table class="table table-hover">
                    <tr>
                        <th>编号</th>
                        <th>请假时间</th>
                        <th>截止时间</th>
                        <th>审批人</th>
                        <th>请假类型</th>
                        <th>原因</th>
                        <th>状态</th>
                        <th>姓名</th>
                    </tr>
                    <c:forEach items="${leaveListAll}" var="leaveList">
                        <tr>
                            <th>${leaveList.id}</th>
                            <th><fmt:formatDate value="${leaveList.starttime}" pattern="yyyy-MM-dd HH:mm:ss"/></th>
                            <th><fmt:formatDate value="${leaveList.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/></th>
                            <th>${leaveList.approver}</th>
                            <th>${leaveList.type}</th>
                            <th>${leaveList.reason}</th>
                            <th>${leaveList.state}</th>
                            <th>${leaveList.student.sname}</th>
                            <th>
                                <a href="${pageContext.request.contextPath }/leave/reportBack?id=${leaveList.id}">销假</a>
                            </th>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
