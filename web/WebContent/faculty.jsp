<%--
  Created by IntelliJ IDEA.
  User: GengXiaohu
  Date: 2018/6/20
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        <th>id</th>
                        <th>starttime</th>
                        <th>endtime</th>
                        <th>approver</th>
                        <th>type</th>
                        <th>reason</th>
                        <th>state</th>
                        <th>student_id</th>
                    </tr>
                    <c:forEach items="${ }" var="">
                        <tr>
                            <th>${ }</th>
                            <th>${ }</th>
                            <th>${ }</th>
                            <th>${ }</th>
                            <th>${ }</th>
                            <th>${ }</th>
                            <th>${ }</th>
                            <th>${ }</th>
                            <th>
                                <button class="btn btn-primary btn-sm">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                    编辑
                                </button>
                                <button class="btn btn-danger btn-sm">
                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                    删除
                                </button>
                            </th>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
