package javaedu;

public class �޼ҵ�01 {
	//static : ����(������) Ŭ���� �ε��� static���� ����� �޼ҵ�� ���� �ε�
	//static ���Ÿ�� �޼ҵ��(�Ķ����Ÿ�� �Ķ���͸�, �Ķ����Ÿ�� �Ķ���͸�,...){
	//    �޼ҵ� ���...
	//    return �����;
	// }
	//ȣ���� �Ǿ�� ���� �ȴ�.
	static int plus(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;  // return : �޼ҵ带 ȣ���� ������ ������� ������
	}
	//Ŭ���� ������ ��Ű�� ���� ���� �׻� ����Ǵ� �޼ҵ�
	public static void main(String[] args) {
		int hap;
		hap = plus(100, 200); //�޼ҵ� ȣ��  hap : plus()�޼ҵ� ����� �޾Ƽ� ����
		System.out.printf("100�� 200�� plus()�޼ҵ� �����: %d\n", hap);

	}

}
