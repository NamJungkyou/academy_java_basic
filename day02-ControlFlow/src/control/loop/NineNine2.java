package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		String ninenine = "";
		String mstage = "";
		for (int stage = 2; stage <= 9; stage++) {
			for (int times = 1; times <= 9; times++) {
				if(times != 9) {
				ninenine += stage + " x " + times + " = " + stage * times + "\r\n";
				} else {
					ninenine += stage + " x " + times + " = " + stage * times;
				}
			}
			mstage = stage + " 단\r\n";
			mstage += ninenine;
			System.out.print(mstage);
			ninenine = "";

		}
	}

}
