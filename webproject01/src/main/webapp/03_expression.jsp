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
	String name = team + " Fight!!!";
%>
<%!
	//선언문 : 멤버변수(전역)
	String team = "Korea";
	int one;  //정수. 선언문에 정의되어 있는 정수는 초기화를 하지 않으면 기본값0
	int two = 1;  //정수, 초기값 1
	
	//메소드 : 현재 화면에서 사용되는 메소드
	// 선언문 안에 메소드를 정의하는 것은 잘 사용하지 않는다.(X)
	// =>메소드의 재사용(X)
	// =>java의 메소드로 만들어서 사용
	public int plusMethod(){
		return one + two;
	}
	String msg; //문자열
	String three; //문자열
%>
출력되는 결과는? <%=name%> <br>

	one와 two의 합은? <%=plusMethod() %> <br>
	String msg의 값은? <%=msg %><br>
	int three의 값은? <%=three %><br>

</body>
</html>