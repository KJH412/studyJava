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
	/*String id = request.getParameter("userid");
	String pw = request.getParameter("passwd");	*/
	
%>
	<!-- useBean액션 -->
	<!-- setProperty를 이용해서 파라미터 값을 useBean액션에 정의한 클래스 set -->
	<jsp:useBean id="login" class="webproject01.LoginBean" scope="page"/>
	<jsp:setProperty name="login" property="*"/>
	
<center>
	<h2>로그인 예제</h2>
	<hr>
	<% 
		//LoginBean클래스에 있는 메소드
		if(!login.checkUser()){
			out.println("로그인 실패!");
		}else{
			out.println("로그인 성공~");
		}
	%>
	<hr>
	<!-- getProperty를 이용해서  -->
	사용자 아이디 : <jsp:getProperty name="login" property="userid"/><br>
	사용자 패스워드 : <jsp:getProperty name="login" property="passwd"/>
</center>	
</body>
</html>