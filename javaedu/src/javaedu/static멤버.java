package javaedu;

/* 
 * 멤버 : 필드와 메소드
 * static : 전역필드와 전역메소드를 만들때 활용
 *          공유 멤버를 만들고자 할때
 *          클래스가 실행될때 메모리에 상주
 */
class Calc{
	public static int abs(int a) {return a>0 ? a:-a;}
	public static int max(int a, int b) {return (a>b) ? a:b;}
	public static int min(int a, int b) {return (a>b) ? b:a;}	
}
public class static멤버 {

	public static void main(String[] args) {
		//객체생성
		Calc c = new Calc();
		System.out.println(c.abs(-10));
		
		//System.out.println(Calc.abs(-5));   //static으로 선언된 메소드는 직접 클래스명. 메소드명으로 접근
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
		


	}

}
