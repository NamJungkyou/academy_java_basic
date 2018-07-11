package shop;

/**
 * 물건을 판매하는 매장을 나타내는 클래스
 * 
 * 
 * 매장에는 물건 판매를 위하여 최소 1명의 매니저는 있어야 한다.
 * 
 * @author Byun
 *
 */
public class Shop {
	// 1. 멤버변수 선언부
	Manager manager;

	// 2. 생성자 선언부
	// (1) 기본 생성자
	Shop() {
		manager = new Manager();
	}

	// (2) 매개변수가 있는 생성자
	Shop(Manager manager) {
		this.manager = manager;
	}

	// 3. 메소드 선언부
	/**
	 * 매니저가 새 제품을 창고에 등록
	 * 
	 * @param product
	 */
	public void add(Product product) {
		manager.add(product);
	}

	/**
	 * 매니저가 제품정보를 수정
	 * 
	 * @param product
	 */
	public void set(Product product) {
		manager.set(product);
	}

	/**
	 * 매니저가 제품을 폐기
	 * 
	 * @param product
	 */
	public void remove(Product product) {
		manager.remove(product);
	}

	/**
	 * 매장에서 고객에게 판매할 물건을 매니저가 가져다 줌
	 * 
	 * @param product
	 * @return
	 */
	public Product get(Product product) {
		return manager.get(product);
	}

	/**
	 * 매장에서 판매할 수 있는 모든 제품의 정보를 매니저가 알려줌
	 * 
	 * @return
	 */
	public Product[] getAllProducts() {
		return manager.getAllProducts();
	}
}
