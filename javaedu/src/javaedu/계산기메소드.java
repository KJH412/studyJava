package javaedu;

import java.util.Scanner;

public class ����޼ҵ� {
	
	//calc()�޼ҵ�
	//�Ķ���� : v1, v2, op
	static int calc(int v1, int v2, int op) {
		int result;
		switch(op) {
		case 1: result = v1 + v2; break;
		case 2: result = v1 - v2; break;
		case 3: result = v1 * v2; break;
		case 4: result = v1 / v2; break;
		default: result = 0;
		}
		//����� ȣ���� ������ �����ش�.
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int res;
		int oper, a, b;
		
		System.out.printf("����Է�(1:+, 2:-, 3:*, 4:/) : ");
		oper = sc.nextInt();
		
		System.out.printf("ù��° ���ڸ� �Է� =>");
		a = sc.nextInt();
		
		System.out.printf("�ι�° ���ڸ� �Է� =>");
		b = sc.nextInt();
		
		//�޼ҵ� ȣ��
		res = calc(a, b, oper);
		System.out.printf("��� ����� : %d\n", res);
		
	}

}
