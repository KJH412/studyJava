package javaedu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 3.������ �а� ���Ͽ� ���(win.ini����)
 * => ���ϸ��� �Է� �޾Ƽ� ó��(�о�� �ϴ� ����, �������)
 * */
public class ���������02 {

	public static void main(String[] args) throws Exception {		
		//1.���Ͽ���
		//�б����� ����, �������� ���Ͽ� ���� ��Ʈ��(��ü����)
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		
		//2.����ó��
		int ch;
		while((ch = fis.read()) != -1) {  //read():FileInputStream�� �޼ҵ�. 1����Ʈ�� ����. ������ ���� ������ -1�� ����.
			fos.write((byte)ch);
		}
		
		//ȭ�鿡 ���
		System.out.println("����Ϸ�");
		
		//3.���ϴݱ�
		fis.close();
		fos.close();

	}

}
