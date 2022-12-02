package javastudy;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		
		String str;
		int i;
		int length;
		
		str = sc.nextLine();
		length = str.length(); 
				
		for(i=0; i<str.length(); i++) {
			System.out.print(str.charAt(length-i-1)); //carAt(): 문장의()번째 문자 출력
		}
		

	}

}
