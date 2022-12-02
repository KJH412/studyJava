package javaedu;

public class 상수_원의면적 {

	public static void main(String[] args) {
		final double PI = 3.14; //���대�� ���� ����
		double radius = 10.2;   //���� 諛�吏�由�
		double circleArea = radius*radius*PI; //���� 硫댁�� 怨���
		
		//��硫댁�� 異���
		System.out.print("諛�吏�由� " + radius + ", " );
		System.out.print("���� 硫댁�� = " + circleArea);
	}
}
