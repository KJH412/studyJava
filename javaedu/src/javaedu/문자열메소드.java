package javaedu;

import java.util.Scanner;

public class ���ڿ��޼ҵ� {

	public static void main(String[] args) {
		// ���ڿ� ���̸� �˷��ִ� length()
		String str = "java programming study"; // ���� char a = 'a';
		int len;

		len = str.length(); //length()�޼ҵ带 �̿��ؼ� ���ڿ��� ���̸� ����

		System.out.printf("���ڿ� : %s\n", str); // %c:���� %s:���ڿ�
		System.out.printf("���ڿ� ���� : %d\n", len);

		//���ڿ��� �Է��� �޾Ƽ� o => $�� �����ض�.
		Scanner sc = new Scanner(System.in);
		String str1; //�Է¹��� ���ڿ��� ������ ����
		
		System.out.print("���ڿ� �Է� ==>");
		str1 = sc.nextLine();  //nextInt():������ ���� nextLine():���� ���ڿ� ����
		                       //a b c s
		                       //String a1 = next(); a
		                       //String a2 = next(); b
		                       //String a3 = next(); c
                               //String a4 = next(); s
		                       //String a4 = nextLine(); a b c s
		
		
		System.out.print("��� ���ڿ� ==>");
		for(int i=0; i<str1.length(); i++) { //���ڿ��� ����
			
			//charAt(i): �ε���(0~) i��° ���ڸ� ����
			if(str1.charAt(i) == 'o')
				System.out.printf("%c", '$');   //������ o��$�� �ٲٰ�
			else
				System.out.printf("%c", str1.charAt(i));   //�ƴϸ� �״�� ���
		}
	}

}
