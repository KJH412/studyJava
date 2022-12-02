package javaedu;

/*
 * �߻�Ŭ���� Calculator �� ��ӹ޴� GoodCalcŬ������ ����
 * */
abstract class Calclator {
	// �߻�޼��� : {}���� �� �޼ҵ��� �ڵ���� ������ ����!  abstract class 
	// => ����� ���� ����Ŭ�������� �����ؼ� ����. =>�޼ҵ�������̵�
	// �޼ҵ�� : add
	// �Ķ���� : int a, int b �޾Ƽ� ó��
	// ���� : ����(int)��
	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	// �޼ҵ��: average
	// �Ķ���� : �������迭(int[]) a
	// ���� : �Ǽ�(double)��
	public abstract double average(int[] a);
}
class GoodCalc extends Calclator { //GoodCalc�� �߻�޼���x

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {   //�߻�޼��� �������̵�(����)
		// TODO Auto-generated method stub
		return a - b;
	}
	@Override
	public double average(int[] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}
public class �߻�Ŭ���� {

	public static void main(String[] args) {
		//�߻�Ŭ������ ��ü(�ν��Ͻ�,��ü) ���� �Ұ���!!
        //Calclator ca = new Calclator();(X)
        
		GoodCalc c = new GoodCalc();  //�߻�Ŭ����(Calclator)�� ��ӹ��� ����Ŭ����(GoodCalc)�� ��ü���� ����.
        
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[] {2,3,4}));
        
	}

}
