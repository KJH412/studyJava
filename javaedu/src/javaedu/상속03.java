package javaedu;
class A{
	public A() {
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println("생성자A==>파라미터");
	}
}
class B extends A {
	public B() {
	System.out.println("생성자B");
	}
	public B(int x) {
		super (x);
		System.out.println("생성자B==>파라미터");
	}
	
}
class C extends B {
	public C() {
	System.out.println("생성자C");
	}
}
public class 상속03 {

	public static void main(String[] args) {
		//C클래스 객체 생성
		C c = new C();
		
		B b = new B(5);

	}

}
