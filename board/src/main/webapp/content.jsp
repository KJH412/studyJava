<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 한 건 조회</title>
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
		<th>내용</th>
	</tr>
<%
	while(rs.next()){  //조회한 데이터 건수만큼 반복
			out.print("<tr>");
			out.print("<td>" + rs.getString("idx") + "</td>" ); //번호. (1)로 써도됨.
			out.print("<td>" + rs.getString("title") + "</td>" ); //제목. (2)로 써도됨.
			out.print("<td>" + rs.getString(3) + "</td>" ); //작성자
			out.print("<td>" + rs.getString(4) + "</td>" ); //날짜
			out.print("<td>" + rs.getString(5) + "</td>" ); //조회수
			out.print("<td>" + rs.getString(6) + "</td>" ); //내용
			out.print("</tr>");
%>
</table>
<a href="update_form.jsp?idx=<%=rs.getString("idx")%>">게시글 수정</a>
<a href="delete.jsp?idx=<%=rs.getString("idx")%>" onclick="return check()">게시글 삭제</a>
<a href="index.jsp">목록으로</a>
<script>
//삭제 실행 전에 confirm처리 함수
	function check(){
		if(!confirm('삭제 하시겠습니까?')){
			return false;
		}
	}
</script>
<%
	}   //while문 닫기 (게시글수정 등 버튼들이 화면에 보이게!)
%>
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