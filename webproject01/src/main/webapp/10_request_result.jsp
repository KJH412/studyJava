<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <% //전달받은 한글이 깨질 경우 설정 
   //전달받은 데이터의 charset을 설정
   	request.setCharacterEncoding("ut-8");
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2>request테스트 결과</h2>
	<hr>
	<table border="1" cellspacing="1" cellpadding="5">
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("username") %></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><%= request.getParameter("job") %></td>
		</tr>
		<tr>
			<td>관심분야</td>
			<td>
			<%
				String favorites[] = request.getParameterValues("favorit");
				for(String favorite: favorites){
					out.println(favorite + "<br>");	
				}
			%>
			</td>
		</tr>
		<tr>
				<td colspan="2" align="center">
					<input type="submit" value="확인">
					<input type="reset" value="취소">
				</td>
			</tr>
	</table>
</center>
</body>
</html>