package javaedu;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ���� 3���� �Է¹޾Ƽ� ���� ���϶�.
 * ���� ������ �ƴ� ���ڸ� �Է��Ҷ� ����ó���� �Ͽ� �ٽ� �Է� �޵��� ��.
 * */
public class ���ܹ߻�02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ��� ==>");
		int sum=0, n=0;
		
		for(int i=0; i<3; i++) {  //0, 1, 2  for�� ��������
			try {
				n=sc.nextInt();		//n = a(������ �ƴ� ����a �Է��ϸ�)
			}catch(InputMismatchException e){ 
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���");
				sc.next(); //�Է¹��� ����Ÿ ������.
				i--; //3������ �����°Ծƴ϶� ���ܰ�(-1)�� ���ư�����.
				continue;   //�Ʒ��κ��� �������� �ʰ� �ٽ� for������ �Ѿ.
			}			
			sum += n;
		}
		System.out.println("���� "+sum);
		sc.close();

	}

}
