package encap.person;
/**
 * Person과 상속관계인 Student, Teacher, Employee를 테스트하는 클래스
 * @author Byun
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		
		// 1. 선언, 2 .초기화
		Person person = new Person("P01", "홍길동", 18);
		Student student = new Student("P01", "홍길동", 18, "도술");
		Teacher teacher = new Teacher("T01", "유재석", 44, "MC");
		Employee employee = new Employee("E01", "남정규", 27, "개발");
		
		// 3. 사용
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
		System.out.println(employee);
	}

}
