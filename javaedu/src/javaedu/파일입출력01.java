package javaedu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 1.������ �а� ȭ�鿡 ���
 * 2.Ű����� �Է��ϰ� ���Ͽ� ���
 * 3.������ �а� ���Ͽ� ���(win.ini����)
 * */
public class ���������01 {

	public static void main(String[] args) throws Exception {		
		//1.���Ͽ���
		//�б����� ����, �������� ���Ͽ� ���� ��Ʈ��(��ü����)
		FileInputStream fis = new FileInputStream("c:\\Windows\\win.ini");
		FileOutputStream fos = new FileOutputStream("c:\\java_work\\temp\\data5.txt");
		
		//2.����ó��
		int ch;
		while((ch = fis.read()) != -1) {  //read() : FileInputStream�� �޼ҵ�. 1����Ʈ�� ����. ������ ���� ������ -1�� ����.
			fos.write((byte)ch);
		}
		
		//ȭ�鿡 ���
		System.out.println("����Ϸ�");
		
		//3.���ϴݱ�
		fis.close();
		fos.close();

	}

}
