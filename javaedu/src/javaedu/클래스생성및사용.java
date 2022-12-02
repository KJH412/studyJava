package javaedu;

//클래스 정의
class Car {
	// 자동차 필드
	String color;
	// 직접 필드에 접근 못하도록 접근제어수식어
	// 메소드를 통해서 간접적으로 필드에 접근
	private int speed;

	//클래스와 이름이 동일한 메소드:생성자
	//생성자. color,speed를 초기화
	Car(){
		color="pink";
		speed=30;
		System.out.println("Car()의 생성자(파라미터없음)");
	}
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
		System.out.println("Car()의 생성자(파라미터있음)");
	}
	// 자동차 메소드
	void upSpeed(int value) { // 증가할 속도를 파라미터로 받아서 현재속도에 증가
		if(speed+value > 200) {
			speed=200;
		}else {
				speed += value;
		}
	}

	void downSpeed(int value) {
		if(speed-value<0) {
			speed=0;
		}else {
		speed -= value;
		}
	}

	// 현재 자동차 색상을 리턴
	String getColor() {
		return color;
	}

	// 현재의 자동차 속도를 리턴
	int getSpeed() {
		return speed;
	}

	// 자동차 색상 값을 변경 (리턴값이 없음 void)
	void setColor(String color) {
		this.color = color;
	}

	// 자동차의 속도 값을 변경
	void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class 클래스생성및사용 {

	public static void main(String[] args) {
		// 인스턴스 생성
		// Car 클래스를 가지고 자동차를 제작
		Car redCar = new Car(); // 빨간 자동차 객체 생성
		Car blueCar = new Car(); // 파란 자동차 객체 생성
		Car yelloCar = new Car();
		
		Car car1=new Car();
		System.out.println("car1자동차 색상은" + car1.color + ", 현재속도는" + car1.getSpeed());
		
		Car car2 = new Car("blue",50);
		System.out.println("car2자동차 색상은" + car2.color + ", 현재속도는" + car2.getSpeed());
		
		

		// Car : 필드(색상,속도)
		// 인스턴스에 필드 값을 대입
		redCar.color = "red";
		
		// 메소드를 호출해서 speed값을 변경
		redCar.setSpeed(0);

		blueCar.color = "blue";
		blueCar.setSpeed(0);

		yelloCar.color = "yellow";
		yelloCar.setSpeed(0);

		// Car : 메소드(속도올리기, 속도내리기)
		// 인스턴스에서 메소드 호출
		redCar.upSpeed(100);
		// 직접 필드에 접근
		System.out.println("redCar자동차 색상은" + redCar.color + ", 현재속도는" + redCar.getSpeed());
		// 메소드를 호출함으로써 간접적으로 필드에 접근
		// 간접적인 접근 방식이 바람직
		System.out.println("redCar자동차 색상은" + redCar.getColor() + ", 현재속도는" + redCar.getSpeed());

		blueCar.upSpeed(30);
		System.out.println("blueCar자동차 색상은" + blueCar.color + ", 현재속도는" + blueCar.getSpeed());

		//속도를 올리는 메소드
		//redCar.speed=300;
		redCar.upSpeed(300);
		System.out.println("redCar의 속도 : " + redCar.getSpeed());

	}

}
