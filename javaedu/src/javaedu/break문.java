package javaedu;

import java.util.Scanner;

public class break문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<=100; i++) {
			System.out.printf("for문을 %d회 실행했습니다.\n", i);
			break;
		}
		System.out.printf("for문을 종료했습니다. \n");
		
		//입력한 수의 평균을 구하기(0이 입력되기 전까지)
		int number, count=0;
		double sum=0;
		
		//입력 받기 위한 클래스
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를입력하세요 : ");
		while(true) { //무한루프
			number = sc.nextInt();
			
			if(number == 0) break;
			
			sum += number;
			count++;
		}
		System.out.printf("입력한 수의 갯수는 : %d\n" , count);
		System.out.printf("평균은 : %f\n" , sum/count);

	}

}
