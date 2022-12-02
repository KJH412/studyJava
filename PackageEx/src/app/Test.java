package app;

/*
 * FileReader(�Ǵ�Scanner) , FileWriter(�Ǵ�PrintWrite )
 * �� ������ ��Ģ������ �ؼ� ����� ��� (+, -, *, /)

      ��, ������ ���� ���� ������ ���� 0���� ���������� �����޼��� ���
          ó������� ������ ���͵� ���� �޼����� ���
      �� ���� ���� ó���� �Ѵ�.
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {

	public static void main(String[] args) throws Exception {
		// 1. �����б�
		FileReader fReader = new FileReader("c:\\java_work\\in.txt");

		//��� ����� out����
		FileWriter fileWriter = new FileWriter("c:\\java_work\\out.txt");

		// 2.����ó��
		int i = 0;
		
		// ���ٴ����� �д� �޼ҵ�
		BufferedReader bReader = new BufferedReader(fReader);
		
		String str = null;	// ���پ� �д� �޼ҵ�
		String result = ""; // ���پ� ����� ����? ���ڿ� result
		while ((str = bReader.readLine()) != null) { //in.txt ���پ� ����.
			
			i++;					
			
			String a = str.split(" ")[0]; //split(" ")������ �������� ����. ù��° ����
			String b = str.split(" ")[1]; //" "������ �������� �ι�°
			
			int A = Integer.parseInt(a);  //����(������ ����)�� ���� ���ڷ� ���
			int B = Integer.parseInt(b);           
			
			//System.out.println("�������� :"+ a + " " + b);
			result += "�������� :"+ a + " " + b + "\n";
			
			
			try {
				//System.out.println("������ :"+ (A+B) + " "  +(A-B)+ " "+ (A*B)+ " "+(A / B));
				result += "������ :"+ (A+B) + " "  +(A-B)+ " "+ (A*B)+ " "+(A / B) + "\n";
				
				if((A+B)<0 ||(A-B)<0 ||(A*B)<0 ||(A/B)<0) {
					// �����޼��� ��� ����� �����Դϴ�.
					//System.out.println("����� ������");	
					result += "����� �����Դϴ�" + "\n";
				} 										
				
           } catch(ArithmeticException e){		//��������?zero������ catch�� ���� ����.(1)->try�� if��(2)
	        	   //System.out.println("/by zero");
	        	   result += "/ by zero" + "\n";
	       } catch(Exception e){				
	        	   //System.out.println("Exception �߻�");	
	    	   result += "Exception �߻�";
           }	
			result += "\n";
		}
		
		System.out.println(result);
		//������ result ���Ͽ� ����
		fileWriter.write(result);
		
		// 3.���ϴݱ�
		fReader.close();
		bReader.close();
		fileWriter.close();
	}

}
