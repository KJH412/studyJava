package javaedu;

import java.util.Scanner;

/*
 * ������ �г��� �Է¹޾� 60�� �̻��̸� �հ�, �̸��̸� ���հ��� ���
 * ��, 4�г��� 70�� �̻��̾�� �հ�
 * ��if���̳� else��, if-else�� �ȿ� if���̳� if-else���� �� �� �ִ�.
 *   if(���ǹ�){
 *         if(���ǹ�){
 *         } else{
 *         }
 *   } else{
 *     if(���ǹ�){
 *     } else{
 *     }
 *   }
 * */
public class ifelse������ {

	public static void main(String[] args) {
		//��ü(�ν��Ͻ�) ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(1~100): ");
		int score = sc.nextInt();
		
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		int year = sc.nextInt();
		
		if(score>=60) {
			if(year != 4) {   //4�г��� �ƴ� ���
			System.out.println("�հ�");
			}else if(score >= 70) {   //4�г�
				System.out.println("�հ�");				
			}else {
				System.out.println("���հ�");
			}
		}else {
			System.out.println("���հ�");
		}
	}
}
