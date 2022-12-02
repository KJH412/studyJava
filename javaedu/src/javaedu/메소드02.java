package javaedu;

public class �޼ҵ�02 {

	public static void main(String[] args) {
		int n = 10;   //����
		/*
		 *  �Ű������� byte, int, double�� �⺻Ÿ������ ����
		 *  ���� ������ ����.  �������� ���� ������� ����.
		 */
		increase(n);   //�޼ҵ�(��)
		
		System.out.println(n);

		//��ü(�ν��Ͻ� ����) : �������� 10�� pizza��ü
		Circle pizza = new Circle(10);
		
		/*
		 * ��ü�� �Ű������� ���� �� ��쿡�� ��ü ���۷���(�ּ�)���� ����
		 * ��ü ����
		 * �迭�� ���� : �迭 ���۷���(�ּ�)�� �Ķ���Ϳ� ����. ������
		 */
		increase_obj(pizza);  //�޼ҵ�(��ü)
		System.out.println(pizza.radius);		

		//�迭�� �Ķ���ͷ� ����
		int a[] = {1,2,3,4,5};
		increase_arr(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
		/*
		 * ���ڿ��� ���鹮�ڸ� ,�� ��ü 
		 */
		char c[] = {'T' , 'h', 'i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		//�迭 ���� c���		
		printCharArray(c);
		
		//����('')���ڸ� ','�� ��ġ
		replaceSpace(c);
		//�迭 ���� c���		
		printCharArray(c);
	}
	
	static void increase(int m) { //������ ���� ����
		m = m+1;
	}
	static void increase_obj(Circle m) {  //(Circle�̶��?)������ ��ü(m)�� �޾Ƽ� ó��
		m.radius++;
	}

	static void increase_arr(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
	
	//printCharArray(c); ���� �迭 c�� �Ķ���ͷ� ����
	static void printCharArray(char a[]) {
	    for(int i=0; i<a.length; i++) {
	    	System.out.print(a[i]);
	    }
	    System.out.println();
	}
	//replaceSpace(c); ���� �迭 c�� �Ķ���ͷ� ����
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}	
	}			
}
/*
 * 
 * 
 * 
 * 
 */