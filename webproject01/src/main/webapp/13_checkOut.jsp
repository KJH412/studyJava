<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2>계산</h2>
	선택한 상품 목록
	<hr>
	<%
		//session.getAttribute(""): 세션 productlist 정보를 읽음
		ArrayList list = (ArrayList)session.getAttribute("productlist");
		if(list == null){
			out.println("선택한 상품이 없습니다.");
		}else{
			//list타입이 ArrayList(object)타입. productname=p
			for(Object p:list){  //forEach문?
				out.println(p + "<br>");
			}
		}
	%>
</center>	
</body>
</html>