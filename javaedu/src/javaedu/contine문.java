package javaedu;

import java.util.Scanner;

public class contine�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%3==0)   //i�� 3���� ���� ������
				
				continue;
				
			hap += i;
		}
			System.out.printf("1~100������ ��(3�� ��� ����) : %d\n", hap);
			
			
			//5���� ������ �Է¹ް� ����� ���� ���Ͽ� ���
			Scanner sc = new Scanner(System.in);
			System.out.println("����(5��)�� �Է��ϼ��� : ");
			
			int sum = 0;   //�� ����
			
			for(int j=0; j<5; j++) {
				int n = sc.nextInt();
				if(n < 0 ) continue;
				else sum += n ;
			}
			System.out.printf("����� �� : %d\n ", sum );
			sc.close();
		}

	}

