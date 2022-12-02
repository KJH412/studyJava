<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2>include지시어 테스트</h2>
	<hr>
	<%@ include file = "08_menu.jsp" %>
	<br>
	<table border=0 cellpadding=5 cellspacing=1>
		<tr>
			<td><font size="1"><%@include file="08_news.jsp" %></font></td>
			<td width="30">&nbsp</td>
			<td><font size="1"><%@include file="08_shopping.jsp"%></font></td>
		</tr>
	</table>
</center>
</body>
</html>