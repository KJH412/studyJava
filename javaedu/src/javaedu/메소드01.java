package javaedu;

public class 메소드01 {
	//static : 정적(고정된) 클래스 로딩시 static으로 선언된 메소드로 같이 로딩
	//static 결과타입 메소드명(파라미터타입 파라미터명, 파라미터타입 파라미터명,...){
	//    메소드 기능...
	//    return 결과값;
	// }
	//호출이 되어야 실행 된다.
	static int plus(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;  // return : 메소드를 호출한 곳으로 결과값을 돌려줌
	}
	//클래스 실행을 시키면 가장 먼저 항상 실행되는 메소드
	public static void main(String[] args) {
		int hap;
		hap = plus(100, 200); //메소드 호출  hap : plus()메소드 결과를 받아서 저장
		System.out.printf("100과 200의 plus()메소드 결과는: %d\n", hap);

	}

}
