package app;

public class wrapperŬ���� {

	public static void main(String[] args) {
		
		//wrapperŬ���� ��ü ����
		Integer i = new Integer(10);
		Character c = new Character('c');

		// ���ڿ��� �⺻Ÿ������ ��ȯ
		// IntegerŬ������ �ִ� parseInt()�޼ҵ带 �̿�
		int in = Integer.parseInt("123");

		// Character ���
		// char c1 = 'A'
		System.out.println(Character.toLowerCase('A')); //�ҹ��� ��ȯ .toLowerCase()
		char c1 = '4', c2 = 'F';
		if (Character.isDigit(c1)) { //c1�� ������ ��� true
			System.out.println(c1 + "�� ����");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2 + "�� ������");
		}

		// Integer���
		System.out.println(Integer.parseInt("28"));  //����(�⺻Ÿ��)Ÿ������ ��ȯ .parseInt()
		System.out.println(Integer.toString(28));    //���� 28�� ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(28)); //������ 16������ ���ڿ�

		// Double���
		Double d = new Double(3.14);
		System.out.println(Double.parseDouble("3.14")); //"3.14"(���ڿ�)�� doubleŸ������ ��ȯ.parseDouble()

	}
}
