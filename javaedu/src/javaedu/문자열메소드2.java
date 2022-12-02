package javaedu;

public class 문자열메소드2 {

	public static void main(String[] args) {
		// 문자열의 처음 또는 끝이 특정 문자열인지 확인하는 startsWith(), endsWith()
		//return : true 또는 false
		String str = "java Programming";
		if(!str.startsWith("("))  //str문자열 변수의 시작이 (가 아니면, (를 출력.
			System.out.printf("(");
			
			for(int i=0; i<str.length(); i++) {  //str길이 만큼 반복
				System.out.printf("%c", str.charAt(i));
			}
			
			if(!str.endsWith(")"))  //문자열의 마지막 문자가 )가 아니면, )를 출력.
				System.out.printf(")\n");
			
			//특정 문자열의 위치를 찾는 indexOf(), lastIndexOf()
			str = "Java를 공부하는 중입니다. Java는 재밌어요.^^";
			
			System.out.print("제일 처음 나오는 java위치 ==>"); 
		    System.out.println(str.indexOf("Java"));  //처음 나오는 위치 출력.
		    System.out.print("마지막에 나오는 java위치 ==>");
		    System.out.println(str.lastIndexOf("Java"));  //마지막에 나오는 위치 출력.
		    
		    //문자열의 위치를 바꿔주는 replace()
		    String str2 = str.replace("Java", "자바");
		    System.out.printf("replace ==> %s\n", str2);
		    
		    //일부 문자열을 추출하는 substring()
		    str2 = str.substring(0,4);  //인덱스 0부터 4개 추출
		    System.out.printf("substring ==> %s\n", str2);
		    
		    //문자열을 분리하는 split()
		    //str = "Java를 공부하는 중입니다.  Java는 재밌어요.^^";
		    String str3[]=str.split("\\."); //.은 특수문자로 인식 => 일반문자로 변경 \\.
		    
		    for(int i=0; i<str3.length; i++) {
		    	System.out.printf("분리한 문자열: %d => %s\n", i, str3[i]);
		    }
		    
		    //대소문자로 전환하는 toUpperCase(), toLowerCase()
		    //공백을 제거하는 trim()
		    str = "   한글    ABCD    efgh    ";
		    System.out.printf("대문자로 ==> [%s]\n",str.toUpperCase());
		    System.out.printf("소문자로 ==> [%s]\n",str.toLowerCase());
		    //양쪽 공백만 제거
		    System.out.printf("공백제거 ==> [%s]\n",str.trim()); 
		    //모든 공백을제거
		    String result="";
		    for(int i=0; i<str.length(); i++) {
		    	if(str.charAt(i) != ' '){
		    	result += str.substring(i,i+1);
		        }
		    }
		    System.out.printf("전체 공백제거 ==> [%s]\n",result); 
		    
		    //두 문자열을 비교하는 commpareTo() : str1-str2한 결과값을 reture하는데 결과값이 0이면 일치
		    //문자열 포함을 확인하는 contains() : true/false return
		    String str1 = "Java Programming";
		    str2 = "Java IT CookBook";
		    
		    System.out.printf("%s\n",str1.compareTo(str2));
		    System.out.printf("%s\n",str1.contains("Java"));
		    
		    //두 문자열이 같은지 확인하는 ==과 equals()
		    str1 = "Java Programming";
		    str2 = "Java Programming";
		    String str4 = new String("Java Programming");
		    System.out.println("문자열1==문자열2 결과 : "+(str1==str2));
		    System.out.println("문자열1.equals(문자열2) : " + str1.equals(str2));
		    //데이터 값, 위치까지 같아야 true
		    //문자열은 ==으로 비교하지말고 equals()메소드로 비교를 하자
		    System.out.println("문자열1==문자열4 결과 : "+(str1==str4));
		    System.out.println("문자열1.equals(문자열4) : " + str1.equals(str4));
    		
	}	
}
