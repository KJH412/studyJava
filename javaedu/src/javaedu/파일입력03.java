package javaedu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *  Scanner�� Ȱ���� ���� �б�
 * */
public class �����Է�03 {

	public static void main(String[] args) throws Exception {
		//1.���Ͽ���
		//Scanner sc = new Scanner(System.in); //'Ű����'�� �Է¹��� ����Ÿ ����.
		//Scanner sc = new Scanner(new File("���ϸ�")); //'����'�� ����.
		Scanner sc = new Scanner(new File("c:\\java_work\\temp\\data2.txt"));
		
		//2.����ó��
		int hap = 0;
		while(sc.hasNextLine()) //�������� �ִ��� �̸� �ľ��ؼ� ���� ���� ���� ��� true�� ����
			hap += sc.nextInt();
		
		System.out.println("�հ� : "+ hap);
		
		//3.���ϴݱ�
		sc.close();

	}

}
