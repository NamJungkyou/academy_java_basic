package calc;

import static calc.Calculator.*;
/**
 * 산술연산을 하는 클래스인 Calculator를 테스트한다.
 * 
 * @author Byun
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {
		// 1. 선언
		Calculator calc;

		// 2. 초기화
		calc = new Calculator();
		// non-static 영역의 명시적 초기화 : new 사용

		// 3. 사용
		// (1) static -> non-static : 다른 클래스
		//Calculator 클래스의 add 메소드 사용
		int addResult = calc.add(100, 200);
		System.out.println("100 + 200 = " + addResult);
		
		// (2) static -> non-static : 같은 클래스
		// 이 클래스에 있는 add()를 사용
		// 이 클래스 자신의 객체를 생성 후 사용 가능
		CalculatorTest cTest = new CalculatorTest();
		cTest.add(100, 200);
		
		// (3) static -> static : 같은 클래스
		// 동일클래스 안의 static 영역끼리의 호출 : 이름만으로 바로 사용 가능
		substract(100, 200);
		
		//다른 클래스의 static 영역끼리의 호출 : 앞에 클래스 이름을 명시
		// (4) static -> static : 다른 클래스
		Calculator.substract(20.0, 45.5);
		
		// (5) static import를 사용하여 마치 내가 가지고 있는 메소드처럼 호출 가능
		Calculator.multiply(10.0, 20.0);
		multiply(10.0, 20.0);
		
	} // end main
	
	// add 메소드 정의 : non-static
	public int add(int x, int y) {
		System.out.printf("%d + %d = %d", x, y, x + y);
		return x + y;
	}

	public static int substract(int x, int y) {
		System.out.printf("%d - %d = %d", x, y, x - y);
		return x - y;
	}
}
