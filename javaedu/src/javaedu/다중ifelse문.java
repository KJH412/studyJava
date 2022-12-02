package javaedu;

import java.util.Scanner;

/*
 * 다중 if else-문을 이용하여 입력받은 성적에 학점을 부여하는 프로그램을 작성
 * */
public class 다중ifelse문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체(인스턴스) 생성
		Scanner sc = new Scanner(System.in);
		
		char grade; //char : 한문자. ' ', String:문자열 " "
		
		System.out.print("점수를 입력하세요(0~100): ");
		
		int score = sc.nextInt(); //입력받은 바이트 코드값을 정수형으로 변환
		if(score>=90) 
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("학점은"+grade+"입니다.");
		sc.close();
	}

}
