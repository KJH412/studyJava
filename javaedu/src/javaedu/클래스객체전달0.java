package javaedu;


public class Ŭ������ü����0 {
	
	static void func1(int a) { 
		a = a + 1;   //a = 11
		System.out.printf("���޹��� a ==> %d\n", a);
	}

	//main()�޼ҵ�
	public static void main(String[] args) {
		int a = 10;  //a����
		/* ���� ����(call by value) : �� ��ü�� �޼ҵ带  */
		
		func1(a); //�޼ҵ� ȣ���  a�� ���� ����
		
		System.out.printf("func1()���� �� a ==> %d\n", a);

	}

}
