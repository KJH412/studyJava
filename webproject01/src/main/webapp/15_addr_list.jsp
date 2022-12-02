<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="webproject01.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:useBean id="am" class="webproject01.AddManager" scope="application"/>

</head>
<body>
<center>
	<h2>주소록</h2>
	<hr>
	<a href="15_addr_form.html">주소록 추가</a><br>
	<table border="1" width="500">
		<tr>
			<td>이름</td><td>전화번호</td><td>이메일</td><td>성별</td>
			<%
				for(AddrBean ab:am.getAddrList()){
			%>
					<tr>
						<td><%=ab.getUsername() %></td>
						<td><%=ab.getTel() %></td>
						<td><%=ab.getEmail() %></td>
						<td><%=ab.getSex() %></td>						
					</tr>
			<%
				}
			%>
		</tr>
	</table>
</center>
</body>
</html>