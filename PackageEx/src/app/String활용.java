package app;

public class String활용 {

	public static void main(String[] args) {
		// String객체 생성해서 사용
		String a = new String("C#"); // String a = "C#";
		String b = new String(",C++"); //String b = ",C++";
		
		//문자열의 길이 : length()	
		System.out.println(a+"의 길이는"+a.length());
		
		//문자열의 포함관계 : contains()
		System.out.println(a.contains("#"));
		
		//문자열 연결 : concat()
		a = a.concat(b);
		System.out.println(a);
		
		//문자열 공백제거(앞/뒤) : trim()
		a = a.trim();
		System.out.println(a);
		
		//문자열 대치 : replace()	
		a = a.replace("C#", "java");
		System.out.println(a);
		
		//문자열 분리 : split()	
		String s[] = a.split(",");
		for(String ar:s) {
		System.out.println(ar);
		}
		
		//인덱스 5부터 끝까지 자르기 : substring(5)
		a= a.substring(5);
		System.out.println(a);
		
		//인덱스 2의 한문자를 리턴 : charAt(2)
		char c = a.charAt(2);
		System.out.println(c);
		
		
		

	}

}
