package javaedu;

import java.util.Scanner;

public class 표준입력 {

	public static void main(String[] args) {
		//객체(인스턴스) 생성 : 클래스명 인스턴스명 = new 클래스명();
		Scanner a = new Scanner(System.in);
		String name = a.next(); //키보드 입력 대기
		
		System.out.println("당신의 이름은 "+name+"입니다.");
	}

}
