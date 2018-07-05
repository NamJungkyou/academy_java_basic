package control.loop;

public class SquareTable {

	public static void main(String[] args) {
		for (int idx = 1; idx <= 10; idx++) {
			int square = idx * idx;
			System.out.printf("%3d x %3d = %4d%n", idx, idx, square);
		}
	}

}
