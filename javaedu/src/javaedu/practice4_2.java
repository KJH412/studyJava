package javaedu;

import java.util.Scanner;

public class practice4_2 {

	public static void main(String[] args) {
		
		int age=0; 
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		result = sc.nextInt();
		
		result = (age<=13)? (13<age<=19)? (19<age) ? "초딩":"청소년":"성인";
	}

}
