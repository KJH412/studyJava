package javaedu;
/*for-each���� ����ؼ� �迭�� ��, �迭 ���� ���*/
public class foreach�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int sum = 0;
		for (int k:a) {   //k = a[0],a[1],a[2]....
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("���� " + sum);
		
		String b[] =  {"���", "��", "�ٳ���", "ü��", "����", "����"}; //���� �� �ʱⰪ
		for(String s:b) {  //s = b[0]
			System.out.print(s + " ");
		}
	}

}
