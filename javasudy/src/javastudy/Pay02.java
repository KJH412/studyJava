package javastudy;

import java.util.Scanner;

public class Pay02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
		
		int pay = sc.nextInt();
		int time = sc.nextInt();
		int mypay = pay*time;
		
		System.out.println("시급: "+ pay);
		System.out.println("일한 시간: "+ time);		
		System.out.printf("급여:%d원", mypay);
		

	}

}
