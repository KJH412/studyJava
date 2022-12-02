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
	public void draw() { // 부모 메소드를 오버라이딩
		System.out.println("Circle");
	}
}

public class 메소드오버라이딩 {
	//paint(Shape객체타입 p)  p는 변수
	//Sahpe을 상속받은 객체들이 매개변수로 넘어올 수 있다.
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
