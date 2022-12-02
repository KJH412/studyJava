package javaedu;
//로또 자동 추첨 : 메소드를 이용
//1~45중에서 랜덤으로 6개의 숫자를 출력
/*
 * */
public class Ex04 {
	
	static short getNumber() {
		return (short)(Math.random()*45+1);		
	}
	public static void main(String[] args) {
	     short[] lotto = {0, 0, 0, 0, 0 ,0};  //선언, 초기화(자동생성)
	     short i, k, num;
	     char dup1 = 'N';
	     
	     System.out.printf("***** 로또 추첨을 시작합니다. *****\n\n");
	     
	     for(i=0; i<6; i++) {
	    	 num = getNumber();	 //랜덤 숫자를 추출하는 메소드. 추출한 숫자 return
	    	 //중복번호 체크
	    	 for(k=0; k<6; k++) {
	    		 if(lotto[k] == num) {
	    			 dup1 = 'Y';
	    		 }
	    	 }
	    	 
	    	 if(dup1 == 'N') {
	    		 lotto[i++] =num;
	    	 }else {
	    		 dup1 = 'N';
	    	 }
	     }
	     System.out.printf("추첨번호 ==> ");
	     for(int j:lotto) {
	    	 System.out.printf("%d ",j);
	     }

	}

}
