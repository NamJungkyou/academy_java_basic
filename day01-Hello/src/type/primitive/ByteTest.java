package type.primitive;

/**
 * 1byte에 해당하는 범위만큼 정수를 저장하는 타입인 byte를 테스트하는 클래스이다.
 * 
 * 1byte = 8bit;
 * 
 * @author Byun
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		// 1. 선언
		byte buffer;
		
		// 2. 초기화
		buffer = 0;
		// 3. 사용
		for (int idx = 0; idx <257; idx++) {
			System.out.print(buffer++);
			System.out.println(", ");
		}
		
		//  buffer = 128; 오류// byte에 저장할 수 있는 양수의 최대 값은 127
						      // 저장할 수 있는 범위를 넘는 값을 직접할당하는 것은 불가능
	}

}
