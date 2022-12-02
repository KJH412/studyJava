package javaedu;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 정수 3개를 입력받아서 합을 구하라.
 * 만일 정수가 아닌 문자를 입력할때 예외처리를 하여 다시 입력 받도록 함.
 * */
public class 예외발생02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요 ==>");
		int sum=0, n=0;
		
		for(int i=0; i<3; i++) {  //0, 1, 2  for문 세번돌림
			try {
				n=sc.nextInt();		//n = a(정수가 아닌 문자a 입력하면)
			}catch(InputMismatchException e){ 
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				sc.next(); //입력받은 데이타 버린다.
				i--; //3번만에 끝내는게아니라 전단계(-1)로 돌아가야함.
				continue;   //아래부분은 실행하지 않고 다시 for문으로 넘어감.
			}			
			sum += n;
		}
		System.out.println("합은 "+sum);
		sc.close();

	}

}
