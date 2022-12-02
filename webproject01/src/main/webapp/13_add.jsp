<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import ="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String productname = request.getParameter("product");

     //ArrayList : Object(객체)를 저장하는 배열. add()메소드를 이용해서 데이터추가     
	ArrayList list = (ArrayList)session.getAttribute("productlist");
	if(list == null){ 
		list = new ArrayList();
		//세션의 productlist이름으로 list저장
		session.setAttribute("productlist", list);
	}
	list.add(productname); //list에 내가 선택한 상품이 추가
%>
<script>
	alert("<%=productname%>이(가) 추가되었습니다.");
	history.go(-1); //이전 페이지로 이동
</script>
</body>
</html>