package javaedu;

public class 메소드02 {

	public static void main(String[] args) {
		int n = 10;   //변수
		/*
		 *  매개변수가 byte, int, double등 기본타입으로 선언
		 *  값이 변수에 복사.  실인자의 값은 변경되지 않음.
		 */
		increase(n);   //메소드(값)
		
		System.out.println(n);

		//객체(인스턴스 생성) : 반지름이 10인 pizza객체
		Circle pizza = new Circle(10);
		
		/*
		 * 객체를 매개변수로 전달 할 경우에는 객체 레퍼런스(주소)값을 전달
		 * 객체 공유
		 * 배열도 같음 : 배열 레퍼런스(주소)만 파라미터에 전달. 실인자
		 */
		increase_obj(pizza);  //메소드(객체)
		System.out.println(pizza.radius);		

		//배열을 파라미터로 전달
		int a[] = {1,2,3,4,5};
		increase_arr(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
		/*
		 * 문자열의 공백문자를 ,로 대체 
		 */
		char c[] = {'T' , 'h', 'i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		//배열 문자 c출력		
		printCharArray(c);
		
		//공백('')문자를 ','로 대치
		replaceSpace(c);
		//배열 문자 c출력		
		printCharArray(c);
	}
	
	static void increase(int m) { //변수에 값을 복사
		m = m+1;
	}
	static void increase_obj(Circle m) {  //(Circle이라는?)변수에 객체(m)를 받아서 처리
		m.radius++;
	}

	static void increase_arr(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
	
	//printCharArray(c); 문자 배열 c를 파라미터로 전달
	static void printCharArray(char a[]) {
	    for(int i=0; i<a.length; i++) {
	    	System.out.print(a[i]);
	    }
	    System.out.println();
	}
	//replaceSpace(c); 문자 배열 c를 파라미터로 전달
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}	
	}			
}
/*
 * 
 * 
 * 
 * 
 */