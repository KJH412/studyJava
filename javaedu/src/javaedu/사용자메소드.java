package javaedu;

import java.util.Scanner;

public class ����ڸ޼ҵ� {
	static int coffee_machine(int button) {
		System.out.printf("\n#1. �߰ſ� ���� �غ��Ѵ�.\n");
		System.out.printf("#2. �������� �غ��Ѵ�.\n");

		switch (button) {
		case 1:
			System.out.printf("#3. ���� Ŀ�Ǹ� ź��\n");
			break;
		case 2:
			System.out.printf("#3. ���� Ŀ�Ǹ� ź��\n");
			break;
		case 3:
			System.out.printf("#3. �� Ŀ�Ǹ� ź��\n");
			break;
		default:
			System.out.printf("#3. �ƹ��ų� ź��\n");
		}
		System.out.printf("#4. ���� �״´�.\n");
		System.out.printf("#5. ��Ǭ���� ��� ���δ�.\n\n");
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int coffee;
		int ret;

		// 1.�ֹ��� �޴´�
		System.out.printf("� Ŀ�Ǹ� �帱���?(1:����, 2:����, 3:��)");
		coffee = sc.nextInt();
		
		//Ŀ�� �ӽ� �޼ҵ� ȣ��
		ret = coffee_machine(coffee);

		System.out.printf("�մ�~ Ŀ�� ���� �ֽ��ϴ�.\n");
		
		//�ι�° �մ��� ���� �� �ڵ� �ݺ�
		
		

	}

}
