package javaedu;

public class �پ���for��1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		for(i=1,k=1; i<=9; i++, k++) {
			System.out.printf("%d x %d = %d \n",i,k,i+k);
		}
		//0~9�� ����ϴ� 3�� for��
		//1.�⺻����
		for(i=0; i<10; i++) {
			System.out.printf("%d",i);
		}
			System.out.printf("\n"); //�ٹٲ�
			
		//2. �ʱⰪ ����			
		i=0; //�ʱⰪ ����
		for(;i<10;i++) {
			System.out.printf("%d", i);			
		}
			System.out.printf("\n");
			
		//3.�ʱⰪ�� ������ ����
		i=0; //�ʱⰪ
		for(;i<10;) {
			System.out.printf("%d", i);	
			i++;  //������
		}
			System.out.printf("\n");
			
		//4.���� ����
		i=0;
		for(;;) {  //�ʱⰪ,���ǽ�, �������� ������ ���ѷ���
			System.out.printf("%d\n",i);
			i++; //������
		}

	}

}
