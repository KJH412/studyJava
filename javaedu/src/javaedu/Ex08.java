package javaedu;
/*
 * Ŭ������ : Pet
 *         �ʵ� : ����(type), ������(age)
 *         �޼ҵ� : �����δ� 
 * ��ü�����ϰ� ������ ������ ������
 * */
class Pet{
	String type;
	int age;
	
	void move(String m) {
		System.out.println(this.type + "��" + m);
	}
	//age����Ÿ ����
	public void setAge(int a) {
		this.age = a;
	}
	//age ����Ÿ �о����
	public int getAge() {
		return this.age; //this
	}
}
public class Ex08 {

	public static void main(String[] args) {
		//��ü ����
		Pet dog = new Pet();
		dog.type = "������";
		
		//age�� ����Ÿ ����
		//dog.age = 8;
		dog.setAge(8);
		
		//age�� ����Ÿ�� �о����
		System.out.println(dog.type + "��" + dog.age + "�����Դϴ�.");
		
		dog.move("���´�");
	}

}
