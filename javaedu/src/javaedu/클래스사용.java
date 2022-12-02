package javaedu;

/*
 * 클래스:Circle
 * 필드: 반지름,이름
 * 메소드: 원의면적을구함
 * 
 * 인스턴스:피자,도넛생성
 * */
class Circle {
	// 필드
	int radius;
	String name;
	
	//파라미터 없는 생성자
	public Circle() {
		radius = 1;
		name = "";
	}
	//파라미터 있는 생성자
	public Circle(int r) {
		radius = r;
	}
	//파라미터 있는 생성자 (클래스와 이름이 동일해서 생성자)
	public Circle(int r,String n) {
		radius = r;
		name =n;
	}

	// 메소드:원의 면적을 return(반지름*반지름*3.14)
	public double getArea() {
		return radius * radius * 3.14;
	}
}
/*
 * 클래스명 : Rectangle
 * 필드:넓이,높이
 * 메소드 : 넓이 구하기
 * 
 * 인스턴스:사각형(넓이:4,높이:5)
 * */
class Rectangle{
	int width;
	int height;
	int getArea(){
		return width * height;
	}
}	
public class 클래스사용 {

	
	public static void main(String[] args) {
		// 피자객체(인스턴스) 생성
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area=pizza.getArea();
		System.out.println(pizza.name + "의 면적은"+area);
		
		//도넛객체 생성
		Circle donut = new Circle();
		//반지름:2, 이름:자바도넛
		donut.radius = 2;
		donut.name="자바도넛";
		area = donut.getArea();  //위에 이미 선언된 변수이기 때문에 이름만 가져다 써야함. 그래서 double area라 쓰면 안됨. area속 pizza를 도넛으로 덮어씌움.
		//아니면 아예 다른 방으로 하나 더 만들던가..? double area2 = ~~ 
		System.out.println(donut.name+"의 면적은"+area);
	
		//사각형인스턴스 생성
		Rectangle rect= new Rectangle();
		rect.width=4;
		rect.height=5;
		System.out.println("사각형의 면적은"+rect.getArea());
		
		Circle c1 = new Circle(10,"도미노");
		System.out.println(c1.name+"의 면적은"+c1.getArea());
		
		Circle c2 = new Circle();
		System.out.println(c2.name+"의 면적은"+c2.getArea());
		
		
	}

}
