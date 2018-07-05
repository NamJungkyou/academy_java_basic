package operator.binary;
/**
 * 객체의 타입을 조사하는 연산자 instanceof를 테스트하는 클래스
 * 
 * object instanceof class로 사용시 object가 class타입의 객체이면 true
 * 그 외의 경우는 false를 결과로 얻어내는 연산자
 * @author Byun
 *
 */
public class InstanceofTest {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		String name = "남정규";
		boolean result;
		// 3. 사용
		result = (name instanceof String);
		System.out.printf("name = %s이다. %s는 String 타입인가? %b%n", name, name, result);
		
		// 1. 선언 : StringBuffer => 문자열을 저장할 수 있는 String과 유사하지만 다른 타입
		//StringBuffer surname = "Nam";  -> 일반적인 String타입과 같이 초기화 불가능
		StringBuffer surname;
		
		// 2. 초기화
		surname = new StringBuffer("Nam");
		
		// 3. 사용
		result = ((Object)surname instanceof String);
		System.out.printf("surname = %s이다. %s는 String 타입인가? %b%n", surname, surname, result);
	}

}
