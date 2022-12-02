package javaedu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/* 
 * FileReaser로 파일 열기
 * BufferdReader로 파일 읽기
 * 파일 닫기
 * */
public class 파일입력02 {

	public static void main(String[] args) throws Exception {
		// 1.파일열기
		// read()메소드 : 한 글자씩 읽기
		FileReader fReader = new FileReader("c:\\java_work\\temp\\data1.txt");
		
		// 2.파일처리
		int i = 0;
		//한줄단위로 읽는 메소드를 이용하기 위함
		BufferedReader bReader = new BufferedReader(fReader);
		
		String str = null;
		
		while((str = bReader.readLine()) != null){ //한줄씩 읽는 메소드
			i++;
			System.out.printf("%d행 : %s\n", i, str);
		}
		
		// 3.파일닫기
		bReader.close();
		fReader.close();

	}

}
