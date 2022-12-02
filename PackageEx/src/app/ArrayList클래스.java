package app;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList클래스 {

	public static void main(String[] args) {
		// 문자열만 삽입 가능한 ArrayList컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로부터 4개의 이름을 입력받아서 ArrayList삽입
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String s = sc.next();
			a.add(s); //ArrayList컬렉션에 요소 삽입
			
		}
		for(String s1:a) {
			String name =s1;
			System.out.print(name + " ");
		}
		//가장 긴 이름 출력
		int longIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longIndex).length() <a.get(i).length()){
				longIndex = i;
			}
		}
		System.out.println("\n가장 긴 이름을 : "+ a.get(longIndex));

	}

}
