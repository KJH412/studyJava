package javaedu;

public class ������������������ {
	static int a = 100;  //�������� ����
	 
	//void : return���� ����
	static void func1() {
		int a = 200;  //�������� ����
		System.out.printf("func1()���� a�� �� ==> %d\n", a); //���������� ���
	}
	
	static int func2() {
		return 50;
		
	}

	public static void main(String[] args) {
		// �޼ҵ� ȣ��. ���� ���ϰ� ����
		func1();
		
		System.out.printf("main()���� a�� �� ==> %d\n", a);  //���������� ���
		
		int a;   //�������� ����
		
		a = func2();   //���� ���� �� : 50
		System.out.printf("func2()ȣ�� �� a�� �� ==> %d\n", a);
	}
}
