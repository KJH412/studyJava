package javaedu;
/*
 *한 클래스 내에서 두개 이상의 이름이 같은 메소드 => 생성자, 일반메소드
 * -메소드이름동일
 * -파라미터의 개수가 다르거나 타입이 서로 달라야함
 * -메소드오버로딩 실패: 매개변수
 */
class MethodSample{
	public int getSum(int i, int j) {  //파라미터 갯수 : 2
		return i+j;
	}
	public int getSum(int i , int j , int k) { // 파라미터 갯수 : 3
		return i+j+k;
	}
	public double getSum(double i , double j) {  //파라미터 타입
		return i + j;
	}
}


public class 메소드오버로딩 {

	public static void main(String[] args) {
		//객체 생성 -> 실체(인스턴스)
		
		MethodSample m = new MethodSample();
		int i = m.getSum(1, 2); //i=3
		int j = m.getSum(1, 2, 3); //j=6
		double k = m.getSum(1.1, 2.2); //k=3.3

	}

}
