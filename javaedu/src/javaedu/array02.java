package javaedu;

public class array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {100,200,300,400};    //배열 선언 초기값
		int bb[] = new int[] {100,200,300};   //배열 선언, 생성, 초기값
		
		int cc[];  //선언
		cc = new int[] {100,200}; //생성, 초기값
		
		int[] dd = new int[1];  //선언 및 생성
		dd[0] = 100; //값 대입  int cc[] = new int[]{100}
		
		int i;
		for(i=0; i<4; i++) {
			System.out.printf("aa[%d] ==> %d \t" ,i, aa[i]);
		}
		System.out.printf("\n");
		
		
		for(i=0; i<3; i++) {  //i(인덱스) 0, 1, 2 3개
			System.out.printf("bb[%d] ==> %d \t" ,i, aa[i]);
		}
		System.out.printf("\n");

		for(i=0; i<2; i++) { 
			System.out.printf("cc[%d] ==> %d \t" ,i, aa[i]);
		}
		System.out.printf("\n");
		
		for(i=0; i<1; i++) { 
			System.out.printf("dd[%d] ==> %d \t" ,i, aa[i]);
		}
		System.out.printf("\n");

	}

}
