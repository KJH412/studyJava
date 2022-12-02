package javaedu;

import java.util.Scanner;

/*
 * 나이를 입력 받아서 20대인지 판별하라.
 * */
public class ifelse문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if((age>=20) && (age<30)) {
			System.out.print("20대 입니다.");
		} else {
			System.out.print("20대가 아닙니다.");
		}
		sc.close();

	}

}
