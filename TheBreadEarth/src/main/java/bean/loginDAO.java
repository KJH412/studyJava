package bean;
import java.sql.*; //�����ͺ��̽� ���� ��ü

import member.util.DBConnect;

public class loginDAO {
	DBConnect db = new DBConnect(); //�ν��Ͻ� ����
	
	public int loginCheck(String id, String pw) {
		String dbPW="";
		int chk = 0;
		
		//�����ͺ��̽��� ���� ó���ϱ�.
		db.connect();

		String sql = "SELECT PASSWORD FROM MEMBER WHERE ID = ?";
		try {
			db.psmt = db.conn.prepareStatement(sql);
			db.psmt.setString(1, id);
			//SQL����
			db.rs = db.psmt.executeQuery();
			
			if(db.rs.next()) { //��ȸ�� �����Ͱ� �ִ� ���
				dbPW = db.rs.getString("password"); //�����ͺ��̽����� ��ȸ�ؿ� ���� �о�ͼ� ������ ����
				//dbPW : �����ͺ��̽����� ���̵�� ��ȸ�� ��й�ȣ
				//pw : ȭ�鿡�� �Է¹��� ��й�ȣ
				if(dbPW.equals(pw)) { //���� �α���
					chk = 1;
				}else { //��й�ȣ�� Ʋ�� ���
					chk = 0;
				}
			}else { //��ȸ�� �����Ͱ� ���� ���
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
