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
		String season = request.getParameter("season");
	
		String id = (String)session.getAttribute("idKey");
		String sessionID = session.getId();
		int intervalTime = session.getMaxInactiveInterval(); 	
		
		if(id != null){
	%>
			<b><%=id %></b>님이 좋아하는 계절은
			<b><%=season %></b>입니다.<br>
			세션ID = <%=sessionID %> <br>
			세션 유지시간 : <%=intervalTime%>초 <br>
	<%
		}else{
			out.println("세션 시간 경과하여서 연결할 수 없습니다.");
		}
	%>
</body>
</html>