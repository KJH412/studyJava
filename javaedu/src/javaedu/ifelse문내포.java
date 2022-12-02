package javaedu;

import java.util.Scanner;

/*
 * 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력
 * 단, 4학년은 70점 이상이어야 합격
 * ※if문이나 else문, if-else문 안에 if문이나 if-else문이 올 수 있다.
 *   if(조건문){
 *         if(조건문){
 *         } else{
 *         }
 *   } else{
 *     if(조건문){
 *     } else{
 *     }
 *   }
 * */
public class ifelse문내포 {

	public static void main(String[] args) {
		//객체(인스턴스) 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요(1~100): ");
		int score = sc.nextInt();
		
		System.out.print("학년을 입력하세요(1~4): ");
		int year = sc.nextInt();
		
		if(score>=60) {
			if(year != 4) {   //4학년이 아닌 경우
			System.out.println("합격");
			}else if(score >= 70) {   //4학년
				System.out.println("합격");				
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
	}
}
