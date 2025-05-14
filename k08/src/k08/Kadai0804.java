package k08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai0804 {

	public static int nextInt(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch");
			System.out.println();
			return nextInt(message);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] Nums = new int[5];
		for (i = 0; i < Nums.length; i++) {
			Nums[i] = -1;
		}

		i = nextInt("Index --> ");
		while (i >= 0) {
			try {
				Nums[i] = nextInt("Nums[" + i + "] --> ");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index Error!");
				System.out.println();
			}
			System.out.println();
			i = nextInt("Index --> ");
		}

		System.out.println();
		for (i = 0; i < Nums.length; i++) {
			System.out.println("Nums[" + i + "] : " + Nums[i]);
		}
		sc.close();

	}

}
