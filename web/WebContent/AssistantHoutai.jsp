<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
	<!--
    	作者：offline
    	时间：2018-06-21
    	描述：辅导员后台
    -->

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>学生</title>

					<frameset rows="10%,90%">
						<frame src="${pageContext.request.contextPath }/WebContent/top.jsp" scrolling="no" allowtransparency="ture">
						<frameset cols="10%,90%">
							<frame src="${pageContext.request.contextPath }/WebContent/fudaoyuan.jsp?Aname=${Aname}" name="f1" scrolling="No" noresize="noresize">
						<frame src="${pageContext.request.contextPath }/leave/unRatify ?Aname=${Aname}" name="f2" scrolling="No" noresize="noresize">
				</frameset>
		</frameset>
	</head>

	<body>
	</body>

</html>