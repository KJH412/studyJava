package javaedu;

public class 타입변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i); //b가 int타입으로 자동변환
		System.out.println(10/4); //정수/정수=정수
		System.out.println(10.0/4); //실수/정수
		System.out.println((char)0x12340041); //강제형변환
		System.out.println((byte)(b+i)); 
		System.out.println((int)2.9+1.8); //2+1.8 = 3.8 (원래는 4.7)
		System.out.println((int)(2.9+1.8)); //int(4.7) => 4
		System.out.println((int)2.9 + (int)1.8); //2+1 = 3

	}

}
