package app;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListŬ���� {

	public static void main(String[] args) {
		// ���ڿ��� ���� ������ ArrayList�÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸��� �Է¹޾Ƽ� ArrayList����
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String s = sc.next();
			a.add(s); //ArrayList�÷��ǿ� ��� ����
			
		}
		for(String s1:a) {
			String name =s1;
			System.out.print(name + " ");
		}
		//���� �� �̸� ���
		int longIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longIndex).length() <a.get(i).length()){
				longIndex = i;
			}
		}
		System.out.println("\n���� �� �̸��� : "+ a.get(longIndex));

	}

}
