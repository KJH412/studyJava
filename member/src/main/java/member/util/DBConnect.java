package member.util;

import java.sql.*;

/* �����ͺ��̽� ���� Ŭ����*/
public class DBConnect {
	//1.�����ͺ��̽� ������� ���� ����
	//**�������� public���� ������ �ؾ� �ٸ� Ŭ�������� ��� ����.(ȣ���ؼ�)
	public Connection conn = null; //�����ͺ��̽� �����ϱ� ���� ����
	public PreparedStatement psmt = null; //�ۼ��� sql���� �����ϱ����� ����
	public ResultSet rs = null;
		
	//2.�����ͺ��̽� ���� ���� ������ ���ڿ��� ����
	String driverName="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	
	//�޼ҵ�� public���� ������ �ؾ� �ٸ� Ŭ�������� ��� ����
	//DB���� �޼ҵ�
	public void connect() {
		try {
			//jdbc����̹� �ε�
			Class.forName(driverName);
			
			//�����ͺ��̽� ����
			conn = DriverManager.getConnection(url, "scott", "tiger");
		
		}catch(Exception e){
			//printStackTrace(): �ý����� �˷��ִ� �����޼����� �ܼ�â�� ���.
			e.printStackTrace(); 
		}
	}
	//DB������ �����ϴ� �޼ҵ�
	public void disconnect(){
		if(psmt!=null) { //������ sql���� �ִٴ� ��.
			try {
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		if(conn!=null) {  //Database(DB)�� ������ ������ ����.
			try {
				//����� �ڿ��� �ݳ�
				conn.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
