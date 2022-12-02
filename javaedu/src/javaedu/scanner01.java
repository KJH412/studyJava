package javaedu;

import java.util.Scanner;

/* 계산기 프로그램
 * 두개의 수를 입력 받아서 +, -, *, /을 실행
 * */
public class scanner01 {

	public static void main(String[] args) {
		// 문자나 숫자를 입력받기 위해서 Scanner클래스를 사용한다.->인스턴스(객체) 생성
		Scanner sc = new Scanner(System.in);
		
		//변수선언
		int a,b;
		int result;
		//입력받은 값을 공백문자(공란,엔터,탭)으로 구분
		a = sc.nextInt();  //키보드로 입력받은 숫자를 a변수에 저장
		b = sc.nextInt();  //키보드로 입력받은 숫자를 b변수에 저장
		
		result = a + b ;
		System.out.println(a + "+" + b + "=" + result);	
		//-, *, / 결과가 출력 되도록 추가
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);	
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);	
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);	
	}
}
