package app;

import java.util.Vector;
class Point{
	private int x,y; //�ʵ�
	
	public Point(int x,int y) { //������
		this.x = x;
		this.y = y;
	}
	public String toString() {  //�޼ҵ� toString()�� ����..
		return "(" + x + "," + y + ")";
	}
}
public class VectorŬ���� {

	public static void main(String[] args) {
		// �������� �ٷ�� ���׸� ���� ��ü ����
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); //5����
		v.add(new Integer(4));
		v.add(-1);
		
		//���� �߰��� �����ϱ�
		v.add(2,100); //�ε��� 2�� 100����
		System.out.println("v�� ��� ������ :" + v.size());
		
		//������ ������
		for(int i=0; i<v.size(); i++) {
			int n= v.get(i);  //������ i��° ����
			System.out.println(n);
		}
		
		//���� ���� ��� ���� ���ϱ�
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			int n= v.elementAt(i);  //������ i��° ����
			sum += n;
		}
		System.out.println(sum);
		
		/*
		 * Point Ŭ������ �����ϴ� ���� Ŭ����
		 */
		//���� ��ü ����
		Vector<Point> p = new Vector<Point>();
		
		//Point��ü 3 ����
		//PointŬ���� ��üȭ ��ų���� ��ü ������ �� ������ ��밡��
		Point p1 = new Point(2,3);
		p.add(p1);
		p.add(new Point(-5,20)); //������ ���ÿ� ����p�� ���ٳִ´�.
		p.add(new Point(30,-8));
		
		//���Ϳ� �ִ� Point��ü�� ��� �˻��Ͽ� ���
		for(int i=0; i<p.size(); i++) {
			Point p11 = p.get(i); //������ i��° Point��ü ���� (p11�� Point��üŸ��
			System.out.println(p11);
		}
		
		
	}

}
