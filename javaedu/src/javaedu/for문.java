package javaedu;
/*
 * 1���� 10���� ��� ��, �������� ǥ���ϰ� ���� ���*/
public class for�� {

	public static void main(String[] args) {
		int i, sum = 0;
		for(i=1; i<=10; i++) {
			sum += i; //i�� 1�� ��� sum = sum +1; -> sum : 1
			System.out.print(i);
			if(i<=9) {   //1~9������ +���
				System.out.print("+");
			}else { //i�� 10�� ���
				System.out.print("=");
				System.out.println(sum);
			}
		}
		
		int dan=8;
		for(i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);			
		}
		
        //2�� ��ø for���� �̿��ؼ� ������ ��ü ���
		for(i=1; i<10; i++) { //�ܿ� �ش��ϴ� for��
			for(int j=1; j<10; j++) { //�� ���� ����
				System.out.printf("%d x %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
}
