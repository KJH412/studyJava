package javaedu;

public class array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		int hap;
		//배열 선언과 생성
		int[] aa= new int[4]; //aa라는 배열 길이가4
		aa[0]=10;
		aa[1]=20;
		aa[2]=30;
		aa[3]=40;

		
		hap = aa[0]+aa[1]+aa[2]+aa[3];
		System.out.printf("합계 ==> %d\n", hap);

	}

}
