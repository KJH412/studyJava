package javaedu;

import java.util.Scanner;

/*
 * ���� if else-���� �̿��Ͽ� �Է¹��� ������ ������ �ο��ϴ� ���α׷��� �ۼ�
 * */
public class ����ifelse�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü(�ν��Ͻ�) ����
		Scanner sc = new Scanner(System.in);
		
		char grade; //char : �ѹ���. ' ', String:���ڿ� " "
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		
		int score = sc.nextInt(); //�Է¹��� ����Ʈ �ڵ尪�� ���������� ��ȯ
		if(score>=90) 
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("������"+grade+"�Դϴ�.");
		sc.close();
	}

}
