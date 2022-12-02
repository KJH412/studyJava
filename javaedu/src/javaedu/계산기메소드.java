package javaedu;

import java.util.Scanner;

public class 계산기메소드 {
	
	//calc()메소드
	//파라미터 : v1, v2, op
	static int calc(int v1, int v2, int op) {
		int result;
		switch(op) {
		case 1: result = v1 + v2; break;
		case 2: result = v1 - v2; break;
		case 3: result = v1 * v2; break;
		case 4: result = v1 / v2; break;
		default: result = 0;
		}
		//결과를 호출한 곳으로 돌려준다.
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int res;
		int oper, a, b;
		
		System.out.printf("계산입력(1:+, 2:-, 3:*, 4:/) : ");
		oper = sc.nextInt();
		
		System.out.printf("첫번째 숫자를 입력 =>");
		a = sc.nextInt();
		
		System.out.printf("두번째 숫자를 입력 =>");
		b = sc.nextInt();
		
		//메소드 호출
		res = calc(a, b, oper);
		System.out.printf("계산 결과는 : %d\n", res);
		
	}

}
