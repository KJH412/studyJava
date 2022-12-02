package app;

/*
 * FileReader(또는Scanner) , FileWriter(또는PrintWrite )
 * 두 숫자의 사칙연산을 해서 결과를 출력 (+, -, *, /)

      단, 나누어 지는 수와 나누는 수가 0으로 나누었을때 오류메세지 출력
          처리결과가 음수로 나와도 오류 메세지를 출력
      과 같은 예외 처리를 한다.
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {

	public static void main(String[] args) throws Exception {
		// 1. 파일읽기
		FileReader fReader = new FileReader("c:\\java_work\\in.txt");

		//결과 출력할 out파일
		FileWriter fileWriter = new FileWriter("c:\\java_work\\out.txt");

		// 2.파일처리
		int i = 0;
		
		// 한줄단위로 읽는 메소드
		BufferedReader bReader = new BufferedReader(fReader);
		
		String str = null;	// 한줄씩 읽는 메소드
		String result = ""; // 한줄씩 결과를 넣을? 문자열 result
		while ((str = bReader.readLine()) != null) { //in.txt 한줄씩 읽음.
			
			i++;					
			
			String a = str.split(" ")[0]; //split(" ")공백을 기준으로 나눔. 첫번째 문자
			String b = str.split(" ")[1]; //" "공백을 기준으로 두번째
			
			int A = Integer.parseInt(a);  //문자(숫자인 문자)를 정수 숫자로 취급
			int B = Integer.parseInt(b);           
			
			//System.out.println("읽은숫자 :"+ a + " " + b);
			result += "읽은숫자 :"+ a + " " + b + "\n";
			
			
			try {
				//System.out.println("연산결과 :"+ (A+B) + " "  +(A-B)+ " "+ (A*B)+ " "+(A / B));
				result += "연산결과 :"+ (A+B) + " "  +(A-B)+ " "+ (A*B)+ " "+(A / B) + "\n";
				
				if((A+B)<0 ||(A-B)<0 ||(A*B)<0 ||(A/B)<0) {
					// 오류메세지 출력 결과가 음수입니다.
					//System.out.println("결과가 음수다");	
					result += "결과가 음수입니다" + "\n";
				} 										
				
           } catch(ArithmeticException e){		//가장작은?zero오류를 catch가 먼저 잡음.(1)->try속 if문(2)
	        	   //System.out.println("/by zero");
	        	   result += "/ by zero" + "\n";
	       } catch(Exception e){				
	        	   //System.out.println("Exception 발생");	
	    	   result += "Exception 발생";
           }	
			result += "\n";
		}
		
		System.out.println(result);
		//결과담긴 result 파일에 쓰기
		fileWriter.write(result);
		
		// 3.파일닫기
		fReader.close();
		bReader.close();
		fileWriter.close();
	}

}
