package javaedu;

/*
 * 추상클래스 Calculator 를 상속받는 GoodCalc클래스를 구현
 * */
abstract class Calclator {
	// 추상메서드 : {}으로 된 메소드의 코드없고 원형만 선언!  abstract class 
	// => 상속을 받은 서브클래스에서 정의해서 쓰기. =>메소드오버라이딩
	// 메소드명 : add
	// 파라미터 : int a, int b 받아서 처리
	// 리턴 : 정수(int)값
	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	// 메소드명: average
	// 파라미터 : 정수형배열(int[]) a
	// 리턴 : 실수(double)값
	public abstract double average(int[] a);
}
class GoodCalc extends Calclator { //GoodCalc는 추상메서드x

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {   //추상메서드 오버라이딩(정의)
		// TODO Auto-generated method stub
		return a - b;
	}
	@Override
	public double average(int[] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}
public class 추상클래스 {

	public static void main(String[] args) {
		//추상클래스는 객체(인스턴스,실체) 생성 불가능!!
        //Calclator ca = new Calclator();(X)
        
		GoodCalc c = new GoodCalc();  //추상클래스(Calclator)를 상속받은 서브클래스(GoodCalc)는 객체생성 가능.
        
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[] {2,3,4}));
        
	}

}
