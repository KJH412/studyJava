package javaedu;

import java.util.Scanner;

/*
 * 예외처리를 활용한 간단한 계산기
 * +, 1, *, / 
 * 단,0으로 나누거나 0을 곱하는 것은 예외처리, 처리결과가 음수로 나와도 예외처리
 * */
public class Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,result = 0;
		char ch; //문자(한글자,1바이트)
		
		System.out.printf("첫번째 수를 입력하세요 : ");
		a = s.nextInt();
		
		System.out.printf("계산할 연산자를 입력하세요 :");  //+ = * /
		ch = s.next().charAt(0);  //next():문자열, nextLine():한줄단위
		                          //String.charAt(i):인덱스가 i번째인 문자 한문자를 리턴
		
		System.out.printf("두번째 수를 입력하세요 : ");
		b = s.nextInt();
		
		try {
		switch(ch) {
		case '+':
			result = a+b;  //결과가 음수
			break;
		case '-':
			result = a-b; //결과가 음수
			break;
		case '*':
		    if(a==0 || b==0) {
		    	//예외 정의
		    	throw new Exception("0으로 곱하면 어차피 0입니다.");
		    }	    
			result = a*b; //결과가 음수, 0으로 곱셈
			break;
		case '/':
			if(b<0) {
				throw new Exception("0으로 나눌 수 없다.");
			}
			result = a/b; //결과가 음수, 0으로 나누기
			break;
		}
		if(result<0) {
			//예외정의 
			throw new Exception("결과가 음수이다.");
		}
		
		   System.out.printf("결과값 ==> %d\n",result);
		}
        catch(Exception e){  //예외가 발생하면 실행되는 블럭
		System.out.println(e.getMessage()); //사용자가 만든 예외 메세지 출력	
		}
		System.out.println("프로그램종료");
	}
}
