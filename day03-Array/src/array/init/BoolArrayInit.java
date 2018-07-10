package array.init;

/**
 * boolean 타입의 배열을 선언하고 초기화 진행 후 기본값을 확인해보는 클래스
 * 
 * @author Byun
 *
 */
public class BoolArrayInit {

	public static void main(String[] args) {
		// 1. 선언
		boolean[] bools;

		// 2. 초기화
		bools = new boolean[10];

		// 3. 사용
		for (boolean bool : bools) {
			System.out.printf("bool = %b%n", bool);
		}
	}

}