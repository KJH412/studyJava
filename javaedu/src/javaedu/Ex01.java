package javaedu;
//�ʴ����� ������ �Է¹ް�, ��ð�, ���, �������� ���Ͽ� ���
//�Է� : 4000
//��� : 1�ð� 6�� 40�� �Դϴ�.
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int time = sc.nextInt();
		int second = time%60;  // �� : 60���� ���� ������
		int	minute = (time/60)%60;  //�� : 
		int hour = (time/60)/60;
		
//		System.out.println(hour + "�ð�" + minute + "��" + second +"��");
		System.out.print(time + "�ʴ�");
		System.out.print(hour + "�ð�,");
		System.out.print(minute + "��,");
		System.out.print(second + "���Դϴ�.");		
		sc.close();
	}
}
