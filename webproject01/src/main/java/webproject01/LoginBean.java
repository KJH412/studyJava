package webproject01;

public class LoginBean {
	private String userid;
	private String passwd;
	
	//setter,getter
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	String _userid = "myuser";
	String _passwd = "1234";
	
	public boolean checkUser() {
		if(userid.equals(_userid) && passwd.equals(_passwd)) {
			return true;
		}else {
			return false;
		}
	}

}
