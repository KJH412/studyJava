package javaedu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * FileOutStream �� �̿��ؼ� 1����Ʈ�� ���Ͽ� ����
 * write()�޼ҵ�
 * */
public class �������01 {

	public static void main(String[] args) throws Exception {
		//1.���Ͽ���
		//�������� ���� ����
		FileOutputStream fos = new FileOutputStream("c:\\java_work\\temp\\data3.txt");
		
		//2.����ó��
		int ch;
		//System.in(����Ʈ�ڵ�) -> Scanner(����,����..)
		//Ű����κ��� �Էµ� Ű�� ����Ʈ�ڵ�� ����
		//13 : ����Ű
		while((ch = System.in.read()) != 13) {
			fos.write((byte)ch);
		}
		
		//3.���ϴݱ�
		fos.close();
	}

}
