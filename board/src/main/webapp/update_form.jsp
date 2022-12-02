<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 수정 화면</title>
</head>
<%
	String idx = request.getParameter("idx");

	//1.데이타베이스 연결관련 변수 선언
	Connection conn = null; //데이타베이스 접속하기위하 변수
	PreparedStatement psmt = null; //작성한 sql문을 실행하기위한 변수
	
	//2.데이타베이스 연결 관련 정보를 문자열로 선언
	String driverName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//3.try-cathc문으로 작성
	try {
		//jdbc드라이버 로드
		Class.forName(driverName);
		
		//데이타베이스 연결 정보를 이용해서 Connection처리
		//접속 id, password를 테이블을 생성한 유저로 변경
		conn = DriverManager.getConnection(url, "scott", "tiger"); //scott,tiger에 유저만들었음.
		/* out.println("DB에 성공적으로 접속했습니다."); */
		
		//SQL문 작성 ***********************
		//작성한 SQL문을 psmt변수에 저장
		String sql = "SELECT*FROM BOARD WHERE IDX = " + idx;
		psmt = conn.prepareStatement(sql);
		
		
		//SQL문 실행 ************************
		//psmt에 저장된 내용 실행
		//조회 결과를 받는 변수 ResultSet
		//psmt.executeUpdate(); 
		
		ResultSet rs = psmt.executeQuery(); //조회용SQL문을 실행
		rs.next(); //조회한 한 건을 가져온다.
%>
<body>
	<form method = "post" name="form1" action="update.jsp">
		<input type="hidden" name="idx" value="<%=rs.getString("idx") %>">
		제목 : <input type="text" name="title" value="<%=rs.getString("title") %>"><br>
		작성자 : <input type="text" name="writer" value="<%=rs.getString("writer") %>"><br>
		내용 : <textarea rows="10" cols="20"  name="content"><%=rs.getString("content") %></textarea><br>
		날짜 : <input type="date" name="regdate" value="<%=rs.getString("regdate") %>"><br>
		<input type="submit" value="글수정">
		<input type="reset" value="다시작성하기">
	</form>
<%		
	} catch(Exception e){
		out.println("DB접속에 실패했습니다.");
		out.println(e.getMessage());
	} finally { //반드시 실행되는 블력
		//사용한 자원을 반납
		psmt.close();
		conn.close();
	}
%>
</body>
</html>