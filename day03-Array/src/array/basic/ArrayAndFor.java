package array.basic;

/**
 * 배열과 for구문구조의 조합
 * --------------------------------------------------------------------------------------------------
 * 배열과 for구문은 항상 같이 상용되는 조합이므로 둘 사이의 용법을 능숙하게 다룰 수 있어야 한다.
 * --------------------------------------------------------------------------------------------------
 * 
 * 
 * @author Byun
 *
 */
public class ArrayAndFor {

	public static void main(String[] args) {
		// 1. 선언 : int 배열 참조변수 선언
		int[] numbers;
		int summary;
		// 2. 초기화
		numbers = new int[10];
		summary = 0;
		// 3. 사용
		// (1) 1 ~ 10까지 값을 할당 : for구문 사용
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = idx + 1;
		}

		// (2) 할당한 값을 출력 : for구문
		for (int idx = 0; idx < numbers.length; idx++) {
			System.out.printf("numbers[%d] = %d%n", idx, numbers[idx]);
		}

		System.out.println("======================================");

		// 할당한 값을 출력 : foreach 구문
		for (int number : numbers) {
			System.out.printf("number = %d%n", number);
			summary += number;
		}
		System.out.printf("원소의 총합(summary) : %d%n", summary);
	}

}
