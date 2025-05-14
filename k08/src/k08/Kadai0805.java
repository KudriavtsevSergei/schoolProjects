package k08;

import java.util.Scanner;

public class Kadai0805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Meibo[] names = new Meibo[5];
		int index = 0;
		while (index != -1) {
			try {
				System.out.print("Index--> ");
				index = sc.nextInt();
				sc.nextLine();
				if (index != -1) {
					System.out.print("Name--> ");
					String name = sc.nextLine();
					names[index] = new Meibo(name);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index Error");
			} catch (Exception e) {
				System.out.println("Input Mismatch");
				sc.nextLine();
			}
		}
		index = 0;
		while (index != -1) {
			try {
				System.out.print("Search Index --> ");
				int searchIndex = sc.nextInt();
				sc.nextLine();
				if (searchIndex == -1) {
					index = -1;
				} else if (searchIndex >= 0 && searchIndex < names.length) {
					if (names[searchIndex] != null) {
						System.out.println("Name --> " + names[searchIndex].getName());
					} else {
						System.out.println("Not Found");
					}
				} else {
					System.out.println("Index Out Of Bounds");
				}
			} catch (Exception e) {
				System.out.println("Input Mismatch");
				sc.nextLine();
			}
		}
	}
}