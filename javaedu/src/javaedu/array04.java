package javaedu;

import java.util.Scanner;

public class array04 {

	public static void main(String[] args) {
		
		//배열의 크기만큼 정수를 입력받아 배열의 저장하고, 평균을 출력			
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5]; //배열 선언 및 생성
		int sum = 0;
		int i;
		
		System.out.println("양수 5개를 입력하세요");  // 배열의크기가5개기 때문에 new int[5]
		
		for(i=0; i<intArray.length; i++) {
		intArray[i] = sc.nextInt();  //0,1,2,3,4	
			sum += intArray[i];
		}
		
		System.out.print("평균 " + sum/intArray.length);
		sc.close();
		
		
	}

}
