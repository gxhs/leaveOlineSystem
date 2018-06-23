<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<frameset rows="10%,90%">
           <frame src="${pageContext.request.contextPath }/WebContent/top.jsp" scrolling="no" allowtransparency="ture">


				<frameset cols="10%,90%">
					<frame src="${pageContext.request.contextPath }/WebContent/student.jsp" name="f1" scrolling="No" noresize="noresize">
						<frame src="${pageContext.request.contextPath }/WebContent/studentLeave.jsp" name="f2" scrolling="No" noresize="noresize">
				</frameset>

		</frameset>
	</head>
	
</html>
