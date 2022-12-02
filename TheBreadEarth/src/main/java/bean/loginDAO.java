package bean;
import java.sql.*; //데이터베이스 관련 객체

import member.util.DBConnect;

public class loginDAO {
	DBConnect db = new DBConnect(); //인스턴스 생성
	
	public int loginCheck(String id, String pw) {
		String dbPW="";
		int chk = 0;
		
		//데이터베이스를 접속 처리하기.
		db.connect();

		String sql = "SELECT PASSWORD FROM MEMBER WHERE ID = ?";
		try {
			db.psmt = db.conn.prepareStatement(sql);
			db.psmt.setString(1, id);
			//SQL실행
			db.rs = db.psmt.executeQuery();
			
			if(db.rs.next()) { //조회한 데이터가 있는 경우
				dbPW = db.rs.getString("password"); //데이터베이스에서 조회해온 값을 읽어와서 변수에 저장
				//dbPW : 데이터베이스에서 아이디로 조회한 비밀번호
				//pw : 화면에서 입력받은 비밀번호
				if(dbPW.equals(pw)) { //정상 로그인
					chk = 1;
				}else { //비밀번호가 틀린 경우
					chk = 0;
				}
			}else { //조회한 데이터가 없는 경우
				chk = -1;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			db.disconnect();
		}
		System.out.print(chk);
		return chk; 
	}
}
