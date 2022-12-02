<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1에서 10까지 합은?<br>
<% 
	//1+2+3+4+5+...+10 = 55
	int i, sum = 0;
	for(i=1; i<=10; i++){
		if(i<10){
			//화면에 i값을 출력			
%>
			<%= i + " +" %> <!-- 표현식쓰려면 앞에서 스크립트릿을 막아줘야함 -->
<%			
		}else{ //i==10
			out.println(i+" = "); //자바코드로 화면에 출력할 때 out.println()
								//System.out.println()
								//System.out.printf()
		} // if-else괄호
		sum += i;
	}//for문괄호
%>
<%=sum %>
</body>
</html>