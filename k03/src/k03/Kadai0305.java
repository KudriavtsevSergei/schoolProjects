package k03;

import java.util.Random;

public class Kadai0305 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100) + 1;
		}
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {

					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			String parity = (num % 2 == 0) ? "偶数" : "奇数";
			String multipleOfFour = (num % 4 == 0) ? "(4の倍数)" : "";
			String primeStatus = isPrime(num) ? "素数" : "非素数";

			System.out.printf("%d : %s %s %s\n", num, parity, multipleOfFour, primeStatus);
		}

	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}