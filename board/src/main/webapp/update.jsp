<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 수정</title>
<%
	String idx = request.getParameter("idx");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String regdate = request.getParameter("regdate");
	String content = request.getParameter("content");
	
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
		conn = DriverManager.getConnection(url, "scott", "tiger");
		//out.println("DB에 성공적으로 접속했습니다.");
		
		//SQL문 작성 ***********************
		//작성한 SQL문을 psmt변수에 저장
		//update board set
		/* title = 값, writer=값 조건문 where idx = 값; */
		String sql = "UPDATE BOARD SET " +
					"title = ?, writer = ?, regdate = to_char(sysdate,'yyyy-mm-dd'), content=?"+
					"WHERE IDX = ? ";
		
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, title);
		psmt.setString(2, writer);
		psmt.setString(3, content);
		psmt.setString(4, idx);
		
		//SQL문 실행 ************************
		//psmt에 저장된 내용 실행
		//조회 결과를 받는 변수 ResultSet
		//ResultSet rs = psmt.executeQuery(); //조회용SQL문을 실행
		
		psmt.executeUpdate(); //transaction(commit/rollback)처리를 하는 메소드. insert/update/delete
		
	} catch(Exception e){
		out.println("DB접속에 실패했습니다.");
		out.println(e.getMessage());
	} finally { //반드시 실행되는 블력
		//사용한 자원을 반납
		psmt.close();
		conn.close();
		
		//index.jsp로 화면을 전환
		out.print("<script>location.href='index.jsp';</script>");
	}
%>
</head>
<body>

</body>
</html>