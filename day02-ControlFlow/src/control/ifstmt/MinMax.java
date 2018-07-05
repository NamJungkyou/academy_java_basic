package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수을 입력받이 둘 중 큰 것을 출력
 * @author Byun
 *
 */
public class MinMax {

	public static void main(String[] args) {
		// 1. 선언
		int x, y;
		int min, max;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 spacebar로 구분하여 입력");
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3. 사용
		if(x>y) {
			min = y;
			max = x;
		} else {
			min= x;
			max = y;
		}
		// 출력
		System.out.printf("입력된 두 정수 : %d %d%n", x, y);
		System.out.printf("큰값 : %d, 작은값 : %d", max, min);
		
		scan.close();
	}

}
