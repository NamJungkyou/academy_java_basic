package array.init;

/**
 *               ★
 *               ★★
 *               ★★★
 *               ★★★★
 *               ★★★★★
 *               ★★★★★★
 *               
 *               stars.length = 6;
 *               star[3].length = 4
 * @author Byun
 *
 */
public class MutiDarray {

	public static void main(String[] args) {
		// 1. 선언
		char stars[][];

		// 2. 초기화
		stars = new char[6][];

		// 3. 사용
		for (int idx = 0; idx < stars.length; idx++) {
			stars[idx] = new char[idx + 1];
		}
		System.out.println(stars[1].length);
	}

}
