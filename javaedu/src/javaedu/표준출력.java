package javaedu;

public class ǥ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��ϼ���?"); //new line
		System.out.println("Java�Դϴ�.");

		System.out.print("�ȳ��ϼ���?");
		System.out.print("Java�Դϴ�.");
		
		System.out.printf("\n"); //new line
		/* %d : ������ ���
		 * %f : �Ǽ��� ���
		 * %c : ���� ���(�ѹ���, ��¹��ڸ� ���� ����ǥ('')�� ���´�.)
		 * %s : ���ڿ� ���(���ڿ�, ��¹��ڿ��� ū ����ǥ("")�� ���´�.)
		*/
		System.out.printf("100\n"); //����100
		System.out.printf("%d\n",100); // ��������
		
		System.out.printf("100+100\n"); //���� 100+100
		System.out.printf("%d\n",100+100); // %d : ����
		//100+200�� ���� ����� ���� �� �ֵ��� %d�� 3�� �̿��ؼ� System.out.printf()���� ����� ����
		//ȭ�� : 100+200 = 300
		System.out.printf("%d + %d = %d\n", 100,200, 100+200);
		//2.�������� ����� ������ ���
		//ȭ�� : 100/200 = 0.5
		System.out.printf("%d / %d = %d\n",100,200, 100/200);
		System.out.printf("%d / %d = %f\n",100,200, 100.0/200.0);
		
		System.out.printf("%c %c \n", 'a', 'b');
		System.out.printf("%s %s \n", "Java Programming", "���͵� ī��");
		
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123); //5d 5�ڸ����缭 ��µ�.
		System.out.printf("%05d\n", 123); // 05d 5�ڸ� ���ߴµ� �������ڸ��� 0���� �޲�.
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45); //�Ҽ������� 1�ڸ�
		System.out.printf("%7.3f\n", 123.45); //�Ҽ������� 3�ڸ�
		
		System.out.printf("%s\n", "Hi~Java");
		System.out.printf("%10s\n", "Hi~Java"); 
		
		/* \n : ���ο� �ٷ� �̵�(new line) 
		 * \t : <tab>Ű�� ���� ȿ��
		 * \b : <back space>Ű�� ���� ȿ��
		 * \r : <home>Ű�� ���� ȿ��
		 */
		
		int a,b,c,d;
		
		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		
		d = a + b + c;
		//ȭ�� : 
		//a,b,c,d�� �� ==> 200, 300, 400, 900�� ��� �ǵ��� prinf(); �� �̿��ؼ� �ۼ�
		System.out.printf("a,b,c,d�� �� ==> %d,%d,%d,%d\n", a,b,c,d); 
		
		
	}

}
