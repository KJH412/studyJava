package javaedu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 1����Ʈ�� �о� ���̱�
 * ������ �о ȭ�鿡 ���
 * �Է� ��Ʈ��: FileInputStream  => �ѱ��̱���
 * read()
 * */
public class �����Է�01 {

	public static void main(String[] args) throws Exception {
		//1. ���� ����(��ü ����)
		//  - ���� : ������ ���� - ���� ��ΰ� Ʋ�����(��ũ����)
		//          ������ �аų� �� �� ���� ��� - ��ũ ������ ���ڶ�ų� ��Ʈ�� ���� ���
		FileInputStream fis = new FileInputStream("c:\\java_work\\temp\\data1.txt");	
				
		//2. ���� ó��
		int ch;
		//read()�޼ҵ� : ����Ÿ�� �д� �޼ҵ�. ������ ���� ��� -1�� �����Ѵ�.
		//              1����Ʈ�� ����
		while((ch = fis.read()) != -1)
			System.out.print((char)ch);  //(char)����Ʈ: ����ȯ
		
		//3. ���� �ݱ�
		fis.close();

	}

}
