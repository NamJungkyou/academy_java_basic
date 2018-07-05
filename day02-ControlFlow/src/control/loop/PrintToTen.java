package control.loop;
/**
 * 0 ~ 10까지 순서대로 출력
 * @author Byun
 *
 */
public class PrintToTen {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		int number = 0;
		
		// 3. 사용
		while(number <= 10) {
			System.out.printf("number = %d%n", number);
			number++;
		}
	}

}
