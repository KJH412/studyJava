package javastudy;

import java.util.Scanner;

public class Pay02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
		
		int pay = sc.nextInt();
		int time = sc.nextInt();
		int mypay = pay*time;
		
		System.out.println("�ñ�: "+ pay);
		System.out.println("���� �ð�: "+ time);		
		System.out.printf("�޿�:%d��", mypay);
		

	}

}
