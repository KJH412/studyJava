package javaedu;

import java.util.Scanner;

public class while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.기본 for문
		int i;
		for(i=0; i<10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.printf("\n"); //줄바꿈
		
		//2.초기값과 증감식의 위치 이동
		i = 0;
		for(;i<10;) {
			System.out.printf("%d ", i);
			i++;
		}
		System.out.printf("\n");
		
		//3.while문으로 변환
		i = 0;
		while(i<10) {  //조건이 참인 동안 블럭 반족실행
			System.out.printf("%d ", i);
			i++;
		}
		System.out.printf("\n");
		
		//무한루프를 위한 while
		//무한으로 입력받는 while문
		Scanner sc = new Scanner(System.in);
		int a,b;
				
		while(true) {  //for(;;)
			System.out.printf("더할 첫번째수 : ");
			a = sc.nextInt();

			System.out.printf("더할 두번째수 : ");
			b = sc.nextInt();
			
			//결과 출력
			System.out.printf("%d + %d = %d\n", a, b, a+b);
			
		}
	}

}
