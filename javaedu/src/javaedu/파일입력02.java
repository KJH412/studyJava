package javaedu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/* 
 * FileReaser�� ���� ����
 * BufferdReader�� ���� �б�
 * ���� �ݱ�
 * */
public class �����Է�02 {

	public static void main(String[] args) throws Exception {
		// 1.���Ͽ���
		// read()�޼ҵ� : �� ���ھ� �б�
		FileReader fReader = new FileReader("c:\\java_work\\temp\\data1.txt");
		
		// 2.����ó��
		int i = 0;
		//���ٴ����� �д� �޼ҵ带 �̿��ϱ� ����
		BufferedReader bReader = new BufferedReader(fReader);
		
		String str = null;
		
		while((str = bReader.readLine()) != null){ //���پ� �д� �޼ҵ�
			i++;
			System.out.printf("%d�� : %s\n", i, str);
		}
		
		// 3.���ϴݱ�
		bReader.close();
		fReader.close();

	}

}
