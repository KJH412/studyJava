<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 처리</title>
</head>
<body>
<%
	//모든 세션 정보 삭제
	session.invalidate();
	//메인폼 화면으로 다시 돌아간다.
	response.sendRedirect("../view/mainForm.jsp");
%>
</body>
</html>