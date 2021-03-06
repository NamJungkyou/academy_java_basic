package account.one;

public class AccountTest {
	/**
	 * 계좌(Account) 클래스의 인스턴스(객체, 실체)를 생성하고 입금기능, 현재 계좌 상태등을 출력해보며 테스트하는 클래스
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 선언 : 계좌의 객체 참조 변수
		Account account;

		// 2. 초기화
		account = new Account();

		// 3. 사용
		// (0) 초기상태 출력
		account.print();

		// (1) 입급 1000원
		account.deposit(1000);

		// (2) 상태 출력
		account.print();

		// (3) 입금 5000원
		account.deposit(5000);

		// (4) 상태 출력
		account.print();
	}

}
