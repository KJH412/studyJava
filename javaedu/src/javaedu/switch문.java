package javaedu;

import java.util.Scanner;

/*1~12������ ���� �Է¹޾Ƽ� ��,����,����,�ܿ��� �Ǵ��Ͽ� ����϶�
 * 
 * */
public class switch�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(1~12)�� �Է��ϼ��� : ");
		int month = sc.nextInt();   //�Է¹��� ���ڸ� ������ ����
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");	
			break;
		case 6:	case 7:	case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
			default:
				System.out.println("���� �߸��Է��߽��ϴ�.");
		}
		sc.close();
	}
}
