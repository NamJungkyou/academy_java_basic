package array.init;

import java.util.Scanner;

/**
 * 야구 구단의 1~5선발 선수의 방어율을 입력하고 그중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 
 * @author Byun
 *
 */
public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;

		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for (int idx = 0; idx < ERA.length; idx++) {
			System.out.print((idx + 1) + "번째 팀 1~5선발 투수 방어율 : ");
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				ERA[idx][idx2] = scan.nextDouble();
				if (ERA[idx][idx2] < min) {
					min = ERA[idx][idx2];
				}
			}
		}

		System.out.println("최고의 투수는");
		for (int idx = 0; idx < ERA.length; idx++) {
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				if (ERA[idx][idx2] == min) {

					System.out.printf("%d번째 팀 %d선발 투수 이고 방어율을 %4.2f 입니다%n", idx + 1, idx2 + 1, min);
				}
			}
		}
		
		scan.close();
	}

}
