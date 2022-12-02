<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script>
	//아이디와 비밀번호가 입력됐는지 check하는 함수
	function checkValue(){
		if(!document.loginInfo.id.value){
			alert('아이디를 입력하세요.');
			document.loginInfo.id.focus();
			return false;
		}
		if(!document.loginInfo.password.value){
			alert('비밀번호를 입력하세요.');
			document.loginInfo.password.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div id="wrap">
		<br><br>
		<b><font size="6" color="#a4aaa7">로그인 폼</font></b>
		<br><br>
				
		<form name="loginInfo" method="post" action="../pro/loginPro.jsp" onsubmit="return checkValue()">
			<table>
				<tr>
					<td bgcolor="skyblue" id="title">아이디</td>
					<td><input type="text" name="id" maxlength="50"></td>
				</tr>
				<tr>
					<td bgcolor="skyblue" id="title">비밀번호</td>
					<td><input type="password" name="password" maxlength="50"></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="로그인"/>
			<input type="button" value="취소"/>
		</form>
		<%
			String msg = request.getParameter("msg");
			if(msg!=null && msg.equals("0")){
				out.println("<br>");
				out.println("<font color='red' size='5'>비밀번호 오류!!</font>");
			}else if(msg!=null && msg.equals("-1")){
				out.println("<br>");
				out.println("<font color='red' size='5'>아이디 존재하지 않습니다!!</font>");
			}
		%>
 	</div>
</body>
</html>