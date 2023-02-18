<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록 조회</title>
<style>
table, td, th{
	border:1px solid purple;
}
th{
	background-color:pink;
}
</style>
</head>
<%
	//1.데이타베이스 연결관련 변수 선언
	Connection conn = null; //데이타베이스 접속하기위한 변수
	PreparedStatement psmt = null; //작성한 sql문을 실행하기위한 변수
	
	//2.데이타베이스 연결 관련 정보를 문자열로 선언
	String driverName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//3.try-cat문으로 작성
	try {
		//jdbc드라이버 로드
		Class.forName(driverName);
		
		//데이타베이스 연결 정보를 이용해서 Connection처리
		//접속 id, password를 테이블을 생성한 유저로 변경
		conn = DriverManager.getConnection(url, "scott", "tiger"); //scott,tiger에 유저만들었음.
		/* out.println("DB에 성공적으로 접속했습니다."); */
		
		//SQL문 작성 ***********************
		//작성한 SQL문을 psmt변수에 저장
		String sql = "SELECT*FROM BOARD ORDER BY IDX DESC";
		psmt = conn.prepareStatement(sql);
		
		
		//SQL문 실행 ************************
		//psmt에 저장된 내용 실행
		//조회 결과를 받는 변수 ResultSet
		//psmt.executeUpdate(); 
		
		ResultSet rs = psmt.executeQuery(); //조회용SQL문을 실행
%>
<body>
<h1>게시글</h1>
<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
<%
	while(rs.next()){
			out.print("<tr>");
			//content.jsp는 idx를 클릭했을 때 상세 내역 조회하면
			//클릭한 번호를 content.jsp에 파라미터(?)로 넘겨 줘야한다. 
			//<a href='contents.jsp?idx=rs.getString("idx")'></a>;
			out.print("<td><a href='content.jsp?idx=" + rs.getString("idx") + "'>" + rs.getString("idx") + "</a></td>" ); //(1)로 써도됨.
			out.print("<td>" + rs.getString("title") + "</td>" ); //(2)로 써도됨.
			out.print("<td>" + rs.getString(3) + "</td>" );
			out.print("<td>" + rs.getString(4) + "</td>" );
			out.print("<td>" + rs.getString(5) + "</td>" );
			out.print("</tr>");
	}
%>
</table>
<a href="write.jsp">글쓰기</a>
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
