package javaedu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 1.파일을 읽고 화면에 출력
 * 2.키보드로 입력하고 파일에 출력
 * 3.파일을 읽고 파일에 출력(win.ini복사)
 * */
public class 파일입출력01 {

	public static void main(String[] args) throws Exception {		
		//1.파일열기
		//읽기위한 파일, 쓰기위한 파일에 대한 스트림(객체생성)
		FileInputStream fis = new FileInputStream("c:\\Windows\\win.ini");
		FileOutputStream fos = new FileOutputStream("c:\\java_work\\temp\\data5.txt");
		
		//2.파일처리
		int ch;
		while((ch = fis.read()) != -1) {  //read() : FileInputStream의 메소드. 1바이트씩 읽음. 파일의 끝을 읽으면 -1을 리턴.
			fos.write((byte)ch);
		}
		
		//화면에 출력
		System.out.println("복사완료");
		
		//3.파일닫기
		fis.close();
		fos.close();

	}

}
