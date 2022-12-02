package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. 주소파일 
 * 2.핸드폰클래스
 * 필드: 이름,나이,전화번호
 */
class address {
	String name;
	String age;
	String phone;
}

public class HandPhone {
	static String fname = "c:\\java_work\\temp\\juso.txt"; //전역변수static
	
	//무조건 실행이 되는 main()메소드
	public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(System.in);
          String select = "";
          System.out.printf("\n### 친구 연락처 관리 ###\n");
          
          while(!(select.equals("4"))) {  //스트링은 .equals()로 써주어야함. (while(select !="4"){}안됌)
        	  print_menu();        //메소드 호출
        	  select = sc.next();  //메뉴입력
        	  System.out.println(!(select.equals("4")));
        	  
        	  switch (select) {
        	  case "1":view_juso(); break;
        	  case "2":add_juso(); break;
        	  case "3":delete_juso(); break;
        	  case "4":return;
        	  default: System.out.printf("\n잘못된 메뉴를 입력했습니다. 다시선택하세요.\n");
        	  }
          }
	}
	// 메뉴
	static void print_menu() {
		System.out.printf("\n");
		System.out.printf("1.연락처 출력 \n");
		System.out.printf("2.연락처 등록 \n");
		System.out.printf("3.연락처 삭제 \n");
		System.out.printf("4.끝내기 \n");
		
	}
	// <친구 연락처 파일에 입력된 내용을 읽어서 화면에 출력>
	/*
	 * FileReader
	 * -FileReader(file)
	 * -FileReader(file, charest)
	 * -한글자씩 읽어서 글자의 아스키코드값 리턴.  String으로 받으면안돼고 int로 받아야함.
	 * -파일을 다 읽으면 -1을 리턴. return
	 * BufferedReader
	 * -BufferedReader(reader); 
	 * 
	 * Scanner
	 * files
	 * */
	static void view_juso() throws Exception { //FileReader()를 예외처리해서 throws Exception생김.
		String str = "";
		
		//1.열기
		//FileReader fr = new FileReader(fname);
		//BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		//2.처리
		//FileReader클래스 read()메소드 : return값이 정수형
		for(int i=1; ; i++) {
			if(!br.ready()) {
				break;
			}else {
				str = br.readLine(); //한줄 읽어서 스트링으로 리턴
				System.out.printf("%2d: %s\n", i, str);  //출력할때 1.홍길동 2.김수현 앞 숫자는 i값을 출력한것임.
			}
		}
		
//		FileReader fr = new FileReader(fname); //읽긴 읽음
//		int ch;
//		while((ch=fr.read() != -1)) {
//			System.out.print((char)ch);
//		}
		
		//3.닫기
		br.close();
	}
	
	// <친구 연락처 추가>
	static void add_juso() throws Exception {
		Scanner sc = new Scanner(System.in);
		address adr = new address();
		
		String wstr = "";
		
		//친구 주소를 쓰기위한 파일을 추가모드로 열기
		//1.열기
		FileWriter fw = new FileWriter(fname, true); //,true 기존애들은그대로 새로작성하면 추가됨
		
		//2.처리
		System.out.printf("이름 입력 ==> ", null);
		adr.name = sc.nextLine();                    //한줄을 String으로 리턴
		System.out.printf("나이 입력 ==> ", null);
		adr.age = sc.nextLine();                    //한줄을 String으로 리턴
		System.out.printf("전화번호 입력 ==> ", null);
		adr.phone = sc.nextLine();                    //한줄을 String으로 리턴
		
		//입력된 3개의 문자열을 하나의 문자열로 만듦
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone + "\n";
		
		//write():파일(fw.)에 문자열 쓰는 메소드
		fw.write(wstr);
		
		//3.닫기
		fw.close();
	}
	
	// <연락처 파일에서 선택한 연락처를 삭제>
	static void delete_juso() throws Exception {
		//삭제할 번호를 입력
		Scanner sc = new Scanner(System.in);
		
		//연락처 파일 내용 전체를 저장하기 위한 문자열 배열 (read_str에 통채로 저장)
		String[] read_str = new String[50];
		String str = "";
		int del_line, i , count=0;
		
		//1.열기
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		//파일 존재 여부를 리턴
		if(!br.ready()){
			System.out.printf("\n!연락처 파일이 없습니다 !!\n");
			return;
		}
		
		//2.처리
		System.out.printf("\n삭제할 행 번호는? ");
		del_line = sc.nextInt();  //삭제할 번호가 del_line에 들어감
		 
		for(i=0; i<50; i++) {  //50은 그냥 임의의 숫자로 넣어둔것임
			//파일에 데이타가 있는동안 반복
			if((str= br.readLine()) == null) { //null아무것도 없을때까지 돌고 break.
				break;
			}
			if(i+1 != del_line) {   //null이 아니면 read_str에 홍길동이들어가고..홍길동+1은 다음순서인 김수현?
				read_str[count] = str + "\n"; 
				count++;
			}else {
				System.out.printf("%d행이 삭제되었습니다.\n", del_line);
			}			
		}
		
		//파일(fname)을 쓰기 모드로 열고, 새로운 내용을 쓴다.
		FileWriter fw = new FileWriter(fname);
		for(int j=0; j<count; j++) {
			fw.write(read_str[j]);
		}
		//3.닫기
		br.close();
		fw.close();		

	}

}
