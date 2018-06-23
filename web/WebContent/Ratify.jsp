<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入jQuery核心js文件 -->
    <script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
    <!-- 引入BootStrap核心js文件 -->
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>

<form action="/assistant/onLeave" method="post">
    <input type="text" name="id">
    <input type="submit" name="提交">
</form>


<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h2>学生请假申请</h2>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>请假编号：${leave.id} </th>
                    <th>学生姓名：${leave.student.sname} </th>
                </tr>
                <tr>
                    <td><fmt:formatDate value="${leave.starttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td><fmt:formatDate value="${leave.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                </tr>
                <tr>
                    <th>请假类型： ${leave.type}       </th>
                    <th>请假时长：${leave.time}</th>
                </tr>
                <tr>
                    <th>请假理由：${leave.reason}</th>
                    <th>批假人： ${assistant.name}</th>
                </tr>
                <tr>
                    <th>该学生请假次数：${count}</th>
                    <th><a href="leaveRecord">详情</a></th>
                </tr>
            </table>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <form action="/leave/updateState" method="post">
                <input type="hidden" value="${leave.id}" name="id">
                <input type="hidden" value="${leave.studentId}" name="Sid">
                是否批准申请:
                <select name="ratifyType">
                    <option value="true" name="ratify">批准</option>
                    <option value="false" name="ratify">不批准</option>
                </select>
                </br>
                <input type="submit">
            </form>
            <!--批准理由：<textarea>
            </textarea>-->
        </div>
    </div>
</div>
</div>

</body>
</html>