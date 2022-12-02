package javaedu;
/*for-each문을 사용해서 배열의 합, 배열 값을 출력*/
public class foreach문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int sum = 0;
		for (int k:a) {   //k = a[0],a[1],a[2]....
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		String b[] =  {"사과", "배", "바나나", "체리", "딸기", "포도"}; //선언 및 초기값
		for(String s:b) {  //s = b[0]
			System.out.print(s + " ");
		}
	}

}
