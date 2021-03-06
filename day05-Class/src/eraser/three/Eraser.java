package eraser.three;

public class Eraser {
	// 1. 멤버변수 선언부
	/** 지우개 번호 */
	int serial;
	/** 가로 */
	double width;
	/** 세로 */
	double height;
	/** 높이 */
	double depth;
	/** 겹 */
	int layer;

	/** 지우개의 일련번호를 얻기 위한 클래스 변수 */
	static int count = 0;

	// 2. 생성자 선언부
	/**
	 * 기본 생성자
	 */
	Eraser() {
		this.serial = ++count;
	}

	/**
	 * width 필드만 초기화하는 생성자
	 * 
	 * @param width
	 */
	Eraser(double width) {
		this();
		this.width = width;
	}

	/**
	 * width, height 필드만 초기화 하는 생성자
	 * 
	 * @param width
	 * @param height
	 */
	Eraser(double width, double height) {
		this(width);
		this.height = height;
	}

	/**
	 * width, height, depth 필드만 초기화 하는 생성자
	 * 
	 * @param width
	 * @param height
	 * @param depth
	 */
	Eraser(double width, double height, double depth) {
		this(width, height);
		this.depth = depth;
	}

	/**
	 * 4개의 필드를 초기화 하는 생성자
	 * 
	 * @param width
	 * @param height
	 * @param depth
	 * @param layer
	 */
	Eraser(double width, double height, double depth, int layer) {
		this(width, height, depth);
		// this() 선언은 생성자 첫번째 줄에 단 1회만 사용가능
		this.layer = layer;
	}

	// 3. 메소드 선언부
	// 상태 출력하는 메소드
	public void print() {
		System.out.printf("일련번호 : %d | 가로 : %4.2f | 세로 : %4.2f | 높이 : %4.2f | 겹 : %d%n", serial, width, height, depth,
				layer);
	}

	// 지우개 한겹 제거하는 메소드
	public void peel() {
		// 남아있는 겹의 수가 -값이 될 수 없도록 if 구문을 사용하여 값을 체크
		if ((layer - 1) >= 0) {
			layer -= 1;
		}
	}
}
