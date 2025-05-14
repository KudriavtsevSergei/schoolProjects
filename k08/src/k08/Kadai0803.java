package k08;

import java.util.Scanner;

public class Kadai0803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = -1;
		}
		int next = 0;
		while (next != -1) {
			try {
				System.out.print("Index--> ");
				next = sc.nextInt();

				if (next != -1) {
					System.out.print("Nums[" + next + "] = ");
					nums[next] = sc.nextInt();
					System.out.println();
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index Error!");
				System.out.println();
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Nums[" + i + "]:" + nums[i]);
		}
		sc.close();
	}
}
