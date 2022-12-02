<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 빈즈액션 사용 정의 -->
<jsp:useBean id="memberbean" class="member.model.memberBean"/>
<jsp:useBean id="memberdao" class="member.model.memberDAO"/>

<!-- jsp:useBean에서 id="memberbean"으로 정의 했기 때문에 name을 memberbean --> 
<jsp:setProperty property="*" name="memberbean"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입처리JSP</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<!-- joinForm에 입력한 데이터를 파라미터로 받아서 화면에 내역을 보여준다  -->
	<%	
		//회원 테이블에 데이터 insert작업
		//자바 객체의 insert하는 메소드를 호출하고 화면을 결과만 출력.		
		memberdao.insertMember(memberbean);
	
		//내장객체getParameter()를 이용해서 파라미터 값을 얻어올 수 있다.		
		//String id = request.getParameter("id");
		//String password = request.getParameter("password");
		//String name = request.getParameter("name");
		
		//성별 :gender라는 동일한 이름이 두개이므로 배열로 받아서 처리.
		//getParameterValues()
		//String[] gender = request.getParameterValues("gender");
		
		//String birthyy = request.getParameter("birthyy");
		//String birthmm = request.getParameter("birthmm");
		//String birthdd = request.getParameter("birthdd");		
		
		//String email1 = request.getParameter("email1");
		//String email2 = request.getParameter("email2");
		
		//String phone = request.getParameter("phone");
		//String address = request.getParameter("address");		
	%>
	<!-- 아이디가 memberbean인 memberBean에 다 저장되어있음. -->
	<div id="wrap">
		<br><br>
		<b><font size="6" color="gray">회원가입 정보를 확인하세요.</font></b>
		<br><br><br>
		<font color="blue"><%=memberbean.getName() %></font>님 가입을 축하드립니다.
		<br><br>
			<table>
				<tr>
					<td id="title">아이디</td>
					<td><%=memberbean.getId() %></td>
				</tr>
				<tr>
					<td id="title">비밀번호</td>
					<td><%=memberbean.getPassword() %></td>
				</tr>
				
				<tr>
					<td id="title">이름</td>
					<td><%=memberbean.getName() %></td> 
				</tr>
				<tr>
					<td id="title">성별</td>
					<td>
						<!-- 코딩을해야하므로 스크립트릿 안에 -->
						<%-- <% //배열로 넘겨받은 값을 처리하기 위해 for문 사용
							for(String g : gender){
								out.println(g);
							}
						%> --%>
						<%=memberbean.getGender() %>
					</td>
				</tr>
				<tr>
					<td id="title">생일</td>
					<td>
						<%=memberbean.getBirthyy() %>년 
						<%=memberbean.getBirthmm() %>월 
						<%=memberbean.getBirthdd() %>일
					</td>
				</tr>
				<tr>
					<td id="title">이메일</td>
					<td>
						<%=memberbean.getEmail1() %>@<%=memberbean.getEmail2() %>
					</td>
				</tr>
				<tr>
					<td id="title">휴대전화</td>
					<td><%=memberbean.getPhone() %></td>
				</tr>
				<tr>
					<td id="title">주소</td>
					<td><%=memberbean.getAddress() %></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="확인"/>		
	</div>
</body>
</html>