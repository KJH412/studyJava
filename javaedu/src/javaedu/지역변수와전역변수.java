package javaedu;

public class 지역변수와전역변수 {
	static int a = 100;  //전역변수 선언
	 
	//void : return값이 없음
	static void func1() {
		int a = 200;  //지역변수 선언
		System.out.printf("func1()에서 a의 값 ==> %d\n", a); //지역변수를 출력
	}
	
	static int func2() {
		return 50;
		
	}

	public static void main(String[] args) {
		// 메소드 호출. 받을 리턴값 없음
		func1();
		
		System.out.printf("main()에서 a의 값 ==> %d\n", a);  //전역변수를 출력
		
		int a;   //지역변수 선언
		
		a = func2();   //리턴 받은 값 : 50
		System.out.printf("func2()호출 후 a의 값 ==> %d\n", a);
	}
}
