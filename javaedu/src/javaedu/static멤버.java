package javaedu;

/* 
 * ��� : �ʵ�� �޼ҵ�
 * static : �����ʵ�� �����޼ҵ带 ���鶧 Ȱ��
 *          ���� ����� ������� �Ҷ�
 *          Ŭ������ ����ɶ� �޸𸮿� ����
 */
class Calc{
	public static int abs(int a) {return a>0 ? a:-a;}
	public static int max(int a, int b) {return (a>b) ? a:b;}
	public static int min(int a, int b) {return (a>b) ? b:a;}	
}
public class static��� {

	public static void main(String[] args) {
		//��ü����
		Calc c = new Calc();
		System.out.println(c.abs(-10));
		
		//System.out.println(Calc.abs(-5));   //static���� ����� �޼ҵ�� ���� Ŭ������. �޼ҵ������ ����
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
		


	}

}
