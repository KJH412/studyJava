package javaedu;

import java.util.Scanner;

public class scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸�,����,����,ü��,���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
		//�ν��Ͻ�(��ü) ����
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); //���ڿ�
		System.out.println("����� �̸���" + name + "�Դϴ�.");
		
		String city = sc.next(); //���ڿ�
		System.out.println("����� �̸���" + city + "�Դϴ�.");
		
		int age = sc.nextInt(); //����
		System.out.println("����� ���̴�" + age + "�Դϴ�.");
		
		double weight = sc.nextDouble(); //�Ǽ�
		System.out.println("����� ü����" + weight + "�Դϴ�.");
		
		boolean single = sc.nextBoolean(); //�Ҹ�
		System.out.println("����� ���� ���δ�" + single + "�Դϴ�.");
		
		sc.close();
	}
}
