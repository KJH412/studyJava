<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!-- 빈즈액션 사용 정의 -->
<jsp:useBean id="memberbean" class="member.model.memberBean"/>
<jsp:useBean id="memberdao" class="member.model.memberDAO"/>

<!-- jsp:useBean에서 id="memberbean"으로 정의 했기 때문에 name을 memberbean --> 
<jsp:setProperty property="id" name="memberbean"/>
<jsp:setProperty property="password" name="memberbean"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인처리 JSP</title>
</head>
<body>
<%
	//로그인 화면에서 입력한 아이디와 비밀번호를 가져온다.
	String id = memberbean.getId();
	String pw = memberbean.getPassword();
	
	//Database에서 아이디, 비밀번호를 체크하는 메소드 호출한 다음에 결과값을 리턴
	//input파라미터: id, pw
	//return: 정수값(int chk) 받아서 처리.
	int chk = memberdao.loginCheck(id, pw);  //1:정상 0:비밀번호오류 -1:회원정보가없다.(memberDAO에 loginCheck메서드있음.)
	
	String msg ="";
	
	if(chk == 1){ //로그인 성공
		//세션에 아이디를 세팅
		session.setAttribute("sessionID", id); 
		msg="../view/mainForm.jsp";		
	}else if(chk == 0){ //비밀번호가 틀렸을 경우
		msg = "../view/mainForm.jsp?contentPage=loginForm.jsp?msg=0";
	}else{
		msg = "../view/mainForm.jsp?contentPage=loginForm.jsp?msg=0";
	}
	//sendRedirect(String URL) :해당 URL로 이동
	response.sendRedirect(msg);
%>
</body>
</html>