package shop;

/**
 * 창고(Warehouse)를 사용하는 매장 매니저를 나타내는 클래스
 * ------------------------------------------------------------
 * 
 * 매장 매니저는
 * 
 * 1. 제품을 창고에 등록하거나
 * 
 * 2. 창고에서 가지고 오거나
 * 
 * 3. 수량이나 가격정보를 수정하거나
 * 
 * 4. 더 이상 판매하지 않을 물건을 폐기하는
 * 
 * 등의 작업을 창고에서 진행
 * ---------------------------------------------------------------------
 * 
 * 전제조건 : 매니저는 우리 매장의 창고가 어디 있는지 알고 있어야 한다.
 * ---------------------------------------------------------------------
 * 
 * @author Byun
 *
 */
public class Manager {

	// 1. 멤버변수 선언부
	Warehouse warehouse;

	// 2. 생성자 선언부
	// (1) 매니저 기본 생성자
	Manager() {
		warehouse = new Warehouse();
	}

	// (2) 매개변수가 있는 매니저 생성자
	Manager(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	// 3. 메소드 선언부
	/**
	 * 매니저는 제품 한개를 창고로 들고가서 창고에 등록을 할 수 있다
	 * @param product
	 */
	public void add(Product product) {
		warehouse.add(product);
	}
	
	/**
	 * 매니저는 제품 한개를 창고로 들고가서 창고에 있던 제품정보를 수정할 수 있다.
	 * @param product
	 */
	public void set(Product product) {
		warehouse.set(product);
	}
	
	/**
	 * 매니저는 창고ㅇ서 더 이상 팔지 않는 제품정보를 제거할 수 있다.
	 * 
	 * 이 때, 제거할 제품의 정보는 알고있어야 한다.
	 * @param product
	 */
	public void remove(Product product) {
		warehouse.remove(product);
	}
	
	
	/**
	 * 매니저가 창고에서 요청된 제품 한개를 가지고오는 기능
	 * @param product
	 * @return
	 */
	public Product get(Product product) {
		return warehouse.get(product);
	}
	
	/**
	 * 매니저는 현재 창고에 남아있는 제품의 전체 정보 목록을 조회 할 수 있다.
	 * @return
	 */
	public Product[] getAllProducts() {
		return warehouse.getAllProducts();
	}
}
