package product;

public class Product {
	// 1. 멤버변수 선언부
	/** 제품코드 */
	private String prodCode;
	/** 제품명 */
	private String prodName;
	/** 가격 */
	private int price;
	/** 수량 */
	private int quantity;

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
	/*------------------------------------------------------------------------
	 멤버변수 필드의 가시성을 private으로 선언하면 다른 모든 클래스에서 접근 불가
	 숨겨진 필드에 접근할 수 있는 전용 메소드 쌍을 정의해야함.
	===============================================================================
	 접근자 메소드 : getter
	 1. get으로 시작
	 2. get 뒤에 오는 이름은 접근하려는 멤버변수명의 첫 글자만 대문자화하여 정의
	 3. 메소드 매개변수가 없다.
	 4. 메소드 리턴타입을 접근하려는 멤버변수 타입과 맞춘다.
	 5. 멤버변수의 타입이 boolean이면 get이 아니라 is로 시작하도록 작성
	 6. getXxx90, isXxx() 형태로 정의
	 ===============================================================================
	 수정자 메소드 : setter
	 -------------------------------------------------------------------------------
	 1. set으로 시작
	 2. set 뒤에 오는 이름은 수정하려는 멤버변수명의 첫 글자만 대문자화여 저의
	 3. 메소드 매개변수는 수정하려는 멤버변수의 타입과 맞추고, 보통 같은이름으로 설정
	 4. 리턴타입은 void로 한다.
	 5. 보통 안쪽의 로직은 this.멤버변수 = 매개변수;
	 ===============================================================================
	*/
	
	/** prodCode의 접근자*/
	public String getProdCode() {
		return prodCode;
	}
	/** prodCode의 수정자*/
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	/** prodName의 접근자*/
	public String getProdName() {
		return prodName;
	}
	/** prodName의 수정자*/
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	/** price의 접근자*/
	public int getPrice() {
		return price;
	}
	/** private의 수정자*/
	public void setPrice(int price) {
		this.price = price;
	}
	/** quantity의 접근자*/
	public int getQuantity() {
		return quantity;
	}
	/** quantity의 수정자*/
	public void setQuantity(int quantity) {
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
