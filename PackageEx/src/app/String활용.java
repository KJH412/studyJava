package app;

public class StringȰ�� {

	public static void main(String[] args) {
		// String��ü �����ؼ� ���
		String a = new String("C#"); // String a = "C#";
		String b = new String(",C++"); //String b = ",C++";
		
		//���ڿ��� ���� : length()	
		System.out.println(a+"�� ���̴�"+a.length());
		
		//���ڿ��� ���԰��� : contains()
		System.out.println(a.contains("#"));
		
		//���ڿ� ���� : concat()
		a = a.concat(b);
		System.out.println(a);
		
		//���ڿ� ��������(��/��) : trim()
		a = a.trim();
		System.out.println(a);
		
		//���ڿ� ��ġ : replace()	
		a = a.replace("C#", "java");
		System.out.println(a);
		
		//���ڿ� �и� : split()	
		String s[] = a.split(",");
		for(String ar:s) {
		System.out.println(ar);
		}
		
		//�ε��� 5���� ������ �ڸ��� : substring(5)
		a= a.substring(5);
		System.out.println(a);
		
		//�ε��� 2�� �ѹ��ڸ� ���� : charAt(2)
		char c = a.charAt(2);
		System.out.println(c);
		
		
		

	}

}
