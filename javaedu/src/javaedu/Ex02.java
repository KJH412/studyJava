package javaedu;

import java.util.Scanner;

/* while문을 이용하여 정수를 여러개 입력받고 평균을 출력하라.
 * 
 * */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=0,  //초기값
		count=0, number;
		double sum = 0;
		//0을 입력 받을때 까지 반복 (조건식안에 넣으면 증감식i++필요없음)
		System.out.printf("점수를 입력하세요 : ");
		while((number = sc.nextInt()) != 0 ) {
			sum += number; //sum = sum + number;
			count++;
		}
		System.out.println("입력한 수의 갯수는 : " + count);
		//System.out.printf("입력한 수의 갯수는 : %d\n" , count);
		System.out.println("평균은" + sum/count);
		//System.out.print("평균은 : %f\n" , sum/count);
		
		sc.close();

	}

}
