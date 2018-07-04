package type.primitive;

/**
 * 문자 1개를 저장하는 타입인 char형 변수에 
 * 
 * 테스트하는 클래스이다.
 * @author Byun
 *
 */
public class CharTestUnicode {

	public static void main(String[] args) {
		// 1.선언, 2. 초기화
		char han ='\ud55c'; // '한'
		char gul ='\uae00'; // '글'
		
		// 3. 사용
		System.out.println(han + gul); // ud55c를 10진수로 바꾼 값과 uae00을 10진수로 바꾼 값을 더한 값
		System.out.println(han + "" + gul);		
		System.out.println(han);		
		System.out.println(gul);		
	}

}
