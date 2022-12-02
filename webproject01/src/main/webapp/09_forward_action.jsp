<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>forward_action.jsp에서 footer.jsp호출</h2>
<hr>
forward_action.jsp에서 호출한 메세지 입니다.<br>
<jsp:forward page = "09_footer.jsp">
	<jsp:param name ="email" value="aaaa@test.com"/>
	<jsp:param name ="tel" value="0000-0000-0000"/>
</jsp:forward>
</body>
</html>