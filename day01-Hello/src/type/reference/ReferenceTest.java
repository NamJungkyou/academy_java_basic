package type.reference;
/**
 * 기본형 8가지 이외의 모든 타입인 참조형 타입을 테스트하는 클래스이다.
 * @author Byun
 *
 */
public class ReferenceTest {

	public static void main(String[] args) {
		// 1. 선언 : 타입 변수이름;
			// 선언할 때, 타입에 기본형 8가지가 아닌 이름이 오면 무조건 참조형
			// --> 변수칸에 화살표가 저장되고 진짜 값은 다른 곳에 존재하는 타입
		String name;
		
		// 2. 초기화
		name = "남정규";
		
		// 3. 사용
		System.out.println("name = " + name);
	}

}
