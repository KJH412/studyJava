package javaedu;
/*
 *�� Ŭ���� ������ �ΰ� �̻��� �̸��� ���� �޼ҵ� => ������, �Ϲݸ޼ҵ�
 * -�޼ҵ��̸�����
 * -�Ķ������ ������ �ٸ��ų� Ÿ���� ���� �޶����
 * -�޼ҵ�����ε� ����: �Ű�����
 */
class MethodSample{
	public int getSum(int i, int j) {  //�Ķ���� ���� : 2
		return i+j;
	}
	public int getSum(int i , int j , int k) { // �Ķ���� ���� : 3
		return i+j+k;
	}
	public double getSum(double i , double j) {  //�Ķ���� Ÿ��
		return i + j;
	}
}


public class �޼ҵ�����ε� {

	public static void main(String[] args) {
		//��ü ���� -> ��ü(�ν��Ͻ�)
		
		MethodSample m = new MethodSample();
		int i = m.getSum(1, 2); //i=3
		int j = m.getSum(1, 2, 3); //j=6
		double k = m.getSum(1.1, 2.2); //k=3.3

	}

}
