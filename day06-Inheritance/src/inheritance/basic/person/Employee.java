package inheritance.basic.person;

public class Employee extends Person {
	// 1. 멤버변수 선언부
	String dept;

	// 2. 생성자 선언부
	Employee() {

	}

	Employee(String dept) {
		this.dept = dept;
	}

	Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
	}

	// 3. 메소드 선언부
	@Override
	public String toString() {
		String detpStr = String.format(", 부서 : %s",dept);
		return "사원정보 [" + super.toString() + detpStr + "]";
	}
}
