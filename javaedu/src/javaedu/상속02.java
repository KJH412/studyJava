package javaedu;
//'클래스생성및사용.java'에 Car클래스를 만들어둔것을 상속받아 쓰는 것.
//Car클래스 상속받아 Sedan클래스 생성
class Sedan extends Car{
	//생성자
	Sedan(){
		System.out.println("Sedan()파라미터없음");
	}
	Sedan(String color, int speed){
		System.out.println("Sedan()파라미터있음");
	}
	
	int seatNum;  //자식클래스에서 추가적으로 갖는 필드
	int getSeatNum() {  //자식클래스에서 추가적으로 갖는 메소드
		return seatNum;
	}	
	//승용차는 속도 제한을 150으로 재정의 - 메소드 오버라이딩
	void upSpeed(int value) { // 증가할 속도를 파라미터로 받아서 현재속도에 증가
		int speed = this.getSpeed() + value;
		if(speed>150) {
			//this.speed = 150;
			this.setSpeed(150);
		}else {
			this.setSpeed(speed);
		}
    }
	//Car클래스의 downSpeed()메소드에 final설정 => 메소드오버라이딩(재정의) 불가
//	void upSpeed(int speed) { 
//		
//	}
}
class Truck extends Car{
	int capacity; //자식클래스에서 추가적으로 갖는 필드	
	int getCapacity() {
		return capacity;
	}
}
public class 상속02 {

	public static void main(String[] args) {
		//sedan객체 생성(인스턴스)
		Sedan sedan1 = new Sedan("red", 10);
		
		Truck truck1 = new Truck();
		
		//.upSpeed()메소드는 Car클래스안에있는 메소드임. 상속받아서 사용할 수 있음.
		sedan1.upSpeed(100);
		truck1.upSpeed(300);
		
		sedan1.seatNum = 5;
		truck1.capacity =50;
		System.out.println("승용차 속도 : " + sedan1.getSpeed() + "," + "좌석수 : " + sedan1.seatNum);
		System.out.println("트럭 속도 : " + truck1.getSpeed() + "," + "적재량 : " + truck1.capacity);

	}
}

