package javaedu;
//상속받은 자식 클래스는 부모의 필드나 메소드를 사용할 수 있다.

class Point{
	private int x, y;  //필드. private선언된건 메소드를 이용해 접근함.(직접접근x)
	
	Point(){}
	
	Point(int x,int y){
		this.x =x;
		this.y =y;
	}
	
	void showPoint() { //메소드
		System.out.println("(" + x + "," + y + ")");
	}		
	void set(int x, int y){ //x와 y에 값 저장하는 메소드
		this.x = x;
		this.y = y;		
	}
}
//Point를 상속받은 클래스
class colorPoint extends Point{
	private String color; //필드
	
	//기본생성자  
	colorPoint() {}  //자동생성안돼서 강제로 만들어 줌. 파라미터3개받는생성자 만들고
	
	//파라미터 3개를 받는 생성자
	colorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;  //색상
	}
	
	void showColorPoint() { //메소드
		System.out.print(color);
		showPoint();	//Point클래스 메소드	
	}
	void setColor(String color) {
		this.color = color;
	}
}
public class 상속01 {

	public static void main(String[] args) {
           Point p = new Point(); //Point객체 생성
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
