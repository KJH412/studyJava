package member.model;
import java.util.*;
import member.util.DBConnect; //���� ���� ��(��Ű�����޶�import)

//DAO : Data Acess Object(�����͸� ó���ϴ� Ŭ����)
//MEMBER���̺��� ������ ó��(select/insert/update/delete)�� ����ϴ� Ŭ����(��ü)
public class memberDAO {
	//DBConnect��ü�� ���� �ν��Ͻ��� ����
	DBConnect db = new DBConnect();
	
	//ȸ�� ������ member���̺� �����ϴ� �޼���
	//input�Ķ����: insert�� �����Ͱ� ����Ǿ� �ִ� ��ü
	//return: insert���(true/false)�� ����
	public boolean insertMember(memberBean m){ //'��ü'�� �Ķ���͸� ����. 
		                       //�Ķ�����͹��� ���� �տ� ���¸� ��?���־����.
		//�����ͺ��̽� ����
		db.connect(); 
		
		//������ sql�� �ۼ� *********************************
		String sql = "INSERT INTO MEMBER " +
				  	 "values "+
				  	 "(?, ?, ?, ?, ?, ?, ?, ?, sysdate)"; //������ڴ� ����Ŭ���� �����ϴ� sysdate
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
			
			/*SQL�� ����**********************/
			db.psmt.executeUpdate();	//������Ʈó��	
			
		}catch(Exception e) {
			e.printStackTrace();
			return false; //ĳġ���� ���Դٴ� ���� ������ ����̴ϱ� return false
		}finally {
			db.disconnect();
		}
		return true;		
	}
	
	//�α��ν� ���̵�� ��й�ȣ�� üũ�ϴ� �޼���.
	public int loginCheck(String id, String pw) {	
		String dbPw = "";
		int chk = 0;
		//System.out.println(pw);
		
		//�����ͺ��̽� ����
		db.connect();
		
		//SQL������ �����.  +id(�Ķ���ͷι���id)
		//SELECT PASSWORD FROM MEMBER WHERE ID = 'hong';
		String sql = "SELECT PASSWORD FROM MEMBER WHERE ID = " + "'" + id + "'";
		
		try {
			db.psmt= db.conn.prepareStatement(sql); //������� sql���� ����°�.
			
			//SQL�� ����
			db.rs = db.psmt.executeQuery(); //������ ��ȸ�� ����� rs������ ����.
			
			if(db.rs.next()) {//(��ȸ�� ����Ÿ�� ����) - ��ȸ�� �����Ͱ� ���� ���.			
				dbPw = db.rs.getString("password"); //DB���� ������ ��.
				
				if(dbPw.equals(pw)) { //����//�� pw�� �Ķ���ͷ� ����loginCheck(String pw)��.
					chk = 1;
				}else {//�н����� Ʋ�����
					chk = 0;
				}
			}else { //member���̺� �����Ͱ� ���� ��� //��ȸ�� �����Ͱ� ���� ���
				chk = -1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.disconnect();
		}		
		return chk;
	}
	
	//�Է��� ���θ� �ش�Ǵ� �����ȣ ��� ��ȸ �޼ҵ�.
	public Vector<zipCodeBean> zipcodeRead(String area3) {
		//�����ͺ��̽� ����
		db.connect();
		
		//��ȸ�� �����͸� ��ü�迭�� ����
		Vector<zipCodeBean> vlist = new Vector<zipCodeBean>();
		
		
		//SQL�� (area3�� %����%  / like:area3�� ���ԵȰ� �� ã��.)
		String sql = "SELECT * FROM ZIP WHERE AREA3 LIKE ?"; //?�ȿ� area3���� ������.
		//zp, area1, area2, area3 <= zip���̺� Į��
		try {
			db.psmt =db.conn.prepareStatement(sql);
			db.psmt.setString(1, "%"+area3+"%");
			
			//���� -> ��ȸ
			db.rs = db.psmt.executeQuery();
			while(db.rs.next()) { //��ȸ�� ������ ó��
				//zipCodeBeanŬ������ ����ϱ� ���ؼ� zipCodeBean�ν��Ͻ� ����
				zipCodeBean bean = new zipCodeBean();
				
				bean.setZipcode(db.rs.getString(1));
				bean.setArea1(db.rs.getString(2));
				bean.setArea2(db.rs.getString(3));
				bean.setArea3(db.rs.getString(4));
				
				vlist.add(bean); //vlist�� ��ü�� ��� ��´�.
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.disconnect();
		}		
		return vlist;
	}
	//ȸ�� ���Խ� ���̵� üũ�ϴ� �޼ҵ�
	public int idCheck(String id) {
		int chk = 0;
		
		//�����ͺ��̽� ����
		db.connect();
		
		//SQL�� �ۼ�
		String sql = "SELECT ID FROM MEMBER WHERE ID = ?";
		try {
			db.psmt=db.conn.prepareStatement(sql);
			db.psmt.setString(1,id);
			//SQL�� ����
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
			
			//SQL�� ����
			db.rs=db.psmt.executeQuery();
			
			if(db.rs.next()){
				String i = db.rs.getString("id");
				String password = db.rs.getString("password");
				String name = db.rs.getString("name");
				String gender = db.rs.getString("gender");
				
				//����Į�� ��,��,�Ϸ� ����.
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
	

