package javaedu;
/*
 * 2���� �迭�� �г⺰�� 1,2�б� ������ �����ϰ�, 4�� ��ü ���� ����� ���
 * {3.3, 3.4},
 * {3.5, 3.5},
 * {3.7, 4.0},
 * {4.1, 4.2}
 * */
public class �迭2���� {

	public static void main(String[] args) {
		double score[][]= {
				               {3.3, 3.4}, //0
				               {3.5, 3.5}, //1
				               {3.7, 4.0}, //2
				               {4.1, 4.2}  //3
		                  };
		double sum = 0;
		for(int year=0; year<score.length; year++) { //�г�,score.length=4(row����)
			for(int term=0; term<score[year].length; term++) //�б�, score[year].length
				sum += score[year][term]; //��ü ������ ��
		}
	
	        int n = score.length; //row=4
			int m = score[0].length; //index 0�� row�� ���� ���� =2
		System.out.println("4�� ��ü ������ ��� : " + sum/(n*m));

	}

}
