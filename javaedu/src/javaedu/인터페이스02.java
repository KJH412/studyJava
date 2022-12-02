package javaedu;

//Phone : ��ư 20, ��ȭ�ɱ�(), ��ȭ�ޱ�()
interface Phone{
	//��� (final������.)
	int BUTTONS = 20; 
	//abstract ������ �߻�޼���
	void sendCall();  
	void receiveCall();
}
//�������̽��� ��ӹ޾� �������̽� ����
interface MobilePhone extends Phone{
	//������ �߰�
	// �߻�޼���
	void sendSMS();
	void receiveSMS();
}
interface MP3{
	// �߻�޼���
	public void play();
	public void stop();
}

//�Ϲ�Ŭ����
class PDA{
	//�Ϲ� �޼���
	public int calculate(int x, int y) { 
		return x+y;
	}
}

/*
 * SmartPhone Ŭ���� : PDA��� ���
 *                   MobilePhone, MP3�������̽��� ����� �޼ҵ� ����
 * */
class SmartPhone extends PDA implements MobilePhone, MP3{

	@Override
	public void sendCall() {
		System.out.println("��ȭ�ɱ�");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�ޱ�");
		
	}

	@Override
	public void play() {
		System.out.println("�������");
		
	}

	@Override
	public void stop() {
		System.out.println("�������");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS������");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS�ޱ�");
		
	}
	
	//���ο� �޼ҵ�
	public void schedule() {
		System.out.println("��������");
	}
}
public class �������̽�02 {

	public static void main(String[] args) {
		//��ü �����ؼ� ��üȭ��Ű��
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();		
		System.out.println(p.calculate(3, 5));
		p.schedule();
		

	}

}
