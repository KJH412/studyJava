<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%  
String name[] = {"Java","JSP","Android","Struts"};
%>
<table border="1">
	<% for (int i=0; i<name.length; i++){ %>
		<tr>
			<td><%=i %></td>
			<td><%=name[i] %></td>
		</tr>
		<%} %>
	
</table>
<% 
	//Date클래스를 쓰기 위해 객체 생성
	java.util.Date date = new java.util.Date();
	int hour = date.getHours();  //현재시간
	int one = 10;
	int two = 12;
%>
<%! 
	//메소드
	public int operation(int i,int j){
		//삼항연산자 : 조건? true:false
		return i>j?i:j;
	}
%>
지금은 오전일까요? 오후일까요? <%=(hour<12)?"오전":"오후" %><br>
one와 two둘 중 큰 숫자는? <%=operation(one,two) %>

</head>
<body>

</body>
</html>