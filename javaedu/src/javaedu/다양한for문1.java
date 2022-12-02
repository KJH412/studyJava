package javaedu;

public class 다양한for문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		for(i=1,k=1; i<=9; i++, k++) {
			System.out.printf("%d x %d = %d \n",i,k,i+k);
		}
		//0~9를 출력하는 3가 for문
		//1.기본형식
		for(i=0; i<10; i++) {
			System.out.printf("%d",i);
		}
			System.out.printf("\n"); //줄바꿈
			
		//2. 초기값 빼기			
		i=0; //초기값 선언
		for(;i<10;i++) {
			System.out.printf("%d", i);			
		}
			System.out.printf("\n");
			
		//3.초기값과 증감식 빼기
		i=0; //초기값
		for(;i<10;) {
			System.out.printf("%d", i);	
			i++;  //증감식
		}
			System.out.printf("\n");
			
		//4.무한 루프
		i=0;
		for(;;) {  //초기값,조건식, 증감식이 없으면 무한루프
			System.out.printf("%d\n",i);
			i++; //증감식
		}

	}

}
