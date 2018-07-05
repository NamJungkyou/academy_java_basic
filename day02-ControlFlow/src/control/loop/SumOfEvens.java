package control.loop;

public class SumOfEvens {

	public static void main(String[] args) {
				int number = 0;
				int sum = 0;
				while(number <= 100) {
					sum += number;
					number += 2;
				}
				System.out.printf("1 ~ 100 까지 짝수의 합 : %d", sum);
			/*
			 * int number = 1;
			 * int sum = 0;
				while (number <= 100) {
					if ((number % 2) == 0) {
						sum += number;
					}
					number++;
				}
				System.out.printf("1 ~ 100 까지 짝수의 합 : %d", sum);
			*/
	}

}
