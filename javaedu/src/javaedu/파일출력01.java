package javaedu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * FileOutStream 을 이용해서 1바이트씩 파일에 쓰기
 * write()메소드
 * */
public class 파일출력01 {

	public static void main(String[] args) throws Exception {
		//1.파일열기
		//쓰기위한 파일 열기
		FileOutputStream fos = new FileOutputStream("c:\\java_work\\temp\\data3.txt");
		
		//2.파일처리
		int ch;
		//System.in(바이트코드) -> Scanner(정수,문자..)
		//키보드로부터 입력된 키값 바이트코드로 리턴
		//13 : 엔터키
		while((ch = System.in.read()) != 13) {
			fos.write((byte)ch);
		}
		
		//3.파일닫기
		fos.close();
	}

}
