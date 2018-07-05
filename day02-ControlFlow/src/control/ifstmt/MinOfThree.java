package control.ifstmt;

import java.util.Scanner;

/**
 * 세 정수를 입력받아 그중 가장 작은 정수를 판별하는 클래스
 * 
 * 가장 작은 정수를 판별할 때 중첩 if ~ else 구문을 사용
 * @author Byun
 *
 */
public class MinOfThree {

	public static void main(String[] args) {
		// 1. 선언
		// 입력을 받을 변수 선언
		int num1;
		int num2;
		int num3;
		int min;
		
		Scanner scan;
		
		//2. 초기화
		scan = new Scanner(System.in);
		System.out.print("정수 세개 입력 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		// 3. 사용 : 중첩 if ~ else 구조로 작은 값 판단
		if (num1 < num2) {
			if (num1<num3) {
				min = num1;
			} else {
				min = num3;
			}
		} else {
			if(num2 <num3) {
				min = num2;
			}else {
			min = num3;
		}
		} 
		System.out.printf("입력된 세 정수 : %d %d %d%n 가장 작은 값 : %d", num1, num2, num3, min);
		
		scan.close();
	}

}
