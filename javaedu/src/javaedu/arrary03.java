package javaedu;

import java.util.Scanner;

public class arrary03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = new int[100];
		int[] bb = new int[100];
		int i;
		for(i=0; i<100; i++) {
			aa[i] =  i*2;   //배열 aa[0], aa[1], aa[3] ....0,2,4,6저장
		}
		//배열 bb에는 bb[0]에는 a[99]값이 저장되는 방식으로 값을 역순으로 저장
		
		for(i=0;i<100; i++) {
			bb[i] = aa[99-i];
		}

		System.out.printf("bb[0]는 %d. bb[99]는 %d \n", bb[0],bb[99]);
		
		//정수 5개 입력받아 배열에 저장하고, 제일 큰수를 출력
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5]; //배열 선언 및 생성
		int max = 0;
		
		System.out.println("양수 5개를 입력하세요");
		
		for(i=0; i<5; i++) {
		intArray[i] = sc.nextInt();  //0,1,2,3,4
		if(intArray[i] > max) {
			max = intArray[i];
		}
		}
		System.out.print("가장 큰수는 " +max+"입니다.");
		sc.close();
		
		
	}

}
