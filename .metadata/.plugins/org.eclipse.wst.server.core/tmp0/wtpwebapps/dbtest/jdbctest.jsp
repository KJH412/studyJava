<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>db연결 테스트</title>
<%
	//1.데이터베이스 연결관련 변수 선언
	Connection conn = null; //데이터베이스 접속하기 위한 변수
	PreparedStatement psmt = null; //작성한 sql문을 실행하기위한 변수
	
	//2.데이터베이스 연결 관련 정보를 문자열로 선언
	String driverName="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; //연결안됐음.
	
	//3.try-catch문으로 작성
	try{ 
		//jdbc드라이버 로드
		Class.forName(driverName);
		
		//데이터베이스 연결 정보를 이용해서 Connection처리  
		conn = DriverManager.getConnection(url,"SCOTT","tiger");
		
		//SQL문 작성
		//psmt에 저장된 내용 실행
		out.println("DB에 성공적으로 접속했습니다.");
	}catch(Exception e){
		out.println("DB접속에 실패했습니다.");
		out.println(e.getMessage());
		
	}
%>
</head>
<body>
	<h2>이벤트 등록</h2>
	<form name="form1" method="post">
		이름 : <input type="text" name="username">
		주소 : <input type="text" name="email" size="20">
		<input type="submit" value="등록">		
	</form>
	<br><br>
	<hr>
	<h1>목록</h1>
	<%
		//조회용 SQL문을 작성
		String sql = "select ename, job from emp";
		psmt = conn.prepareStatement(sql);
		
		//SQL문 실행
		//조회 결과를 받는 변수 ReasultSet
		ResultSet rs = psmt.executeQuery();
		int i = 0;
		
		//마지막 데이터까지 반복하면서 보여줌
		while(rs.next()){
			out.println(i+":"+rs.getString("ename")+","+rs.getString("job")+"<br>");
			i++;
		}
		//반납
		rs.close();
		psmt.close();
		conn.close();
	%>
</body>
</html>