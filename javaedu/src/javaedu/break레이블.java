package javaedu;

public class break���̺� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i;
		myLabel:
			for(;;){  //���ѷ���
			for(i=1; i<100; i++) {
			hap += i;
			if(hap>2000){
				System.out.printf("%d\n", hap);
				hap = 0;
				break myLabel; //������ ���� �ݺ����� ��������
			   }
		    }
			System.out.printf("������ �ݺ���...\n");
		}
	}

}
