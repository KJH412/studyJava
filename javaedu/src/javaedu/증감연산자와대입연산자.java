package javaedu;

public class 증감연산자와대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		a++; //1을 증사
		System.out.printf("a++ ==> %d\n", a);
		
		a--; //1을 감소
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
		
		//증감 연산자가 대입연산자와 같이 사용되는 경우
		//++a : 먼저 1을 증가시킨 다음 a를 사용
		//a++ : a를 사용한 다음에 1을 증가
		a = 10; 
		int b;
		b = a++; //a를 사용하고 1을 증가 => b는 10, a=11
		System.out.printf("%d \n",b);
		
		b = ++a; //먼저 1을 증가시키고 a를 사용 => a = 12, b=12
		System.out.printf("%d \n",b);				
	}	
}
