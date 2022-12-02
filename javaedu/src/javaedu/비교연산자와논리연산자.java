package javaedu;

public class 비교연산자와논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자한개는'', 문자열은""
		System.out.println('a'>'b'); //문자는 ascii코드:a(97),b(98)
		System.out.println(3>=2); //크거나 같음(이상)
		System.out.println(-1<0); //true
		System.out.println(3.45<=2); //false
		System.out.println(3==2); //같다(==) false
		System.out.println(3!=2); //다르다(!=) =>true
		System.out.println(!(3!=2)); //!(true) => false
		System.out.println((3>2)&&(3>4)); //&&(and)  true && false => false
		System.out.println((3!=2)||(-1>0)); //||(or)  true || false => true
	}
}
