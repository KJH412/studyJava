package javaedu;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * ������ ���� �����
 * */
public class Ex06 {

	public static void main(String[] args) throws Exception {
		// 1.���Ͽ���
		// - �������� ����� ����
		int i, k;

		// PrintWriterŬ����(��Ʈ��) : ���
		// print/println/printf
		// PrintWriter pw = new PrintWriter(System.out); ȭ�����
		PrintWriter pw = new PrintWriter("c:\\java_work\\temp\\gugu.txt"); // �������

		// 2.����ó��
		// - ������ ���
		String str = "";
		for (i = 2; i <= 9; i++) {
			str += "#��" + i + "��#"; // str = str
		}

		pw.println(str);
		pw.println(); // new line
		str = "";

		// �������� str�� ����
		for(i=1; i<=9; i++) { 
			for(k=2; k<=9; k++) {
				str += k+"X"+i+"="+(k*i)+"\t";

			}
			str += "\n";	//+=�� =�� ����� \n�� ��� �ε�?�ȰŶ� �������� gugu.txt�� �ȶ���.
		}
		System.out.println(str);
		pw.print(str);
		
		// 3.���ϴݱ�
		pw.close();
	}
}
