package javaedu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *  Scanner를 활용한 파일 읽기
 * */
public class 파일입력03 {

	public static void main(String[] args) throws Exception {
		//1.파일열기
		//Scanner sc = new Scanner(System.in); //'키보드'로 입력받은 데이타 읽음.
		//Scanner sc = new Scanner(new File("파일명")); //'파일'을 읽음.
		Scanner sc = new Scanner(new File("c:\\java_work\\temp\\data2.txt"));
		
		//2.파일처리
		int hap = 0;
		while(sc.hasNextLine()) //다음행이 있는지 미리 파악해서 다음 행이 있을 경우 true를 리턴
			hap += sc.nextInt();
		
		System.out.println("합계 : "+ hap);
		
		//3.파일닫기
		sc.close();

	}

}
