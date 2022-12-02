package javaedu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 파일에서 읽어온 문자열을 파일에 거꾸로 출력
 * in.txt읽어서 out.txt를 출력한다.
 * 
 * */
public class Ex07 {

	public static void main(String[] args) throws Exception {
		//1.파일열기
		Scanner sc= new Scanner(new File("c:\\java_work\\temp\\in.txt"), "utf-8");
		PrintWriter pw = new PrintWriter("c:\\java_work\\temp\\out.txt");
		
		//2.파일처리
		String str1, str2 ="";  //읽은 문자열 str1,순서를 바꾼 문자열 str2
		
		while(sc.hasNextLine()) { //다음 줄이 있는지 없는지 감지
			str1 = sc.nextLine(); //한줄읽기
			
			int size = str1.length(); //10
			for(int i=size-1; i>=0; i--) {
				str2 += str1.charAt(i);
			}
			System.out.println(str2);
			pw.println(str2);
			str2 = "";
		}
		
		//3.파일닫기
		sc.close();
		pw.close();

	}

}
