package javaedu;

import java.util.Scanner;

public class while�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.�⺻ for��
		int i;
		for(i=0; i<10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.printf("\n"); //�ٹٲ�
		
		//2.�ʱⰪ�� �������� ��ġ �̵�
		i = 0;
		for(;i<10;) {
			System.out.printf("%d ", i);
			i++;
		}
		System.out.printf("\n");
		
		//3.while������ ��ȯ
		i = 0;
		while(i<10) {  //������ ���� ���� �� ��������
			System.out.printf("%d ", i);
			i++;
		}
		System.out.printf("\n");
		
		//���ѷ����� ���� while
		//�������� �Է¹޴� while��
		Scanner sc = new Scanner(System.in);
		int a,b;
				
		while(true) {  //for(;;)
			System.out.printf("���� ù��°�� : ");
			a = sc.nextInt();

			System.out.printf("���� �ι�°�� : ");
			b = sc.nextInt();
			
			//��� ���
			System.out.printf("%d + %d = %d\n", a, b, a+b);
			
		}
	}

}
