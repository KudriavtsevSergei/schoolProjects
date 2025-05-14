package k08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String next;

		do {

			try {
				System.out.print("Input num1--> ");
				int num1 = sc.nextInt();
				System.out.print("Input num2--> ");
				int num2 = sc.nextInt();
				int ans = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + ans);
			} catch (InputMismatchException e) {
				System.out.println("Error: 整数を入力");
				sc.next();

			} catch (ArithmeticException e) {
				System.out.println("ERROR: 0除算");
			}

			System.out.print("Continue? (Yes or No) --> ");
			next = sc.next();
			System.out.println();

		} while (next.equalsIgnoreCase("Yes"));

		sc.close();
	}
}
