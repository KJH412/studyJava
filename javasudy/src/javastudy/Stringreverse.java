package javastudy;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��ϼ��� : ");
		
		String str;
		int i;
		int length;
		
		str = sc.nextLine();
		length = str.length(); 
				
		for(i=0; i<str.length(); i++) {
			System.out.print(str.charAt(length-i-1)); //carAt(): ������()��° ���� ���
		}
		

	}

}
