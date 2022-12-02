package javaedu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 1바이트씩 읽어 들이기
 * 파일을 읽어서 화면에 출력
 * 입력 스트림: FileInputStream  => 한글이깨짐
 * read()
 * */
public class 파일입력01 {

	public static void main(String[] args) throws Exception {
		//1. 파일 열기(객체 생성)
		//  - 예외 : 파일이 없음 - 파일 경로가 틀린경우(디스크고장)
		//          파일을 읽거나 쓸 수 없는 경우 - 디스크 공간이 모자라거나 디스트가 깨진 경우
		FileInputStream fis = new FileInputStream("c:\\java_work\\temp\\data1.txt");	
				
		//2. 파일 처리
		int ch;
		//read()메소드 : 데이타를 읽는 메소드. 파일의 끝일 경우 -1을 리턴한다.
		//              1바이트씩 읽음
		while((ch = fis.read()) != -1)
			System.out.print((char)ch);  //(char)바이트: 형변환
		
		//3. 파일 닫기
		fis.close();

	}

}
