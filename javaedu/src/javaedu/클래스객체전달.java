package javaedu;

class myInt{
	int a; //�ʵ�(����)
}

public class Ŭ������ü���� {
	static void func1(myInt m) {  //func1(myInt i)  myInt�� Ÿ�����ο��� m�� ����.
		m.a = m.a + 1;   
		System.out.printf("���޹��� a ==> %d\n", m.a);
	}

	//main()�޼ҵ�
	public static void main(String[] args) {
		
		//�ν��Ͻ� ����.  m
		myInt m = new myInt();
		
		//
		m.a = 10;
		
		func1(m); //��ü�� �Ű������� ���� : �ּҸ� ����
		System.out.printf("func1()���� �� a ==> %d\n", m.a);

	}

}
