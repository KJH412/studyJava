package javaedu;

//Ŭ���� ����
class Car {
	// �ڵ��� �ʵ�
	String color;
	// ���� �ʵ忡 ���� ���ϵ��� ����������ľ�
	// �޼ҵ带 ���ؼ� ���������� �ʵ忡 ����
	private int speed;

	//Ŭ������ �̸��� ������ �޼ҵ�:������
	//������. color,speed�� �ʱ�ȭ
	Car(){
		color="pink";
		speed=30;
		System.out.println("Car()�� ������(�Ķ���;���)");
	}
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
		System.out.println("Car()�� ������(�Ķ��������)");
	}
	// �ڵ��� �޼ҵ�
	void upSpeed(int value) { // ������ �ӵ��� �Ķ���ͷ� �޾Ƽ� ����ӵ��� ����
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

	// ���� �ڵ��� ������ ����
	String getColor() {
		return color;
	}

	// ������ �ڵ��� �ӵ��� ����
	int getSpeed() {
		return speed;
	}

	// �ڵ��� ���� ���� ���� (���ϰ��� ���� void)
	void setColor(String color) {
		this.color = color;
	}

	// �ڵ����� �ӵ� ���� ����
	void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class Ŭ���������׻�� {

	public static void main(String[] args) {
		// �ν��Ͻ� ����
		// Car Ŭ������ ������ �ڵ����� ����
		Car redCar = new Car(); // ���� �ڵ��� ��ü ����
		Car blueCar = new Car(); // �Ķ� �ڵ��� ��ü ����
		Car yelloCar = new Car();
		
		Car car1=new Car();
		System.out.println("car1�ڵ��� ������" + car1.color + ", ����ӵ���" + car1.getSpeed());
		
		Car car2 = new Car("blue",50);
		System.out.println("car2�ڵ��� ������" + car2.color + ", ����ӵ���" + car2.getSpeed());
		
		

		// Car : �ʵ�(����,�ӵ�)
		// �ν��Ͻ��� �ʵ� ���� ����
		redCar.color = "red";
		
		// �޼ҵ带 ȣ���ؼ� speed���� ����
		redCar.setSpeed(0);

		blueCar.color = "blue";
		blueCar.setSpeed(0);

		yelloCar.color = "yellow";
		yelloCar.setSpeed(0);

		// Car : �޼ҵ�(�ӵ��ø���, �ӵ�������)
		// �ν��Ͻ����� �޼ҵ� ȣ��
		redCar.upSpeed(100);
		// ���� �ʵ忡 ����
		System.out.println("redCar�ڵ��� ������" + redCar.color + ", ����ӵ���" + redCar.getSpeed());
		// �޼ҵ带 ȣ�������ν� ���������� �ʵ忡 ����
		// �������� ���� ����� �ٶ���
		System.out.println("redCar�ڵ��� ������" + redCar.getColor() + ", ����ӵ���" + redCar.getSpeed());

		blueCar.upSpeed(30);
		System.out.println("blueCar�ڵ��� ������" + blueCar.color + ", ����ӵ���" + blueCar.getSpeed());

		//�ӵ��� �ø��� �޼ҵ�
		//redCar.speed=300;
		redCar.upSpeed(300);
		System.out.println("redCar�� �ӵ� : " + redCar.getSpeed());

	}

}
