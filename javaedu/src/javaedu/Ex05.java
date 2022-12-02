package javaedu;

import java.util.Scanner;

/*
 * ����ó���� Ȱ���� ������ ����
 * +, 1, *, / 
 * ��,0���� �����ų� 0�� ���ϴ� ���� ����ó��, ó������� ������ ���͵� ����ó��
 * */
public class Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,result = 0;
		char ch; //����(�ѱ���,1����Ʈ)
		
		System.out.printf("ù��° ���� �Է��ϼ��� : ");
		a = s.nextInt();
		
		System.out.printf("����� �����ڸ� �Է��ϼ��� :");  //+ = * /
		ch = s.next().charAt(0);  //next():���ڿ�, nextLine():���ٴ���
		                          //String.charAt(i):�ε����� i��°�� ���� �ѹ��ڸ� ����
		
		System.out.printf("�ι�° ���� �Է��ϼ��� : ");
		b = s.nextInt();
		
		try {
		switch(ch) {
		case '+':
			result = a+b;  //����� ����
			break;
		case '-':
			result = a-b; //����� ����
			break;
		case '*':
		    if(a==0 || b==0) {
		    	//���� ����
		    	throw new Exception("0���� ���ϸ� ������ 0�Դϴ�.");
		    }	    
			result = a*b; //����� ����, 0���� ����
			break;
		case '/':
			if(b<0) {
				throw new Exception("0���� ���� �� ����.");
			}
			result = a/b; //����� ����, 0���� ������
			break;
		}
		if(result<0) {
			//�������� 
			throw new Exception("����� �����̴�.");
		}
		
		   System.out.printf("����� ==> %d\n",result);
		}
        catch(Exception e){  //���ܰ� �߻��ϸ� ����Ǵ� ��
		System.out.println(e.getMessage()); //����ڰ� ���� ���� �޼��� ���	
		}
		System.out.println("���α׷�����");
	}
}
