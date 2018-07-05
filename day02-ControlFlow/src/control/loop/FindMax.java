package control.loop;

import java.util.Scanner;

/**
 * 입력된 자연수 중 가장 큰 값을 출력
 * 
 * do ~ while을 활용
 * 
 * @author Byun
 *
 */
public class FindMax {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		int max;

		Scanner scan = new Scanner(System.in);

		// 2. 초기화
		max = 0;

		// 3. 사용
		do {
			System.out.print("양수를 입력하고 끝내려면 0 눌러 : ");
			input = scan.nextInt();
			if (input > max) {
				max = input;
			}
		} while (input > 0);
		System.out.printf("최대값은 %d입니다.%n", max);
		
		scan.close();
	}

}
