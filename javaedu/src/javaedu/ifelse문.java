package javaedu;

import java.util.Scanner;

/*
 * ���̸� �Է� �޾Ƽ� 20������ �Ǻ��϶�.
 * */
public class ifelse�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		if((age>=20) && (age<30)) {
			System.out.print("20�� �Դϴ�.");
		} else {
			System.out.print("20�밡 �ƴմϴ�.");
		}
		sc.close();

	}

}
