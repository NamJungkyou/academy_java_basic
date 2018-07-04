package type.primitive;

public class FloatTest {
/**
 * 실수형 타입인 float, double을 테스트하는 클래스이다.
 * @param args
 */
	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2. 초기화
		pi1 = 3.14F;
		pi2 = 3.14;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("float pi1 = "+pi1);
		System.out.println("double pi1 = "+pi2);
		System.out.println("=============================");
		
		pi1 = 3.141592653589793238F;
		pi2 = 3.141592653589793238;
		
		System.out.println("float pi1 = "+pi1);
		System.out.println("double pi1 = "+pi2);
	}

}
