<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="member.model.memberDAO"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복 체크</title>
<style>
	#wrap{
		width:490px; text-align:center; margin:0 auto;
	}
	#chk{ text-align:center;}
	#cancelBtn{visibility:visible;}
	#useBtn{visibility:hidden;}
</style>
<%
	String id = request.getParameter("id");
	
	//memberDAO에 아이디를 체크하는 메소드 호출
	int chk = dao.idCheck(id); //chk=1:아이디가 있음(사용불가), chk=1:아이디가 없음(사용가능)
	
	if(chk==1){
		out.println("<br>");
		out.println("<font color='red' size='2'>사용 불가능한 아이디입니다.(이미 사용중인 아이디)</font>");
%>
		<script>
			//<사용하기>버튼을 숨김.
			window.onload=function(){
				documnet.getElementById("useBtn").style.visibility="hidden";
			}
		</script>
<%
	} else{
		out.println("<br>");
		out.println("<font color='red' size='2'>사용가능한 아이디입니다.</font>");
%>
	<!-- 스크립트릿으로 안묶는이유? 자바언어가 아닌 스크립트언어라서 + 화면에 나타나게 하려고. -->
	<script>
		window.onload=function(){
			/* console.log("ddd"); */
			document.getElementById("useBtn").style.visibility="visible";
		}
	</script>
<%
	}
%>	
</head>
<body>
	<div id="wrap">
	<br>
	<b><font size="4" color="gray">아이디 중복 체크</font></b>
	<hr size="1" width="460">
	<br>
	<div id="chk">
		<form id="checkForm" name="frm1">
			<input type="text" name="id" id="userId" value="<%=id %>">
			<input type="button" value="중복확인" onclick="loadIdCheck()">
		</form>
		<div id ="msg"></div>
		<br>
		<input id="cancelBtn" type="button" value="취소" onclick="window.close()">
		<input id="useBtn" type="button" value="사용하기" onclick="sendCheckValue()">
	</div>
	</div>
</body>
</html>