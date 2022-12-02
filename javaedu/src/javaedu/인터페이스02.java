package javaedu;

//Phone : 버튼 20, 전화걸기(), 전화받기()
interface Phone{
	//상수 (final생략됨.)
	int BUTTONS = 20; 
	//abstract 생략된 추상메서드
	void sendCall();  
	void receiveCall();
}
//인터페이스를 상속받아 인터페이스 구현
interface MobilePhone extends Phone{
	//서브기능 추가
	// 추상메서드
	void sendSMS();
	void receiveSMS();
}
interface MP3{
	// 추상메서드
	public void play();
	public void stop();
}

//일반클래스
class PDA{
	//일반 메서드
	public int calculate(int x, int y) { 
		return x+y;
	}
}

/*
 * SmartPhone 클래스 : PDA기능 상속
 *                   MobilePhone, MP3인터페이스에 선언된 메소드 구현
 * */
class SmartPhone extends PDA implements MobilePhone, MP3{

	@Override
	public void sendCall() {
		System.out.println("전화걸기");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받기");
		
	}

	@Override
	public void play() {
		System.out.println("음악재생");
		
	}

	@Override
	public void stop() {
		System.out.println("재생중지");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS보내기");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS받기");
		
	}
	
	//새로운 메소드
	public void schedule() {
		System.out.println("일정관리");
	}
}
public class 인터페이스02 {

	public static void main(String[] args) {
		//객체 생성해서 구체화시키기
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();		
		System.out.println(p.calculate(3, 5));
		p.schedule();
		

	}

}
