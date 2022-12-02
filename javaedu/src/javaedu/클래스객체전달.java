package javaedu;

class myInt{
	int a; //필드(변수)
}

public class 클래스객체전달 {
	static void func1(myInt m) {  //func1(myInt i)  myInt가 타입으로오고 m이 받음.
		m.a = m.a + 1;   
		System.out.printf("전달받은 a ==> %d\n", m.a);
	}

	//main()메소드
	public static void main(String[] args) {
		
		//인스턴스 생성.  m
		myInt m = new myInt();
		
		//
		m.a = 10;
		
		func1(m); //객체를 매개변수로 전달 : 주소를 전달
		System.out.printf("func1()실행 후 a ==> %d\n", m.a);

	}

}
