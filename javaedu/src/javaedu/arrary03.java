package javaedu;

import java.util.Scanner;

public class arrary03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = new int[100];
		int[] bb = new int[100];
		int i;
		for(i=0; i<100; i++) {
			aa[i] =  i*2;   //�迭 aa[0], aa[1], aa[3] ....0,2,4,6����
		}
		//�迭 bb���� bb[0]���� a[99]���� ����Ǵ� ������� ���� �������� ����
		
		for(i=0;i<100; i++) {
			bb[i] = aa[99-i];
		}

		System.out.printf("bb[0]�� %d. bb[99]�� %d \n", bb[0],bb[99]);
		
		//���� 5�� �Է¹޾� �迭�� �����ϰ�, ���� ū���� ���
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5]; //�迭 ���� �� ����
		int max = 0;
		
		System.out.println("��� 5���� �Է��ϼ���");
		
		for(i=0; i<5; i++) {
		intArray[i] = sc.nextInt();  //0,1,2,3,4
		if(intArray[i] > max) {
			max = intArray[i];
		}
		}
		System.out.print("���� ū���� " +max+"�Դϴ�.");
		sc.close();
		
		
	}

}
