package app;

public class wrapper클래스 {

	public static void main(String[] args) {
		
		//wrapper클래스 객체 생성
		Integer i = new Integer(10);
		Character c = new Character('c');

		// 문자열을 기본타입으로 변환
		// Integer클래스에 있는 parseInt()메소드를 이용
		int in = Integer.parseInt("123");

		// Character 사용
		// char c1 = 'A'
		System.out.println(Character.toLowerCase('A')); //소문자 변환 .toLowerCase()
		char c1 = '4', c2 = 'F';
		if (Character.isDigit(c1)) { //c1이 숫자일 경우 true
			System.out.println(c1 + "는 숫자");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}

		// Integer사용
		System.out.println(Integer.parseInt("28"));  //정수(기본타입)타입으로 변환 .parseInt()
		System.out.println(Integer.toString(28));    //정수 28을 문자열로 변환
		System.out.println(Integer.toBinaryString(28)); //정수를 16진수의 문자열

		// Double사용
		Double d = new Double(3.14);
		System.out.println(Double.parseDouble("3.14")); //"3.14"(문자열)을 double타입으로 변환.parseDouble()

	}
}
