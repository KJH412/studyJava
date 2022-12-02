package javaedu;
/*
 * 클래스:Book
 * 필드:title, author
 * 생성자: 1.title을 파라미터로 받아서 초기화
 *       2.title,author 을 파라미터로 받아서 초기화
 *       
 *인스턴스생성
 */
class Book {
	String title;
	String author;
	
	Book(){}
	
	//생성자
	public Book(String t) {
		title= t;
		author = "작자미상";		
	}
	//생성자
	public Book(String t, String a) {
		title = t;
		author = a;
	}
}
public class 생성자선언및호출 {

	public static void main(String[] args) {		
		// 객체생성
		Book javabook = new Book("java","홍길동"); //파라미터있는생성자 호출
		Book bible = new Book("Bible");  //파라미터없는생성자 호출

	}

}
