package k08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai0802 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int i = 0;
		while (i < nums.length) {

			try {
				System.out.print("Nums[" + i + "] -->");
				nums[i] = sc.nextInt();
				i++;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("Input Error");
			}
			sc.close();
		}
		System.out.println();
		for (i = 0; i < nums.length; i++) {
			System.out.println("Nums[" + i + "]:" + nums[i]);
		}

	}

}
