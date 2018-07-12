package api.object;

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
	public Product() {

	}

	/**
	 * 제품코드만 초기화 하는 생성자
	 * 
	 * @param prodCode
	 */
	public Product(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * 제품코드, 제품명만 초기화하는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 */
	public Product(String prodCode, String prodName) {
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
	public Product(String prodCode, String prodName, int price) {
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
	public Product(String prodCode, String prodName, int price, int quantity) {
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

	// 자동으로 생성한 toString() 메소드
	/*@Override
	public String toString() {
		return "Product [prodCode=" + prodCode + ", prodName=" + prodName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCode == null) ? 0 : prodCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCode == null) {
			if (other.prodCode != null)
				return false;
		} else if (!prodCode.equals(other.prodCode))
			return false;
		return true;
	}

	// Product의 객체들은 prodCode가 같으면 동일객체로 판단.
/*	@Override
	public boolean equals(Object obj) {
		// 1. 동일 비교 결과를 저장할 변수 선언
		// 2. 초기화 : 기본 false로 설정
		boolean isEqual = false;
		
		// 3. 사용 : 동일한 객체인지 판단
		// (1) 비교 대상인 obj가 Product 타입인지 검사
		if (obj instanceof Product) {
			// (2) 비교하려는 this객체와 비교대상인 obj간 각각의 필드가 동일한지 비교
			Product product = (Product)obj;
			// (3) prodCode만 같ㅇ면 같은 객체로 인정
			if (this.prodCode.equals(product.prodCode)) {
				isEqual = true;
			}
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		// 입력이 동일하면 출력도 동일함을 보장하는 수학적 알고리즘
		// 출력이 다르면 입력이 다르다는 결론을 보장하는 함수
		
		// 1. 비교하려는 필드가 참조형이면 그 클래스의 hashCode()를 호출
		// 2. 비교하려는 필드가 기본형이면 참조형으로 바꾸는 포장 클래스 객체로 변환한 후에 hashCode()를 호출
		// 3. 1, 2의 결과 모두 ^(XOR) 연산을 통과시킨다.
		
		return this.prodCode.hashCode();
	}*/

}
