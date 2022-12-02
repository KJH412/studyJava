package javaedu;
/*
 * 1부터 10까지 출력 단, 덧셈으로 표시하고 합을 출력*/
public class for문 {

	public static void main(String[] args) {
		int i, sum = 0;
		for(i=1; i<=10; i++) {
			sum += i; //i가 1일 경우 sum = sum +1; -> sum : 1
			System.out.print(i);
			if(i<=9) {   //1~9까지는 +출력
				System.out.print("+");
			}else { //i가 10인 경우
				System.out.print("=");
				System.out.println(sum);
			}
		}
		
		int dan=8;
		for(i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);			
		}
		
        //2중 중첩 for문을 이용해서 구구단 전체 출력
		for(i=1; i<10; i++) { //단에 해당하는 for문
			for(int j=1; j<10; j++) { //각 단의 곱셈
				System.out.printf("%d x %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
}
