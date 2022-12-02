package app;

public class Math클래스 {

	public static void main(String[] args) {
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.round(3.14));
		System.out.println(Math.ceil(3.14));
		
		System.out.print("이번주 행운 번호 : ");
		//Math.random()*45:1~45사이의 숫자중에 난수 발생
		System.out.print((int)(Math.random()*45+1));  //(int)(~~)강제 정수로 형변환



	}

}
