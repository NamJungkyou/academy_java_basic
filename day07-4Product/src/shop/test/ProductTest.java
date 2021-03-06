package shop.test;

import shop.Product;

public class ProductTest {

	public static void main(String[] args) {
		// 1. 선언 : 제품을 사용하기 위한 객체 참조변수
		Product product;

		// 2. 초기화
		// product = new Product("P001", "기타", 1000000, 2);
		product = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		// 3. 사용
		// (1) 제품상태 출력
		product.print();

		// (2) 20% 할인가는 어떻게 되는가?
		int cdPrice = product.discount(20);
		System.out.printf("제품가격 : %,d, 20%% 할인가 : %,d%n", product.getPrice(), cdPrice);

		// (3) 2개 판매(sell)
		product.sell(2);

		// (4) 상태 출력s
		product.print();

		// (5) 10개 입고(buy)
		product.buy(10);

		// (6) 상태 출력
		product.print();
		
		System.out.println("======================================");
		System.out.println(product.toString());
		System.out.println("======================================");
		
	}

}
