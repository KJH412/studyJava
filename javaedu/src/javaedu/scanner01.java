package javaedu;

import java.util.Scanner;

/* ���� ���α׷�
 * �ΰ��� ���� �Է� �޾Ƽ� +, -, *, /�� ����
 * */
public class scanner01 {

	public static void main(String[] args) {
		// ���ڳ� ���ڸ� �Է¹ޱ� ���ؼ� ScannerŬ������ ����Ѵ�.->�ν��Ͻ�(��ü) ����
		Scanner sc = new Scanner(System.in);
		
		//��������
		int a,b;
		int result;
		//�Է¹��� ���� ���鹮��(����,����,��)���� ����
		a = sc.nextInt();  //Ű����� �Է¹��� ���ڸ� a������ ����
		b = sc.nextInt();  //Ű����� �Է¹��� ���ڸ� b������ ����
		
		result = a + b ;
		System.out.println(a + "+" + b + "=" + result);	
		//-, *, / ����� ��� �ǵ��� �߰�
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);	
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);	
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);	
	}
}
