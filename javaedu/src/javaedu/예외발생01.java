package javaedu;

public class 예외발생01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0;

		try {
			System.out.printf("%d를 %d로 나누면 몫은 %d입니다.\n", a, b, (a / b)); //이것만 쓰면(0으로 못나눠서)오류남.
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

		int[] aa = new int[3]; // 0, 1, 2
		try {
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스가 크기보다 크다.");
		}
		//오류 메세지 직접 만들기
		int result=0;
		try {
			if(b==0) {
				throw new Exception("0으로 나누려고요? 안됩니다.");
			}
			
			result =a/b;
		}catch(Exception e){
			System.out.print("발생오류 ==> ");
			System.out.println(e.getMessage());
		}
		System.out.printf("결과 ==> %d\n" ,result);
	}
}
