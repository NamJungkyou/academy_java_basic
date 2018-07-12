package school;

public class Teacher extends Person implements Lesson{
	// 1. 멤버변수 선언부
	String subject;

	// 2. 생성자 선언부
	Teacher() {

	}

	Teacher(String subject) {
		this.subject = subject;
	}

	Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}

	// 3. 메소드 선언부
	@Override
	public String toString() {
		String subjectStr = ", 과목 : "+ subject;
		return "선생정보 [" + super.toString() + subjectStr + "]";
	}

	@Override
	public void print() {
		System.out.println("==사원==");
		System.out.println(this);
	}

	@Override
	public String attend() {
		String tchStr = String.format("교사 [%s]가 출근하였습니다.", this.getId());
		return tchStr;
	}

	@Override
	public String lesson() {
		return String.format("교사[%s](이)가 담당과목[%s] 수업을 하고 있습니다.", this.getId(),this.subject);
	}
}
