package control.loop;
/**
 * 중첩 for구조를 사용하여 구구단을 출력
 * 2 ~ 9 단으 출력
 * 각 단을 시작할 때 몇 단인지 출력
 * @author Byun
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
		//외부 for 반복문 : 2 ~ 9단을 반복
		for (int stage =2; stage <= 9; stage++) {
			//단의 제목을 출력
			System.out.printf("%d 단%n",stage);
			//내부 for 반복문 : 1 ~ 9 곱해지는 수를 반복
			for (int times = 1; times <= 9; times ++) {
				System.out.printf("%d x %d = %2d%n", stage, times, stage*times);
			}
			System.out.println();
		}
	}

}
