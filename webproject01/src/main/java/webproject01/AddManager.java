package webproject01;

import java.util.ArrayList;
import java.util.List;

//�����ͺ��̽��� �����Ƿ� ArrayList�� ��ü �迭�� ����
public class AddManager {
	//��ü�迭 ���� �� ����
	List<AddrBean> addrlist = new ArrayList<AddrBean>();
	
	public void add(AddrBean ab) {  
		//��ü(addr)�� ���� ���� addrlist��ü�迭�� ����
		addrlist.add(ab);				
	}
	
	//getAddrList()�޼ҵ�� addrlist ���� ����
	public List<AddrBean> getAddrList() {
		return addrlist;
	}
}
