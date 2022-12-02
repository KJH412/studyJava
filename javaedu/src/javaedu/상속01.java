package javaedu;
//��ӹ��� �ڽ� Ŭ������ �θ��� �ʵ峪 �޼ҵ带 ����� �� �ִ�.

class Point{
	private int x, y;  //�ʵ�. private����Ȱ� �޼ҵ带 �̿��� ������.(��������x)
	
	Point(){}
	
	Point(int x,int y){
		this.x =x;
		this.y =y;
	}
	
	void showPoint() { //�޼ҵ�
		System.out.println("(" + x + "," + y + ")");
	}		
	void set(int x, int y){ //x�� y�� �� �����ϴ� �޼ҵ�
		this.x = x;
		this.y = y;		
	}
}
//Point�� ��ӹ��� Ŭ����
class colorPoint extends Point{
	private String color; //�ʵ�
	
	//�⺻������  
	colorPoint() {}  //�ڵ������ȵż� ������ ����� ��. �Ķ����3���޴»����� �����
	
	//�Ķ���� 3���� �޴� ������
	colorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;  //����
	}
	
	void showColorPoint() { //�޼ҵ�
		System.out.print(color);
		showPoint();	//PointŬ���� �޼ҵ�	
	}
	void setColor(String color) {
		this.color = color;
	}
}
public class ���01 {

	public static void main(String[] args) {
           Point p = new Point(); //Point��ü ����
           p.set(1, 2);
           p.showPoint();
           
           colorPoint cp = new colorPoint();
           cp.set(3, 4);
           cp.setColor("red");
           cp.showColorPoint();
           
           colorPoint cp3 = new colorPoint(5,6,"blue");
           cp3.showColorPoint();
	}

}
