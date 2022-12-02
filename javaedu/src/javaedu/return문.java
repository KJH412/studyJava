package javaedu;

public class return문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			hap += i;
		}
		System.out.printf("1부터 100까지의 합은 %d입니다.\n", hap);
		
		if(hap>5000)
			return;
		
		System.out.printf("프로그램의 끝입니다."); //한번도 실행되지 않는다.

	}

}
