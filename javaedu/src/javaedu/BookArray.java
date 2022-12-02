package javaedu;

import java.util.Scanner;

/*
 * 클래스명 : Book
 *    필드 : title, author
 *    => 객체 배열을 만들고 사용자로부터 제목과 저자를 입력받아 배열 생성
 * */
public class BookArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] book = new Book[2]; // book : Book 객체배열

		for(int i =0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			
			System.out.print("저자>>");
			String author = sc.nextLine();
			
			book[i] = new Book(title, author); //객체 생성(생성자:파라미터를 넘김)
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.print("("+book[i].title + "," + book[i].author + ")");
		}
	}

}
