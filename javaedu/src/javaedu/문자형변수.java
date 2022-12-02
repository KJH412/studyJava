package javaedu;

public class 문자형변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a,b,c,d,e;
		
		a = 'A';
		System.out.printf("%c \t", a);
		System.out.printf("%d \n", (int)a);
		
		b = 'a';
		c = (char)(b+1); // a+1(X) => a에 해당하는 아스키코드값(65)+1 = (char)66
		System.out.printf("%c \t", b);
		System.out.printf("%c \n", c);

	}

}
