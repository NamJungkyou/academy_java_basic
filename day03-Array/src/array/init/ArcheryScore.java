package array.init;

import java.util.Scanner;

/**
 * 3명의 양궁선수가 맞힌 과녁의 점수를 각각 차시(9차시까지)별로 배열에 입력하고
 * 
 * 전체 합산점수가 가장 높은 선수의 인덱스와 점수를 출력
 * 
 * @author Byun
 *
 */
public class ArcheryScore {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 스캐너
		Scanner scan = new Scanner(System.in);
		// 변수
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;

		// 3. 사용
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.print((idx + 1) + "번째 선수 점수 입력 : ");
			for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
				score[idx][idx2] = scan.nextInt();

				sum[idx] += score[idx][idx2];
				if (sum[idx] > max) {
					max = sum[idx];
				}
			}

		}

		System.out.println("우승 선수");
		for (int idx = 0; idx < sum.length; idx++) {
			if (sum[idx] == max) {
				System.out.printf("%d", idx + 1);
			}
		}
		scan.close();
	}

}
