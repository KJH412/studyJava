package javaedu;

public class break레이블 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i;
		myLabel:
			for(;;){  //무한루프
			for(i=1; i<100; i++) {
			hap += i;
			if(hap>2000){
				System.out.printf("%d\n", hap);
				hap = 0;
				break myLabel; //본인이 속한 반복문을 빠져나감
			   }
		    }
			System.out.printf("아직도 반복중...\n");
		}
	}

}
