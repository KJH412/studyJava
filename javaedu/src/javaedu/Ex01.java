package javaedu;
//초단위의 정수를 입력받고, 몇시간, 몇분, 몇초인지 구하여 출력
//입력 : 4000
//출력 : 1시간 6분 40초 입니다.
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int time = sc.nextInt();
		int second = time%60;  // 초 : 60으로 나눈 나머지
		int	minute = (time/60)%60;  //분 : 
		int hour = (time/60)/60;
		
//		System.out.println(hour + "시간" + minute + "분" + second +"초");
		System.out.print(time + "초는");
		System.out.print(hour + "시간,");
		System.out.print(minute + "분,");
		System.out.print(second + "초입니다.");		
		sc.close();
	}
}
