package javaedu;

class Shape{
	public void draw() {
		System.out.println("shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle1 extends Shape{
	public void draw() { // �θ� �޼ҵ带 �������̵�
		System.out.println("Circle");
	}
}

public class �޼ҵ�������̵� {
	//paint(Shape��üŸ�� p)  p�� ����
	//Sahpe�� ��ӹ��� ��ü���� �Ű������� �Ѿ�� �� �ִ�.
    static void paint(Shape p) {
    	p.draw();
    }
	public static void main(String[] args) {
		paint(new Shape());
		
		Line line = new Line();
		paint(line);
		
		Rect rect = new Rect();
		paint(rect);
		
		paint(new Circle1());
	}

}
