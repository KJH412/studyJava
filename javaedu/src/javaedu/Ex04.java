package javaedu;
//�ζ� �ڵ� ��÷ : �޼ҵ带 �̿�
//1~45�߿��� �������� 6���� ���ڸ� ���
/*
 * */
public class Ex04 {
	
	static short getNumber() {
		return (short)(Math.random()*45+1);		
	}
	public static void main(String[] args) {
	     short[] lotto = {0, 0, 0, 0, 0 ,0};  //����, �ʱ�ȭ(�ڵ�����)
	     short i, k, num;
	     char dup1 = 'N';
	     
	     System.out.printf("***** �ζ� ��÷�� �����մϴ�. *****\n\n");
	     
	     for(i=0; i<6; i++) {
	    	 num = getNumber();	 //���� ���ڸ� �����ϴ� �޼ҵ�. ������ ���� return
	    	 //�ߺ���ȣ üũ
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
	     System.out.printf("��÷��ȣ ==> ");
	     for(int j:lotto) {
	    	 System.out.printf("%d ",j);
	     }

	}

}
