package javaedu;

/*
 * Ŭ����:Circle
 * �ʵ�: ������,�̸�
 * �޼ҵ�: ���Ǹ���������
 * 
 * �ν��Ͻ�:����,���ӻ���
 * */
class Circle {
	// �ʵ�
	int radius;
	String name;
	
	//�Ķ���� ���� ������
	public Circle() {
		radius = 1;
		name = "";
	}
	//�Ķ���� �ִ� ������
	public Circle(int r) {
		radius = r;
	}
	//�Ķ���� �ִ� ������ (Ŭ������ �̸��� �����ؼ� ������)
	public Circle(int r,String n) {
		radius = r;
		name =n;
	}

	// �޼ҵ�:���� ������ return(������*������*3.14)
	public double getArea() {
		return radius * radius * 3.14;
	}
}
/*
 * Ŭ������ : Rectangle
 * �ʵ�:����,����
 * �޼ҵ� : ���� ���ϱ�
 * 
 * �ν��Ͻ�:�簢��(����:4,����:5)
 * */
class Rectangle{
	int width;
	int height;
	int getArea(){
		return width * height;
	}
}	
public class Ŭ������� {

	
	public static void main(String[] args) {
		// ���ڰ�ü(�ν��Ͻ�) ����
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area=pizza.getArea();
		System.out.println(pizza.name + "�� ������"+area);
		
		//���Ӱ�ü ����
		Circle donut = new Circle();
		//������:2, �̸�:�ڹٵ���
		donut.radius = 2;
		donut.name="�ڹٵ���";
		area = donut.getArea();  //���� �̹� ����� �����̱� ������ �̸��� ������ �����. �׷��� double area�� ���� �ȵ�. area�� pizza�� �������� �����.
		//�ƴϸ� �ƿ� �ٸ� ������ �ϳ� �� �������..? double area2 = ~~ 
		System.out.println(donut.name+"�� ������"+area);
	
		//�簢���ν��Ͻ� ����
		Rectangle rect= new Rectangle();
		rect.width=4;
		rect.height=5;
		System.out.println("�簢���� ������"+rect.getArea());
		
		Circle c1 = new Circle(10,"���̳�");
		System.out.println(c1.name+"�� ������"+c1.getArea());
		
		Circle c2 = new Circle();
		System.out.println(c2.name+"�� ������"+c2.getArea());
		
		
	}

}
