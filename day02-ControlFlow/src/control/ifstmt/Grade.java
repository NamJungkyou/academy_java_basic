package control.ifstmt;

import java.util.Scanner;

/**
 * 다중선택 if문을 사용하여 다음의 기준으로 입려된 점수에 대해 학점을 계산하는 클래스 작성
 * 
 * 90점이상 A 
 * 80~89 B 
 * 60~79 C 
 * 40~59 D 
 * 나머지 F
 * 
 * @author Byun
 *
 *         점수는 int 타입, 변수명 score 학점 char 타입 변수명 grade를 사용할 것
 *
 *         출력시 printf를 사용
 */

public class Grade {

	public static void main(String[] args) {
		// 1. 변수 선언
		int score;
		char grade;
		// 스캐너 변수 선언
		Scanner scan;
		
		// 2. 초기화
		// 스캐너 초기화
		scan = new Scanner(System.in);
		System.out.print("0 ~ 100 사이의 정수를 입력 : ");
		//입력된 값으로 score변수 초기화
		score = scan.nextInt();
		
		//3. 사용 : score에 입력된 값을 판단
		if (score <= 100 && score >= 0) {
			if (score >= 90) {
				grade = 'A';
			} else if (/* score < 90 && */ score >= 80) {
				grade = 'B';
			} else if (/* score < 80 && */ score >= 60) {
				grade = 'C';
			} else if (/* score < 70 && */ score >= 40) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.printf("%d점에 해당하는 학점은 %c", score, grade);
		} else {
			System.out.printf("0 ~ 100 사이의 정수가 아닙니다. 입력값 : %d", score);
		}
		scan.close();
	}

}
