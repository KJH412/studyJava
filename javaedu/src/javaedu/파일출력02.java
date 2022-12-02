package javaedu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * FileWriter �� �̿��Ͽ� ���Ͽ� ���پ� ����
 * - ���ڿ��� ���� ���Ͽ� ��
 * */
public class �������02 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//1.���Ͽ���
		FileWriter fw = new FileWriter("c:\\java_work\\temp\\data4.txt");
		
		//2.����ó��
		String str;
		
		//nextLine(): ���پ� �Է��ϴ� ����Ÿ�� ���ڿ��� ����
		//().equals("") .�պκа� �ڰ�ȣ�Ӱ��� ���ƾ���
		//StringŬ���� : equals()�޼ҵ� (���������� true), ==(��,�ּҵѴٰ��ƾ�)
		while(!(str = sc.nextLine()).equals("")) { //�Է��� ���� ������ �ƴҶ����� �ݺ�
			//write()�޼ҵ�:���Ͽ� ����Ÿ�� ���� �޼ҵ�
			fw.write(str+"\r\n");
		}
		
		//3.���ϴݱ�
		fw.close();
	}

}
