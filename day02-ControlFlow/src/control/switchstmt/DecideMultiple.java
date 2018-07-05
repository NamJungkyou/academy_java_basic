package control.switchstmt;

import java.util.Scanner;

/**
 * 입력된 자연수가 3의 배수인지 확인하는 클래스
 * 
 * 
 * @author Byun
 *
 */
public class DecideMultiple {

	public static void main(String[] args) {
		// 1. 선언
		// 입력받을 값을 저장할 변수 선언
		int input;
		
		// 입력을 위한 스캐너 변수 선언
		Scanner scan;
		
		// 2. 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		
		//스캐너를 사용하여 input 변수 초기화
		System.out.print("자연수를 입력하세요.");
		input = scan.nextInt();
		
		// 3. 사용 : input 변수의 값이 3의 배수인지 판단 (나머지 연산)
		switch (input % 3) {
		case 0 :
			System.out.printf("입력받은 값 %d은 3의 배수입니다.", input);
			break;
		case 1 : case 2 :
	 // case 2 :
			System.out.printf("입력받은 값 %d은 3의 배수가 아닙니다.", input);
			break;
		/*case 2 : 
			System.out.printf("입력받은 값 %d은 3의 배수가 아닙니다.", input);
			break;*/

		default:
			System.out.println("입력이 잘못되었습니다.");
			break;
		} // end switch
		
		scan.close();
	} // end main

} // end class
