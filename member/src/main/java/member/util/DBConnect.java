package member.util;

import java.sql.*;

/* 데이터베이스 접속 클래스*/
public class DBConnect {
	//1.데이터베이스 연결관련 변수 선언
	//**변수들을 public으로 설정을 해야 다른 클래스에서 사용 가능.(호출해서)
	public Connection conn = null; //데이터베이스 접속하기 위한 변수
	public PreparedStatement psmt = null; //작성한 sql문을 실행하기위한 변수
	public ResultSet rs = null;
		
	//2.데이터베이스 연결 관련 정보를 문자열로 선언
	String driverName="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	
	//메소드는 public으로 설정을 해야 다른 클래스에서 사용 가능
	//DB연결 메소드
	public void connect() {
		try {
			//jdbc드라이버 로드
			Class.forName(driverName);
			
			//데이터베이스 접속
			conn = DriverManager.getConnection(url, "scott", "tiger");
		
		}catch(Exception e){
			//printStackTrace(): 시스템이 알려주는 오류메세지를 콘솔창에 출력.
			e.printStackTrace(); 
		}
	}
	//DB연결을 해지하는 메소드
	public void disconnect(){
		if(psmt!=null) { //실행할 sql문이 있다는 뜻.
			try {
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		if(conn!=null) {  //Database(DB)에 접속한 정보가 있음.
			try {
				//사용한 자원을 반납
				conn.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
