package javaedu;

public class ���ܹ߻�01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0;

		try {
			System.out.printf("%d�� %d�� ������ ���� %d�Դϴ�.\n", a, b, (a / b)); //�̰͸� ����(0���� ��������)������.
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}

		int[] aa = new int[3]; // 0, 1, 2
		try {
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε����� ũ�⺸�� ũ��.");
		}
		//���� �޼��� ���� �����
		int result=0;
		try {
			if(b==0) {
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
			}
			
			result =a/b;
		}catch(Exception e){
			System.out.print("�߻����� ==> ");
			System.out.println(e.getMessage());
		}
		System.out.printf("��� ==> %d\n" ,result);
	}
}
