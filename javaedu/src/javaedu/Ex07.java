package javaedu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * ���Ͽ��� �о�� ���ڿ��� ���Ͽ� �Ųٷ� ���
 * in.txt�о out.txt�� ����Ѵ�.
 * 
 * */
public class Ex07 {

	public static void main(String[] args) throws Exception {
		//1.���Ͽ���
		Scanner sc= new Scanner(new File("c:\\java_work\\temp\\in.txt"), "utf-8");
		PrintWriter pw = new PrintWriter("c:\\java_work\\temp\\out.txt");
		
		//2.����ó��
		String str1, str2 ="";  //���� ���ڿ� str1,������ �ٲ� ���ڿ� str2
		
		while(sc.hasNextLine()) { //���� ���� �ִ��� ������ ����
			str1 = sc.nextLine(); //�����б�
			
			int size = str1.length(); //10
			for(int i=size-1; i>=0; i--) {
				str2 += str1.charAt(i);
			}
			System.out.println(str2);
			pw.println(str2);
			str2 = "";
		}
		
		//3.���ϴݱ�
		sc.close();
		pw.close();

	}

}
