package school;

/**
 * 학교 구성원중 학생, 교사만 구현할 수업을 나타내는 인터페이스
 * 
 * @author Byun
 *
 */
public interface Lesson {
	/**
	 * 수업을 진행함
	 * @return
	 */
	// public abstract 선언은 당연함로 명시적으로 주지 않아도됨
	String lesson();
}
