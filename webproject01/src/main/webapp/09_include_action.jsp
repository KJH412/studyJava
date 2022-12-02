<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>include_action.jsp에서 footer.jsp호출</h2>
<hr>
include_action.jsp에서 호출한 메세지 입니다.<br>
	<!-- include액션의 파라미터를 정의 -->
	
<jsp:include page = "09_footer.jsp">
	<jsp:param name="email" value="test@test.net"/>
	<jsp:param name="tel" value="000-0000-0000"/>
</jsp:include>

</body>
</html>