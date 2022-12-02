package javaedu;

import java.util.Scanner;

public class contine문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%3==0)   //i를 3으로 나눈 나머지
				
				continue;
				
			hap += i;
		}
			System.out.printf("1~100까지의 합(3의 배수 제외) : %d\n", hap);
			
			
			//5개의 정수를 입력받고 양수의 합을 구하여 출력
			Scanner sc = new Scanner(System.in);
			System.out.println("정수(5개)를 입력하세요 : ");
			
			int sum = 0;   //합 변수
			
			for(int j=0; j<5; j++) {
				int n = sc.nextInt();
				if(n < 0 ) continue;
				else sum += n ;
			}
			System.out.printf("양수의 합 : %d\n ", sum );
			sc.close();
		}

	}

