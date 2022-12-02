package app;

import java.util.Vector;
class Point{
	private int x,y; //필드
	
	public Point(int x,int y) { //생성자
		this.x = x;
		this.y = y;
	}
	public String toString() {  //메소드 toString()을 가진..
		return "(" + x + "," + y + ")";
	}
}
public class Vector클래스 {

	public static void main(String[] args) {
		// 정수값만 다루는 제네릭 벡터 객체 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); //5삽입
		v.add(new Integer(4));
		v.add(-1);
		
		//벡터 중간에 삽입하기
		v.add(2,100); //인덱스 2에 100삽입
		System.out.println("v의 요소 개수는 :" + v.size());
		
		//벡터의 요소출력
		for(int i=0; i<v.size(); i++) {
			int n= v.get(i);  //벡터의 i번째 정수
			System.out.println(n);
		}
		
		//벡터 속의 모든 정수 더하기
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			int n= v.elementAt(i);  //벡터의 i번째 정수
			sum += n;
		}
		System.out.println(sum);
		
		/*
		 * Point 클래스를 저장하는 벡터 클래스
		 */
		//벡터 객체 생성
		Vector<Point> p = new Vector<Point>();
		
		//Point객체 3 삽입
		//Point클래스 실체화 시킬려면 객체 생성을 한 다음에 사용가능
		Point p1 = new Point(2,3);
		p.add(p1);
		p.add(new Point(-5,20)); //생성과 동시에 벡터p에 갖다넣는다.
		p.add(new Point(30,-8));
		
		//벡터에 있는 Point객체를 모두 검색하여 출력
		for(int i=0; i<p.size(); i++) {
			Point p11 = p.get(i); //벡터의 i번째 Point객체 얻어내기 (p11은 Point객체타입
			System.out.println(p11);
		}
		
		
	}

}
