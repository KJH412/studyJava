package javaedu;

import java.util.Scanner;

/*
 * Ŭ������ : Book
 *    �ʵ� : title, author
 *    => ��ü �迭�� ����� ����ڷκ��� ����� ���ڸ� �Է¹޾� �迭 ����
 * */
public class BookArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] book = new Book[2]; // book : Book ��ü�迭

		for(int i =0; i<book.length; i++) {
			System.out.print("����>>");
			String title = sc.nextLine();
			
			System.out.print("����>>");
			String author = sc.nextLine();
			
			book[i] = new Book(title, author); //��ü ����(������:�Ķ���͸� �ѱ�)
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.print("("+book[i].title + "," + book[i].author + ")");
		}
	}

}
