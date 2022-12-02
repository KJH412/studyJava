<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:useBean id="addr" class="webproject01.AddrBean"/> 
<jsp:setProperty name="addr" property="*"/>
<jsp:useBean id="am" class="webproject01.AddManager" scope="application"/>
<%
	//AddManager클래스의 add()메소드 실행. 파라미터로 addr(객체)을 전달
	am.add(addr);
%>
</head>
<body>
<center>
	<h2>등록내용</h2>
	이름 : <jsp:getProperty property="username" name="addr"/>
	전화번호 : <%=addr.getTel() %><br>
	이메일 : <%=addr.getEmail()%><br>
	성별 : <jsp:getProperty property="sex" name="addr"/><br>
	<a href="15_addr_list.jsp">목록보기</a>
</center>
</body>
</html>