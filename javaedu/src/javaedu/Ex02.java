package javaedu;

import java.util.Scanner;

/* while���� �̿��Ͽ� ������ ������ �Է¹ް� ����� ����϶�.
 * 
 * */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=0,  //�ʱⰪ
		count=0, number;
		double sum = 0;
		//0�� �Է� ������ ���� �ݺ� (���ǽľȿ� ������ ������i++�ʿ����)
		System.out.printf("������ �Է��ϼ��� : ");
		while((number = sc.nextInt()) != 0 ) {
			sum += number; //sum = sum + number;
			count++;
		}
		System.out.println("�Է��� ���� ������ : " + count);
		//System.out.printf("�Է��� ���� ������ : %d\n" , count);
		System.out.println("�����" + sum/count);
		//System.out.print("����� : %f\n" , sum/count);
		
		sc.close();

	}

}
