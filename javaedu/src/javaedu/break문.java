package javaedu;

import java.util.Scanner;

public class break�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<=100; i++) {
			System.out.printf("for���� %dȸ �����߽��ϴ�.\n", i);
			break;
		}
		System.out.printf("for���� �����߽��ϴ�. \n");
		
		//�Է��� ���� ����� ���ϱ�(0�� �ԷµǱ� ������)
		int number, count=0;
		double sum=0;
		
		//�Է� �ޱ� ���� Ŭ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������Է��ϼ��� : ");
		while(true) { //���ѷ���
			number = sc.nextInt();
			
			if(number == 0) break;
			
			sum += number;
			count++;
		}
		System.out.printf("�Է��� ���� ������ : %d\n" , count);
		System.out.printf("����� : %f\n" , sum/count);

	}

}
