<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 데이터를 저장/처리 -->
    <jsp:useBean id="loginbean" class="bean.loginBean" />
    <jsp:setProperty property="*" name="loginbean" />
   
    
    <!-- 데이터베이스 처리 객체 -->
    <jsp:useBean id="dao" class="bean.loginDAO" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인을 처리하는 jsp</title>
</head>
<body>
<%
	//로그인 화면에 입력된 아이디와 비밀번호를 가져온다.
	String id = loginbean.getId();
	String pw = loginbean.getPassword();
	
	//데이터베이스에 아이디,비밀번호를 확인하는 메소드를 호출
	int check = dao.loginCheck(id, pw);
	System.out.println(check);
	String msg = "";
	if(check ==1){ //로그인 성공
		session.setAttribute("sessionID", id); //세션에 아이디값 저장
		msg = "../index.html"; //메인페이지로 이동
	}else if(check == 0){ //비밀번호 틀림
		msg="../login.jsp?msg=0"; //msg파라미터에 비밀번호가 틀린 정보
	}else{ //아이디가 없는 경우
		msg="../login.jsp?msg=-1"; //msg파라미터에 아이디가 틀린 정보
	}
	//sendRedirect(String url):()안에 쓴 url로 이동한다는 뜻.
	response.sendRedirect(msg);
%>
</body>
</html>