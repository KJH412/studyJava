package javaedu;
class A{
	public A() {
		System.out.println("������A");
	}
	public A(int x) {
		System.out.println("������A==>�Ķ����");
	}
}
class B extends A {
	public B() {
	System.out.println("������B");
	}
	public B(int x) {
		super (x);
		System.out.println("������B==>�Ķ����");
	}
	
}
class C extends B {
	public C() {
	System.out.println("������C");
	}
}
public class ���03 {

	public static void main(String[] args) {
		//CŬ���� ��ü ����
		C c = new C();
		
		B b = new B(5);

	}

}
