<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
<%
   String contentPage = request.getParameter("contentPage");

   if(contentPage==null){
      contentPage="FirstView.jsp";
   } 
%>
<div id="wrap">
   <div id="header">
      <jsp:include page="Header.jsp" />
   </div>
   <div id="main">
      <jsp:include page="<%=contentPage %>" />
   </div>
   <div id="footer">하단</div>
</div>
</body>
</html>