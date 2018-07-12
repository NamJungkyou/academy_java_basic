package calc;

/**
 * static 영역과 non-static 영역 사이의 초기화 시점에 따른 호출 방향을 테스트하는 클래스
 * 
 * @author Byun
 *
 */
public class Calculator {
	// add
	public int add(int x, int y) {
		return x + y;
	}

	// substract
	public int substarct(int x, int y) {
		return x - y;
	}

	// multiply
	public int multiply(int x, int y) {
		return x * y;
	}

	// divide
	public int divide(int x, int y) {
		return x / y;
	}

	// modular
	public int mudular(int x, int y) {
		return x % y;
	}
	
	//static 메소드 선언
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static double substract(double x, double y) {
		return x - y;
	}
	
	public static double multiply(double x, double y) {
		return x * y;
	}
}
