package javaedu;

import java.util.Scanner;

/*1.원하는 배수의 합계를 구하는 계산기
 * - 입력한 두수 사이의 합계를 구하되 배수를 선택하여 합계를 구하라
 *  100~200사이의 4의 배수 합계
 *  입력 : 100
 *        200
 *        4
 *  출력 :      
 * 2. 0~9중에서 입력한 숫자만큼 별표를 출력하라
 * -입력 5914
 * -출력 *****
 *     *********
 *     *
 *     ****
 *     *************************************************************************
 *     Scanner입력시 주의사항
 *     int는 nextInt로 char는 nextLine으로 받으면 문제가 생긴다.
 *     => 숫자를 입력받고 엔터를 치면 Exception이 발생한다.
 *     nextInt()로 입력을 받기 때문에 개행문자 전까지만 입력을 받고 개행문자(\n)는
 *     다음 nextLine이 읽었기 떄문이다.
 *     이를 해결하기 위해선 nextInt()와 nextLine() 함수 사이에 nextLine()함수를
 *     한번 더 사용해 개행문자를 제거하도록 한다.
 *     
 * */
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //한번 써놓으면 또 쓸 필요x
		//1번
		int start, end;
		int basu;
		int j,hap=0;
		
		System.out.printf("합계의 시작 숫자 ==> ");
		start = sc.nextInt();
		System.out.printf("합계의 끝 숫자 ==> ");
		end = sc.nextInt();
		System.out.printf("배수 ==> ");
		basu = sc.nextInt();
		
		sc.nextLine();
		
		j=start;
		while(j<=end) {
			if(j%basu == 0) {
				hap += j;
			}
			j++;
		}
		System.out.printf("%d부터 %d까지 %d배수의 합계 ==> %d\n", start, end , basu, hap);
				
		
		//2번
		String str; //문자열 변수
		char ch; //문자
		int i,k;
		int star;
	
		System.out.printf("숫자를 여러개 입력 : ");
		str = sc.nextLine(); //5914
		
		i = 0;
		//String 변수 : 문자열에 제공되는 메소드. charAt(i):i번째 문자 한글자 추가
		ch= str.charAt(i);  //5
		while(true) {
			star = (int)ch - 48; //문자를 숫자로 변환. 문자 1은 아스키 코드가 49, 문자5는 53
			
			for(k=0; k<star; k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			
			if(++i > str.length() -1) { //i=1, str.lenght()=4
				break;
			}
			ch = str.charAt(i);  //ch=9
		}
	}
}
	