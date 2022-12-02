package javaedu;

public class Hello {
	
	//메인메소드
	//클래스가 실행되면 가장 먼저 무조건 실행되는 메소드
	public static void main(String[] args) {
		int i = 20; //let, var = 1;(x) , 정수
		int s;
		char a; //문자
		
		s = sum(1,10);  //sum()메소드 호출
		a = '?';
		
		//화면에 출력
		//자바에서 제공하는 메소드 -> jdk
		System.out.println(a); //문자 '?'
		System.out.println("Hello"); //문자열 Hello
		System.out.println(s); //정수 11
	}
	
	//sum 메소드
	//호출을 해야만 실행이 되는 메소드
	private static int sum(int i, int j) {
		return i+j;
	}

}
