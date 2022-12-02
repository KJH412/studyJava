<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상단 영역</title>
<link rel="stylesheet" href="../css/bootstrap.min.css">

</head>
<body>
   <div id="wrap">
      <br>
      <button class="btn btn-success" onclick="changeView(0)">HOME</button>
   <%
      //만일 로그인이 안되었을 경우에는 로그인, 회원가입 버튼을 보여준다.
      if(session.getAttribute("sessionID")==null) {
   %>
         <button id="loginBtn" class="btn btn-primary" onclick="changeView(1)">로그인</button>
         <button id="joinBtn" class="btn btn-primary" onclick="changeView(2)">회원가입</button>
   <%         
      } else {
   %>      
         <!-- 로그인이 안되었을 경우에는 로그아웃, 내정보 버튼을 보여준다. -->   
         <button id="logoutBtn" class="btn btn-primary" onclick="changeView(3)">로그아웃</button>
         <button id="updateBtn" class="btn btn-primary" onclick="changeView(4)">내정보</button>
   <%      
      }
      
   %>
      <button id="memberViewBtn" class="btn btn-warning">회원보기</button>
   </div>
</body>
<script>
   function changeView(value) {
      if(value == "0") { //HOME
         location.href = "mainForm.jsp";
      } else if(value == "1") { //로그인
         location.href = "mainForm.jsp?contentPage=loginForm.jsp";
      } else if(value == "2") { //회원가입
         location.href = "mainForm.jsp?contentPage=joinForm.jsp";
      } else if(value == "3") { //로그아웃
         location.href = "../pro/logoutPro.jsp";
      } else if(value == "4") { //내정보
         location.href = "mainForm.jsp?contentPage=userInfoForm.jsp";
      }
   }
</script>
</html>