package inheritance.basic.product;

public class Product {
	// 1. 멤버변수 선언부
	/** 제품코드 */
	String prodCode;
	/** 제품명 */
	String prodName;
	/** 가격 */
	int price;
	/** 수량 */
	int quantity;

	// 2. 생성자 선언부
	/**
	 * 기본 생성자
	 */
	Product() {

	}

	/**
	 * 제품코드만 초기화 하는 생성자
	 * 
	 * @param prodCode
	 */
	Product(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * 제품코드, 제품명만 초기화하는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 */
	Product(String prodCode, String prodName) {
		this(prodCode);
		this.prodName = prodName;
	}

	/**
	 * 제품코드, 제품명, 가격만 초기화하는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 * @param price
	 */
	Product(String prodCode, String prodName, int price) {
		this(prodCode, prodName);
		this.price = price;
	}

	/**
	 * 제품코드, 제품명, 가격, 수량을 모두 초기화하는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode, prodName, price);
		this.quantity = quantity;
	}

	// 3. 메소드 선언부
	/**
	 * 제품정보 출력
	 */
	public void print() {
		System.out.printf("제품정보 [제품코드 : %s | 제품명 : %s | 가격 : %d | 수량 : %d]%n", prodCode, prodName, price, quantity);
	}

	/**
	 * percentage를 입력받아 가격을 할인
	 * 
	 * @param percentage
	 * @return
	 */
	/*
	 * public int discount(double percentage) { if ((price * ((100 - percentage) /
	 * 100)) >= 0) { price = (int) (price * ((100 - percentage) / 100)); }else {
	 * price = 0; System.out.println("이 이상의 할인은 없다"); } return price; }
	 */
	public int discount(double percentage) {
		// percentage > 0
		int price = this.price;

		if (percentage > 0) {
			price = price - (int) (this.price * (percentage / 100));
		}
		return price;
	}

	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을 때만 출고함
		if (quantity >= amount) {
			quantity -= amount;
		}
	}

	public void buy(int amount) {
		// 입고된만큼 재고수량 증가 후 저장
		quantity += amount;
	}

	// Object 클래스에서 나도 모르는 사이 상속받은 toString() 메소드를 재정의 해보자
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드이름 (매개변수)
	@Override
	public String toString() {
		String strProduct = String.format("제품정보 [제품코드 : %s | 제품명 : %s | 가격 : %,d | 수량 : %d]%n", prodCode, prodName,
				price, quantity);
		return strProduct;
	}

}
