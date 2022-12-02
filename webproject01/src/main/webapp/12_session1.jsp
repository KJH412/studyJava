<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");	
	
	session.setAttribute("idKey",id);
	session.setMaxInactiveInterval(60*2);
%>
<h1>Session Example</h1>
<form method=post action=12_session1_1.jsp>
1.가장좋아하는계절은?<br>
<input type=radio name=season value="봄">봄
<input type=radio name=season value="여름">여름
<input type=radio name=season value="가을">가을
<input type=radio name=season value="겨울">겨울

<input type=submit value="결과보기">
</form>
</body>
</html>