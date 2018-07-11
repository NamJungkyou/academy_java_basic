package shop;

/**
 * 매장에서 판매될 물건을 신규추가/ 수정/ 삭제 하는 등의 기능을 실행
 * 
 * @author Byun
 *
 */
public class ShopTest {

	public static void main(String[] args) {
		// 1. 창고에 들여놓을 선반이 먼저 필요
		Product[] products = new Product[0];
		
		// 2. 선반을 설치할 창고를 지어야 함
		Warehouse warehouse = new Warehouse(products);

		// 3. 매장을 관리할 매니저 고용
		Manager manager = new Manager(warehouse);

		// 4. 매장을 오픈
		Shop abcMart = new Shop(manager);
		
		//---------------------------------------------------
		// 매장에 입고할 신규 제품(신발)이 매장에 도착했다.
		Product adidas = new Product("S001", "슈퍼스타", 87200, 5);
		Product reebok = new Product("S002", "리복 로얄 테크큐 티", 42000, 20);
		Product nike = new Product("S003", "나이키 탄준 샌들", 41300, 30);
		Product crocs = new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);
		Product birkenstock= new Product("S005", "지제 에바", 29000, 15);
		
		// 1. 매장에 도착한 제품을 입고
		abcMart.add(adidas);
		abcMart.add(reebok);
		abcMart.add(nike);
		abcMart.add(crocs);
		abcMart.add(birkenstock);
		
		// 2. 입고된 제품 확인
		Product[] allProducts = abcMart.getAllProducts();
		for(Product product : allProducts) {
			product.print();
		}
		
		// 3. 정보 수정 
		Product adidas2 = new Product("S001", "슈퍼스타", 75000, 5);	
		abcMart.set(adidas2);
		
		System.out.println();
		// 4. 수정된 아디다스 제품 수정 확인
		abcMart.get(new Product("S001", null, 0, 0)).print();
		
		// 5. 판매종료할 제품 폐기
		abcMart.remove(new Product("S001", null, 0, 0));
		
		System.out.println();
		// 6. 전체 목록 조회
		for(Product product : abcMart.getAllProducts()) {
			product.print();
		}
	}

}