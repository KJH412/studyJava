package webproject01;

import java.util.ArrayList;
import java.util.List;

//데이터베이스가 없으므로 ArrayList로 객체 배열에 저장
public class AddManager {
	//객체배열 정의 및 생성
	List<AddrBean> addrlist = new ArrayList<AddrBean>();
	
	public void add(AddrBean ab) {  
		//객체(addr)를 전달 받음 addrlist객체배열에 저장
		addrlist.add(ab);				
	}
	
	//getAddrList()메소드는 addrlist 값을 리턴
	public List<AddrBean> getAddrList() {
		return addrlist;
	}
}
