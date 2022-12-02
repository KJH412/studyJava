package javaedu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * FileWriter 를 이용하여 파일에 한줄씩 쓰기
 * - 문자열을 직접 파일에 씀
 * */
public class 파일출력02 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//1.파일열기
		FileWriter fw = new FileWriter("c:\\java_work\\temp\\data4.txt");
		
		//2.파일처리
		String str;
		
		//nextLine(): 한줄씩 입력하는 데이타를 문자열로 리턴
		//().equals("") .앞부분과 뒤괄호속값이 같아야함
		//String클래스 : equals()메소드 (값만같으면 true), ==(값,주소둘다같아야)
		while(!(str = sc.nextLine()).equals("")) { //입력한 행이 공란이 아닐때까지 반복
			//write()메소드:파일에 데이타를 쓰는 메소드
			fw.write(str+"\r\n");
		}
		
		//3.파일닫기
		fw.close();
	}

}
