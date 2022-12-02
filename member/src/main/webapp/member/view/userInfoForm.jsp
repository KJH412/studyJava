<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="member.model.memberBean" %>
<jsp:useBean id="dao" class="member.model.memberDAO"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재 사용자 정보를 출력화면</title>
<%
	String id = session.getAttribute("sessionID").toString();
	
	//내 정보를 가져오는 메서드 => memberDAO.java에 작성(파라미터 id값을 가져가서 내정보를 조회한다.)	
	memberBean memberBean = dao.getUserInfo(id);
%>
</head>
<body>
<div id="wrap">
      <br><br>
      <b><font size="5" color="gray">내정보</font></b>
      <br><br>
      <br><br>
      
      <%-- 자바빈에서 입력된 값을 추출한다. --%>
      <table>
         <tr>
            <td id="title">아이디</td>
            <td><%=memberBean.getId() %></td>
         </tr>
                  
         <tr>
            <td id="title">비밀번호</td>
            <td><%=memberBean.getPassword() %></td>
         </tr>
               
         <tr>
            <td id="title">이름</td>
            <td><%=memberBean.getName() %></td>
         </tr>
               
         <tr>
            <td id="title">성별</td>
            <td><%=memberBean.getGender()%></td>
         </tr>
               
         <tr>
            <td id="title">생일</td>
            <td>
               <%=memberBean.getBirthyy() %>년 
               <%=memberBean.getBirthmm() %>월 
               <%=memberBean.getBirthdd() %>일
            </td>
         </tr>
               
         <tr>
            <td id="title">이메일</td>
            <td>
               <%=memberBean.getEmail1() %>@<%=memberBean.getEmail2() %>
            </td>
         </tr>
               
         <tr>
            <td id="title">휴대전화</td>
            <td><%=memberBean.getPhone() %></td>
         </tr>
         <tr>
            <td id="title">주소</td>
            <td>
               <%=memberBean.getAddress() %>
            </td>
         </tr>
      </table>
      
      <br>
      <input type="button" value="뒤로" onclick="changeForm(-1)">
      <input type="button" value="회원정보 변경" onclick="changeForm(0)">
      <input type="button" value="회원탈퇴" onclick="changeForm(1)">
   </div>
</body>
</html>