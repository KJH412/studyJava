package javaedu;

public class ���ڿ��޼ҵ�2 {

	public static void main(String[] args) {
		// ���ڿ��� ó�� �Ǵ� ���� Ư�� ���ڿ����� Ȯ���ϴ� startsWith(), endsWith()
		//return : true �Ǵ� false
		String str = "java Programming";
		if(!str.startsWith("("))  //str���ڿ� ������ ������ (�� �ƴϸ�, (�� ���.
			System.out.printf("(");
			
			for(int i=0; i<str.length(); i++) {  //str���� ��ŭ �ݺ�
				System.out.printf("%c", str.charAt(i));
			}
			
			if(!str.endsWith(")"))  //���ڿ��� ������ ���ڰ� )�� �ƴϸ�, )�� ���.
				System.out.printf(")\n");
			
			//Ư�� ���ڿ��� ��ġ�� ã�� indexOf(), lastIndexOf()
			str = "Java�� �����ϴ� ���Դϴ�. Java�� ��վ��.^^";
			
			System.out.print("���� ó�� ������ java��ġ ==>"); 
		    System.out.println(str.indexOf("Java"));  //ó�� ������ ��ġ ���.
		    System.out.print("�������� ������ java��ġ ==>");
		    System.out.println(str.lastIndexOf("Java"));  //�������� ������ ��ġ ���.
		    
		    //���ڿ��� ��ġ�� �ٲ��ִ� replace()
		    String str2 = str.replace("Java", "�ڹ�");
		    System.out.printf("replace ==> %s\n", str2);
		    
		    //�Ϻ� ���ڿ��� �����ϴ� substring()
		    str2 = str.substring(0,4);  //�ε��� 0���� 4�� ����
		    System.out.printf("substring ==> %s\n", str2);
		    
		    //���ڿ��� �и��ϴ� split()
		    //str = "Java�� �����ϴ� ���Դϴ�.  Java�� ��վ��.^^";
		    String str3[]=str.split("\\."); //.�� Ư�����ڷ� �ν� => �Ϲݹ��ڷ� ���� \\.
		    
		    for(int i=0; i<str3.length; i++) {
		    	System.out.printf("�и��� ���ڿ�: %d => %s\n", i, str3[i]);
		    }
		    
		    //��ҹ��ڷ� ��ȯ�ϴ� toUpperCase(), toLowerCase()
		    //������ �����ϴ� trim()
		    str = "   �ѱ�    ABCD    efgh    ";
		    System.out.printf("�빮�ڷ� ==> [%s]\n",str.toUpperCase());
		    System.out.printf("�ҹ��ڷ� ==> [%s]\n",str.toLowerCase());
		    //���� ���鸸 ����
		    System.out.printf("�������� ==> [%s]\n",str.trim()); 
		    //��� ����������
		    String result="";
		    for(int i=0; i<str.length(); i++) {
		    	if(str.charAt(i) != ' '){
		    	result += str.substring(i,i+1);
		        }
		    }
		    System.out.printf("��ü �������� ==> [%s]\n",result); 
		    
		    //�� ���ڿ��� ���ϴ� commpareTo() : str1-str2�� ������� reture�ϴµ� ������� 0�̸� ��ġ
		    //���ڿ� ������ Ȯ���ϴ� contains() : true/false return
		    String str1 = "Java Programming";
		    str2 = "Java IT CookBook";
		    
		    System.out.printf("%s\n",str1.compareTo(str2));
		    System.out.printf("%s\n",str1.contains("Java"));
		    
		    //�� ���ڿ��� ������ Ȯ���ϴ� ==�� equals()
		    str1 = "Java Programming";
		    str2 = "Java Programming";
		    String str4 = new String("Java Programming");
		    System.out.println("���ڿ�1==���ڿ�2 ��� : "+(str1==str2));
		    System.out.println("���ڿ�1.equals(���ڿ�2) : " + str1.equals(str2));
		    //������ ��, ��ġ���� ���ƾ� true
		    //���ڿ��� ==���� ���������� equals()�޼ҵ�� �񱳸� ����
		    System.out.println("���ڿ�1==���ڿ�4 ��� : "+(str1==str4));
		    System.out.println("���ڿ�1.equals(���ڿ�4) : " + str1.equals(str4));
    		
	}	
}
