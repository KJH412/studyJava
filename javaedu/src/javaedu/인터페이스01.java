package javaedu;
//인터페이스 선언 : 상수와 추상메서드
interface Car1{
	final int CAR_COUNT = 0; //상수 (final생략가능. 없어도 상수라 여김.)
	abstract void work();    //추상메서드   (abstract 생략가능)
}
interface Cannon{
	void fire();
}

class Tank implements Car1,Cannon{

	@Override
	public void fire() {
		System.out.println("탱크에서 대포를 쏩니다.");			
	}
	@Override
	public void work() {
		System.out.println("탱크가 앞으로 굴러갑니다.");			
	}		
}
//Car1인터페이스를 가지고 Sedan1을 구현
class Sedan1 implements Car1{
	@Override
	public void work() {
	System.out.println("승용차가 사람을 태우고 있습니다.");	
	}	
}
class Truck1 implements Car1{
	@Override
	public void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");		
	}	
}
public class 인터페이스01 {

	public static void main(String[] args) {
		// 사용 : 객체(인스턴스) 생성
		Sedan1 sedan1 = new Sedan1();
		sedan1.work();
		
		Truck1 truck1 = new Truck1();
		truck1.work();

		Tank tank = new Tank();
		tank.work();
		tank.fire();
	}

}
