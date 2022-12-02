package member.model;
import java.util.*;
import member.util.DBConnect; //내가 만든 것(패키지가달라서import)

//DAO : Data Acess Object(데이터를 처리하는 클래스)
//MEMBER테이블의 데이터 처리(select/insert/update/delete)를 담당하는 클래스(객체)
public class memberDAO {
	//DBConnect객체에 대한 인스턴스를 생성
	DBConnect db = new DBConnect();
	
	//회원 정보를 member테이블에 저장하는 메서드
	//input파라미터: insert할 데이터가 저장되어 있는 객체
	//return: insert결과(true/false)를 리턴
	public boolean insertMember(memberBean m){ //'객체'로 파라미터를 받음. 
		                       //파라미터터받을 변수 앞에 형태를 꼭?써주어야함.
		//데이터베이스 접속
		db.connect(); 
		
		//실행할 sql문 작성 *********************************
		String sql = "INSERT INTO MEMBER " +
				  	 "values "+
				  	 "(?, ?, ?, ?, ?, ?, ?, ?, sysdate)"; //등록일자는 오라클레서 제공하는 sysdate
		try {
			db.psmt = db.conn.prepareStatement(sql);
			db.psmt.setString(1, m.getId());
			db.psmt.setString(2, m.getPassword());
			db.psmt.setString(3, m.getName());
			db.psmt.setString(4, m.getGender());
			db.psmt.setString(5, m.getBirthyy()+m.getBirthmm()+m.getBirthdd());
			db.psmt.setString(6, m.getEmail1()+"@"+m.getEmail2());
			db.psmt.setString(7, m.getPhone());
			db.psmt.setString(8, m.getAddress());
			
			/*SQL문 실행**********************/
			db.psmt.executeUpdate();	//업데이트처리	
			
		}catch(Exception e) {
			e.printStackTrace();
			return false; //캐치문에 들어왔다는 것은 에러가 뜬것이니까 return false
		}finally {
			db.disconnect();
		}
		return true;		
	}
	
	//로그인시 아이디와 비밀번호를 체크하는 메서드.
	public int loginCheck(String id, String pw) {	
		String dbPw = "";
		int chk = 0;
		//System.out.println(pw);
		
		//데이터베이스 접속
		db.connect();
		
		//SQL문장을 만든다.  +id(파라미터로받은id)
		//SELECT PASSWORD FROM MEMBER WHERE ID = 'hong';
		String sql = "SELECT PASSWORD FROM MEMBER WHERE ID = " + "'" + id + "'";
		
		try {
			db.psmt= db.conn.prepareStatement(sql); //여기까지 sql문장 만드는것.
			
			//SQL문 실행
			db.rs = db.psmt.executeQuery(); //데이터 조회한 결과를 rs변수에 저장.
			
			if(db.rs.next()) {//(조회한 데이타를 읽음) - 조회한 데이터가 있을 경우.			
				dbPw = db.rs.getString("password"); //DB에서 가져온 값.
				
				if(dbPw.equals(pw)) { //정상//이 pw는 파라미터로 받은loginCheck(String pw)임.
					chk = 1;
				}else {//패스워드 틀린경우
					chk = 0;
				}
			}else { //member테이블에 데이터가 없는 경우 //조회한 데이터가 없는 경우
				chk = -1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.disconnect();
		}		
		return chk;
	}
	
	//입력한 도로명에 해당되는 우편번호 목록 조회 메소드.
	public Vector<zipCodeBean> zipcodeRead(String area3) {
		//데이터베이스 접속
		db.connect();
		
		//조회한 데이터를 객체배열에 저장
		Vector<zipCodeBean> vlist = new Vector<zipCodeBean>();
		
		
		//SQL문 (area3에 %강남%  / like:area3에 포함된거 다 찾음.)
		String sql = "SELECT * FROM ZIP WHERE AREA3 LIKE ?"; //?안에 area3값이 들어가야지.
		//zp, area1, area2, area3 <= zip테이블 칼럼
		try {
			db.psmt =db.conn.prepareStatement(sql);
			db.psmt.setString(1, "%"+area3+"%");
			
			//실행 -> 조회
			db.rs = db.psmt.executeQuery();
			while(db.rs.next()) { //조회한 데이터 처리
				//zipCodeBean클래스를 사용하기 위해서 zipCodeBean인스턴스 생성
				zipCodeBean bean = new zipCodeBean();
				
				bean.setZipcode(db.rs.getString(1));
				bean.setArea1(db.rs.getString(2));
				bean.setArea2(db.rs.getString(3));
				bean.setArea3(db.rs.getString(4));
				
				vlist.add(bean); //vlist에 객체를 계속 담는다.
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.disconnect();
		}		
		return vlist;
	}
	//회원 가입시 아이디 체크하는 메소드
	public int idCheck(String id) {
		int chk = 0;
		
		//데이터베이스 접속
		db.connect();
		
		//SQL문 작성
		String sql = "SELECT ID FROM MEMBER WHERE ID = ?";
		try {
			db.psmt=db.conn.prepareStatement(sql);
			db.psmt.setString(1,id);
			//SQL문 실행
			db.rs=db.psmt.executeQuery();
			if(db.rs.next()){
				chk=1;
			}else {
				chk=-1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.disconnect();
		}
		return chk;
	}
	
	public memberBean getUserInfo(String id) {
		
		db.connect();
		
		memberBean member = null;
		
		String sql = "SELECT * FROM MEMBER WHERE ID = ?";
		try {
			db.psmt=db.conn.prepareStatement(sql);
			db.psmt.setString(1,id);
			
			//SQL문 실행
			db.rs=db.psmt.executeQuery();
			
			if(db.rs.next()){
				String i = db.rs.getString("id");
				String password = db.rs.getString("password");
				String name = db.rs.getString("name");
				String gender = db.rs.getString("gender");
				
				//생일칼럼 년,월,일로 나눔.
				String birthday = db.rs.getString("birth");
				String year = birthday.substring(0,4);
				String month = birthday.substring(4,6);
				String day = birthday.substring(6);
				
				String mail = db.rs.getString("mail");
				int index = mail.indexOf("@");
				String mail1 = mail.substring(0,index);
				String mail2 = mail.substring(index+1);
				
				String phone = db.rs.getString("phone");
				String address = db.rs.getString("address");
				String regdate = db.rs.getString("regdate");
				
				member = new memberBean();
				member.setId(i);
				member.setPassword(password);
				member.setName(name);
				member.setGender(gender);
				member.setBirthyy(year);
				member.setBirthmm(month);
				member.setBirthdd(day);
				member.setEmail1(mail1);
				member.setEmail2(mail2);
				member.setPhone(phone);
				member.setAddress(address);
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.disconnect();
		}
		return member;
	}
		
	}
	

