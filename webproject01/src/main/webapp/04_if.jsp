<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
	String msg;
%>
<%
//화면 파라미터를 받는 객체
//화면의 form태그의 속성name에 설정된 값
//화면 파라미터는 String으로 받는다.
	String name = request.getParameter("name"); 
	String color = request.getParameter("color");
	
	if(color.equals("blue")){  //String을 비교할때는 equals()메소드 이용
		msg="파란색";
	}else if(color.equals("red")){
		msg="빨간색";
	}else if(color.equals("orange")){
		msg = "오렌지색";
	}else{
		color = "white";
		msg = "기타색";
	}
%>
<body bgcolor=<%=color %>> <!-- 표현식 결과값 -->
	<b><%=name %></b>님이 좋아하는 색깔은<b><%=msg %></b>입니다.
</body>
</html>