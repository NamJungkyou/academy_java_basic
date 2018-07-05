package control.ifstmt;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// 1. 선언
		// 입력받을 변수 선언
		int input;
		String result;
		// 스캐너변수 선언
		Scanner scan;
		
		// 2. 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		
		// 스캐너를 사용하여 입력 변수 초기화
		System.out.print("정수 하나를 입력 : ");
		input = scan.nextInt();
		
		// 3. 사용
		// 입력값이 저장된 input병수를 if ~ else if ~ else 구문으로 부호 판단
		/*if (input > 0) {
			result = "양수";
		} else if(input == 0) {
			result ="0";
		} else {
			result = "음수";
		}*/
		if (input > 0) {
			result = "양수";
		} else if(input < 0) {
			result ="음수";
		} else {
			result = "0";
		}
		System.out.printf("입력값 %d는 %s입니다.%n", input, result);
		
		scan.close();
	}

}
