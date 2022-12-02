<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입화면</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script>
	window.onload = function(){
		//년도를 가져온다.
		let date = new Date();
		let year = date.getFullYear(); //현재 년도를 가져온다.
		for(let i=1960; i<=year; i++){
			//add:Option에 데이터 추가
			//Option(): select박스 option을 추가
			document.forms[0].birthyy.add(new Option(i,i));  
		}
	}
	
	//필수입력정보, 정규화식...등 체크하는 함수
	function checkValue(){
		if(!document.userinfo.id.value){
			alert("아이디를 입력하세요!");
			return false;
		}		
		if(document.userinfo.password.value != document.userinfo.passwordcheck.value){
			alert("비밀번호를 동일하게 입력하세요!");
			return false;
		}
		return true;
	}
	//우편번호 검색 화면을 OPEN하는 함수
	function zipSearch(){  //search라는 파라미터에 n을 넣어서?
		url = "../pro/zipSearch.jsp?search=n"; //?search=n : zipSearch.jsp화면 오픈시에 넘기는 파라미터
		//window.open(url:새창으로 보여질 주소, zipCodeSearch:열릴 창의 이름, 속성지정);
		window.open(url, "zipCodeSearch", "width=500, height=300, scrollbars=yes");
	}	
	
	//아이디 중복 버튼을 click했을때 실행되는 함수.
	function openIdCheck(){
		let id = document.userinfo.id.value;
		url="../pro/idCheckPro.jsp?id=" + id;
		window.open(url, "idCheckForm", "width=800, height=400, resizable=no, scrollbars=no");
	}
</script>
</head>
<body>
	<div id="wrap">
		<br><br>
		<b><font size="6" color="gray">회원가입</font></b>
		<br><br><br>
		<!-- onsubmit이벤트가 발생하면 checkValue()함수가 실행되고 true값을 리턴받으면 action이 실행됨 -->
		<form method="post" action="../pro/joinPro.jsp" name="userinfo" onsubmit="return checkValue()">
			<table>
				<tr>
					<td id="title">아이디</td>
					<td>
						<input type="text" name="id" maxlength="20">
						<input type="button" value="중복확인" onclick="openIdCheck()">					
					</td>
				</tr>
				<tr>
					<td id="title">비밀번호</td>
					<td>
						<input type="password" name="password" maxlength="15">
					</td>
				</tr>
				<tr>
					<td id="title">비밀번호 확인</td>
					<td>
						<input type="password" name="passwordcheck" maxlength="15">
					</td>
				</tr>
				<tr>
					<td id="title">이름</td>
					<td>
						<input type="text" name="name" maxlength="40">
					</td>
				</tr>
				<tr>
					<td id="title">성별</td>
					<td>
						<input type="radio" name="gender" value="남" checked>남
						<input type="radio" name="gender" value="여">여
					</td>
				</tr>
				<tr>
					<td id="title">생일</td>
					<td>
						<!-- <input type="text" name="birthyy" maxlength="4" placeholder="년(4자)" size="6"> -->
						<select name="birthyy">
							<option value="#">년도선택</option>
						</select>
						<select name="birthmm">
							<option value="">월</option>
							<option value="01">1</option>
							<option value="02">2</option>
							<option value="03">3</option>
							<option value="04">4</option>
							<option value="05">5</option>
							<option value="06">6</option>
							<option value="07">7</option>
							<option value="08">8</option>
							<option value="09">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
						</select>
						<input type="text" name="birthdd" maxlength="2" placeholder="일" size="4">
					</td>
				</tr>
				<tr>
					<td id="title">이메일</td>
					<td>
						<input type="text" name="email1" maxlength="30">@
						<select name="email2">
							<option>naver.com</option>
							<option>daum.net</option>
							<option>gmail.com</option>
							<option>nate.com</option>
						</select>
					</td>
				</tr>
				<tr>
					<td id="title">휴대전화</td>
					<td>
						<input type="text" name="phone">
					</td>
				</tr>
				<tr>
					<td id="title">우편번호</td>
					<td>
						<input name="zipcode" size="5" readonly>
						<!-- 우편번호 찾기 버튼 클릭시에 zipSearch()함수 실행 -->
						<input type="button" value="우편번호 찾기" onclick="zipSearch()">
					</td>
				</tr>
				<tr>
					<td id="title">주소</td>
					<td>
						<input type="text" size="50" name="address">
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="가입">
			<input type="button" value="취소" onclick="location.href='mainForm.jsp'">
		</form>
		
	</div>
</body>
</html>