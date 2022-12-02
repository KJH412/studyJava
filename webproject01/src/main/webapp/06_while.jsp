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
	String msg = request.getParameter("msg");
				//문자 -> 숫자로 바꿈.
	int number = Integer.parseInt(request.getParameter("number"));
	int count = 0;
	while(number>count){
		//out.println("msg"); 이렇게 써도 됨.
%> 
	<b><%=msg %></b><br>  <!-- 표현식(+b태그)쓰기위해 따로 뺌. -->
<%
	count++;
	}
%>
</body>
</html>