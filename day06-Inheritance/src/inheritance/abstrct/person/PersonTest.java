package inheritance.abstrct.person;
/**
 * Person과 상속관계인 Student, Teacher, Employee를 테스트하는 클래스
 * @author Byun
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		
		// 1. 선언, 2 .초기화
		Person[] persons = new Person[3];
		persons[0]= new Student("P01", "홍길동", 18, "도술");
		persons[1] = new Teacher("T01", "유재석", 44, "MC");
		persons[2]= new Employee("E01", "남정규", 27, "개발");
		
		// 3. 사용
		for (Person person : persons) {
			person.print();
		}
	}

}
