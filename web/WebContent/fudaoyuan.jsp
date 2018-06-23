<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <!--
    	作者：offline
    时间：2018-06-21
    描述：辅导员功权限列表
    -->

    <body bgcolor=#66AFE9>
    <% String name=request.getParameter("Aname");
    %>

    待审批人：<%=name %>
    	<h5><a href="/leave/unRatify?id=<%=name %>" target="f2" style="text-decoration: none;">待审批假条</a><br /><br /></h5>
		<h5><a href="/leave/getAll" target="f2" style="text-decoration: none;">当前请假信息</a><br /><br /></h5>
	<%--<h5><a href="leaveRecord.jsp" target="f2" style="text-decoration: none;">销假</a><br /><br /></h5>--%>
	<%--<h5><a href="leaveRecord.jsp" target="f2" style="text-decoration: none;">未审批假条</a><br /><br /></h5>--%>
 	</body>
</html>