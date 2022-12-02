package javaedu;

import java.util.Scanner;

public class 문자열메소드 {

	public static void main(String[] args) {
		// 문자열 길이를 알려주는 length()
		String str = "java programming study"; // 문자 char a = 'a';
		int len;

		len = str.length(); //length()메소드를 이용해서 문자열의 길이를 리턴

		System.out.printf("문자열 : %s\n", str); // %c:문자 %s:문자열
		System.out.printf("문자열 길이 : %d\n", len);

		//문자열을 입력을 받아서 o => $로 변경해라.
		Scanner sc = new Scanner(System.in);
		String str1; //입력받은 문자열을 저장할 공간
		
		System.out.print("문자열 입력 ==>");
		str1 = sc.nextLine();  //nextInt():정수로 리턴 nextLine():한줄 문자열 리턴
		                       //a b c s
		                       //String a1 = next(); a
		                       //String a2 = next(); b
		                       //String a3 = next(); c
                               //String a4 = next(); s
		                       //String a4 = nextLine(); a b c s
		
		
		System.out.print("출력 문자열 ==>");
		for(int i=0; i<str1.length(); i++) { //문자열의 길이
			
			//charAt(i): 인덱스(0~) i번째 문자를 리턴
			if(str1.charAt(i) == 'o')
				System.out.printf("%c", '$');   //맞으면 o를$로 바꾸고
			else
				System.out.printf("%c", str1.charAt(i));   //아니면 그대로 출력
		}
	}

}
