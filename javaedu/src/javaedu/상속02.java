package javaedu;
//'Ŭ���������׻��.java'�� CarŬ������ �����а��� ��ӹ޾� ���� ��.
//CarŬ���� ��ӹ޾� SedanŬ���� ����
class Sedan extends Car{
	//������
	Sedan(){
		System.out.println("Sedan()�Ķ���;���");
	}
	Sedan(String color, int speed){
		System.out.println("Sedan()�Ķ��������");
	}
	
	int seatNum;  //�ڽ�Ŭ�������� �߰������� ���� �ʵ�
	int getSeatNum() {  //�ڽ�Ŭ�������� �߰������� ���� �޼ҵ�
		return seatNum;
	}	
	//�¿����� �ӵ� ������ 150���� ������ - �޼ҵ� �������̵�
	void upSpeed(int value) { // ������ �ӵ��� �Ķ���ͷ� �޾Ƽ� ����ӵ��� ����
		int speed = this.getSpeed() + value;
		if(speed>150) {
			//this.speed = 150;
			this.setSpeed(150);
		}else {
			this.setSpeed(speed);
		}
    }
	//CarŬ������ downSpeed()�޼ҵ忡 final���� => �޼ҵ�������̵�(������) �Ұ�
//	void upSpeed(int speed) { 
//		
//	}
}
class Truck extends Car{
	int capacity; //�ڽ�Ŭ�������� �߰������� ���� �ʵ�	
	int getCapacity() {
		return capacity;
	}
}
public class ���02 {

	public static void main(String[] args) {
		//sedan��ü ����(�ν��Ͻ�)
		Sedan sedan1 = new Sedan("red", 10);
		
		Truck truck1 = new Truck();
		
		//.upSpeed()�޼ҵ�� CarŬ�����ȿ��ִ� �޼ҵ���. ��ӹ޾Ƽ� ����� �� ����.
		sedan1.upSpeed(100);
		truck1.upSpeed(300);
		
		sedan1.seatNum = 5;
		truck1.capacity =50;
		System.out.println("�¿��� �ӵ� : " + sedan1.getSpeed() + "," + "�¼��� : " + sedan1.seatNum);
		System.out.println("Ʈ�� �ӵ� : " + truck1.getSpeed() + "," + "���緮 : " + truck1.capacity);

	}
}

