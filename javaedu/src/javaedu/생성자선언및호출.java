package javaedu;
/*
 * Ŭ����:Book
 * �ʵ�:title, author
 * ������: 1.title�� �Ķ���ͷ� �޾Ƽ� �ʱ�ȭ
 *       2.title,author �� �Ķ���ͷ� �޾Ƽ� �ʱ�ȭ
 *       
 *�ν��Ͻ�����
 */
class Book {
	String title;
	String author;
	
	Book(){}
	
	//������
	public Book(String t) {
		title= t;
		author = "���ڹ̻�";		
	}
	//������
	public Book(String t, String a) {
		title = t;
		author = a;
	}
}
public class �����ڼ����ȣ�� {

	public static void main(String[] args) {		
		// ��ü����
		Book javabook = new Book("java","ȫ�浿"); //�Ķ�����ִ»����� ȣ��
		Book bible = new Book("Bible");  //�Ķ���;��»����� ȣ��

	}

}
