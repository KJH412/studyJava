package javaedu;

import java.util.Scanner;

public class scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름,도시,나이,체중,독신여부를 빈칸으로 분리하여 입력하세요.");
		
		//인스턴스(객체) 생성
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); //문자열
		System.out.println("당신의 이름은" + name + "입니다.");
		
		String city = sc.next(); //문자열
		System.out.println("당신의 이름은" + city + "입니다.");
		
		int age = sc.nextInt(); //정수
		System.out.println("당신의 나이는" + age + "입니다.");
		
		double weight = sc.nextDouble(); //실수
		System.out.println("당신의 체중은" + weight + "입니다.");
		
		boolean single = sc.nextBoolean(); //불린
		System.out.println("당신의 독신 여부는" + single + "입니다.");
		
		sc.close();
	}
}
