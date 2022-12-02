package javaedu;


public class 클래스객체전달0 {
	
	static void func1(int a) { 
		a = a + 1;   //a = 11
		System.out.printf("전달받은 a ==> %d\n", a);
	}

	//main()메소드
	public static void main(String[] args) {
		int a = 10;  //a선언
		/* 값을 전달(call by value) : 값 자체를 메소드를  */
		
		func1(a); //메소드 호출시  a의 값을 전달
		
		System.out.printf("func1()실행 후 a ==> %d\n", a);

	}

}
