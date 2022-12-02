package javaedu;

public class 표준출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요?"); //new line
		System.out.println("Java입니다.");

		System.out.print("안녕하세요?");
		System.out.print("Java입니다.");
		
		System.out.printf("\n"); //new line
		/* %d : 정수형 출력
		 * %f : 실수형 출력
		 * %c : 문자 출력(한문자, 출력문자를 작은 따옴표('')로 묶는다.)
		 * %s : 문자열 출력(문자열, 출력문자열을 큰 따옴표("")로 묶는다.)
		*/
		System.out.printf("100\n"); //문자100
		System.out.printf("%d\n",100); // 서식지정
		
		System.out.printf("100+100\n"); //문자 100+100
		System.out.printf("%d\n",100+100); // %d : 정수
		//100+200을 더한 결과가 나올 수 있도록 %d를 3개 이용해서 System.out.printf()문을 만들어 보자
		//화면 : 100+200 = 300
		System.out.printf("%d + %d = %d\n", 100,200, 100+200);
		//2.나눗셈의 결과도 나오게 출력
		//화면 : 100/200 = 0.5
		System.out.printf("%d / %d = %d\n",100,200, 100/200);
		System.out.printf("%d / %d = %f\n",100,200, 100.0/200.0);
		
		System.out.printf("%c %c \n", 'a', 'b');
		System.out.printf("%s %s \n", "Java Programming", "스터디 카페");
		
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123); //5d 5자리맞춰서 출력됨.
		System.out.printf("%05d\n", 123); // 05d 5자리 맞추는데 나머지자리는 0으로 메꿈.
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45); //소수점이하 1자리
		System.out.printf("%7.3f\n", 123.45); //소수점이하 3자리
		
		System.out.printf("%s\n", "Hi~Java");
		System.out.printf("%10s\n", "Hi~Java"); 
		
		/* \n : 새로운 줄로 이동(new line) 
		 * \t : <tab>키를 누른 효과
		 * \b : <back space>키를 누른 효과
		 * \r : <home>키를 누른 효과
		 */
		
		int a,b,c,d;
		
		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		
		d = a + b + c;
		//화면 : 
		//a,b,c,d의 값 ==> 200, 300, 400, 900로 출력 되도록 prinf(); 를 이용해서 작성
		System.out.printf("a,b,c,d의 값 ==> %d,%d,%d,%d\n", a,b,c,d); 
		
		
	}

}
