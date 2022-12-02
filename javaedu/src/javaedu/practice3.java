package javaedu;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		
		System.out.println("Wirting Please");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = "";
		
		
		result = (num % 2 == 0 ) ? "true":"false";
		System.out.println(result);
		
		sc.close();
	}

}
