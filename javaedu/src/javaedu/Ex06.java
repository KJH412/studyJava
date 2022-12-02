package javaedu;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * 구구단 파일 만들기
 * */
public class Ex06 {

	public static void main(String[] args) throws Exception {
		// 1.파일열기
		// - 구구단을 출력할 파일
		int i, k;

		// PrintWriter클래스(스트림) : 출력
		// print/println/printf
		// PrintWriter pw = new PrintWriter(System.out); 화면출력
		PrintWriter pw = new PrintWriter("c:\\java_work\\temp\\gugu.txt"); // 파일출력

		// 2.파일처리
		// - 구구단 출력
		String str = "";
		for (i = 2; i <= 9; i++) {
			str += "#제" + i + "단#"; // str = str
		}

		pw.println(str);
		pw.println(); // new line
		str = "";

		// 구구단을 str에 저장
		for(i=1; i<=9; i++) { 
			for(k=2; k<=9; k++) {
				str += k+"X"+i+"="+(k*i)+"\t";

			}
			str += "\n";	//+=를 =로 써놔서 \n만 계속 로드?된거라 구구단이 gugu.txt에 안떴음.
		}
		System.out.println(str);
		pw.print(str);
		
		// 3.파일닫기
		pw.close();
	}
}
