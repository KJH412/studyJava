package javaedu;

public class CircleArray {

	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];   //5개의 방을 가진 c (각 방에 Circle이 하나씩 들어가 있다.)
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i, "pizza"); //반복문 돌면서 Circle객체 생성중
		}
		for(int i=0; i<c.length; i++) {
			System.out.print((int)(c[i].getArea())+" "); //(int)로 형변환해서 소수점 다 잘라냄.
		}

	}

}
