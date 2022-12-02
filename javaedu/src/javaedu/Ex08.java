package javaedu;
/*
 * 클래스명 : Pet
 *         필드 : 종류(type), 개월수(age)
 *         메소드 : 움직인다 
 * 객체생성하고 종류와 개월수 움직임
 * */
class Pet{
	String type;
	int age;
	
	void move(String m) {
		System.out.println(this.type + "가" + m);
	}
	//age데이타 저장
	public void setAge(int a) {
		this.age = a;
	}
	//age 데이타 읽어오기
	public int getAge() {
		return this.age; //this
	}
}
public class Ex08 {

	public static void main(String[] args) {
		//객체 생성
		Pet dog = new Pet();
		dog.type = "강아지";
		
		//age에 데이타 저장
		//dog.age = 8;
		dog.setAge(8);
		
		//age의 데이타를 읽어오기
		System.out.println(dog.type + "는" + dog.age + "개월입니다.");
		
		dog.move("짓는다");
	}

}
