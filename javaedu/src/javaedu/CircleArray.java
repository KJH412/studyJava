package javaedu;

public class CircleArray {

	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];   //5���� ���� ���� c (�� �濡 Circle�� �ϳ��� �� �ִ�.)
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i, "pizza"); //�ݺ��� ���鼭 Circle��ü ������
		}
		for(int i=0; i<c.length; i++) {
			System.out.print((int)(c[i].getArea())+" "); //(int)�� ����ȯ�ؼ� �Ҽ��� �� �߶�.
		}

	}

}
