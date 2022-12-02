<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 자바빈즈 액션 사용 정의 -->    
<jsp:useBean id="memberbean" class="bean.memberBean"/>
<jsp:useBean id="memberdao" class="bean.memberDAO"/>

<jsp:setProperty property="*" name="memberbean"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 처리jsp</title>
</head>
<body>
	<div id="wrap">
		<br><br>
		<b><font size="6" color="blue">회원가입 정보를 확인하세요</font></b>
		<br><br>
		<font color="red"><%=memberbean.getName() %></font>님 가입을 축하드립니다.
	</div>

</body>
</html>