package control.loop;

/**
 * 1 ~ 100 사이의 홀수의 합을 for 반복문과 continue의 조합으로 출력
 * 
 * @author Byun
 *
 */
public class SumOfOdds2 {

	public static void main(String[] args) {
		// 1. 선언
		int sum;
		int idx;

		// 2. 초기화, 3. 사용
		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				// idx가 짝수
				continue;
				// continue가 실행되면 아래의 문장들을 무시하고 처음 반복으로 되돌아가서 다음 반복실행
			}
			sum += idx;
		}
		System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);

		System.out.println("=======================================");
		// countinue는 if ~ else로 변경 가능
		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				// idx가 짝수
				;
				// continue가 실행되면 아래의 문장들을 무시하고 처음 반복으로 되돌아가서 다음 반복실행
			} else {
				sum += idx;
			}
		}
		System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);
	}

}
