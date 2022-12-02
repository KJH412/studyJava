package javastudy;

public class shoppingLIst01 {
//쇼핑 리스트 출력하기
	public static void main(String[] args) {
		String item1 = "한우 꽃등심";
		String item2 = "참치 선물팩";
		String item3 = "맥스봉 한팩";
		int price1 = 112500; // 숫자에 ""하면 안됌.
		int price2 = 25500;
		int price3 = 500;

		System.out.printf("품명:%s 가격:%d\n", item1, price1);
		System.out.printf("품명:%s 가격:%d\n", item2, price2);
		System.out.printf("품명:%s 가격:%d\n", item3, price3);
	}
}
