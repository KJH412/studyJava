package javaedu;
//�������̽� ���� : ����� �߻�޼���
interface Car1{
	final int CAR_COUNT = 0; //��� (final��������. ��� ����� ����.)
	abstract void work();    //�߻�޼���   (abstract ��������)
}
interface Cannon{
	void fire();
}

class Tank implements Car1,Cannon{

	@Override
	public void fire() {
		System.out.println("��ũ���� ������ ���ϴ�.");			
	}
	@Override
	public void work() {
		System.out.println("��ũ�� ������ �������ϴ�.");			
	}		
}
//Car1�������̽��� ������ Sedan1�� ����
class Sedan1 implements Car1{
	@Override
	public void work() {
	System.out.println("�¿����� ����� �¿�� �ֽ��ϴ�.");	
	}	
}
class Truck1 implements Car1{
	@Override
	public void work() {
		System.out.println("Ʈ���� ���� �ư� �ֽ��ϴ�.");		
	}	
}
public class �������̽�01 {

	public static void main(String[] args) {
		// ��� : ��ü(�ν��Ͻ�) ����
		Sedan1 sedan1 = new Sedan1();
		sedan1.work();
		
		Truck1 truck1 = new Truck1();
		truck1.work();

		Tank tank = new Tank();
		tank.work();
		tank.fire();
	}

}
