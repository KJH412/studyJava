package javaedu;

public class ���������ڿʹ��Կ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		a++; //1�� ����
		System.out.printf("a++ ==> %d\n", a);
		
		a--; //1�� ����
		System.out.printf("a-- ==> %d\n", a);
		
		a += 5; //a = a+5;
		System.out.printf("a += 5 ==> %d\n", a);

		a -= 5; //a = a-5;
		System.out.printf("a -= 5 ==> %d\n", a);
		
		a *= 5;
		System.out.printf("a *= 5 ==> %d\n", a);
	
		a /= 5;
		System.out.printf("a /= 5 ==> %d\n", a);
	
		a %= 5; //a = a%5;
		System.out.printf("a %%= 5 ==> %d\n", a);
		
		//���� �����ڰ� ���Կ����ڿ� ���� ���Ǵ� ���
		//++a : ���� 1�� ������Ų ���� a�� ���
		//a++ : a�� ����� ������ 1�� ����
		a = 10; 
		int b;
		b = a++; //a�� ����ϰ� 1�� ���� => b�� 10, a=11
		System.out.printf("%d \n",b);
		
		b = ++a; //���� 1�� ������Ű�� a�� ��� => a = 12, b=12
		System.out.printf("%d \n",b);				
	}	
}
