package javaedu;

import java.util.Scanner;

public class array04 {

	public static void main(String[] args) {
		
		//�迭�� ũ�⸸ŭ ������ �Է¹޾� �迭�� �����ϰ�, ����� ���			
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5]; //�迭 ���� �� ����
		int sum = 0;
		int i;
		
		System.out.println("��� 5���� �Է��ϼ���");  // �迭��ũ�Ⱑ5���� ������ new int[5]
		
		for(i=0; i<intArray.length; i++) {
		intArray[i] = sc.nextInt();  //0,1,2,3,4	
			sum += intArray[i];
		}
		
		System.out.print("��� " + sum/intArray.length);
		sc.close();
		
		
	}

}
