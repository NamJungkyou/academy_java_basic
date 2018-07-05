package control.switchstmt;

import java.util.Scanner;

public class ReportGrade {

	public static void main(String[] args) {
		// 1. 변수 선언
		int score;
		char grade;
		// 스캐너 변수 선언
		Scanner scan;

		// 2. 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		System.out.print("0 ~ 100 사이의 정수를 입력 : ");
		// 입력된 값으로 score변수 초기화
		score = scan.nextInt();

		// 3. 사용
		switch (score / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7: case 6:
			grade = 'C';
			break;
		case 5: case 4:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.printf("%d점에 해당하는 학점은 %c", score, grade);
		
		scan.close();
	}

}
