package k03;

import java.util.Scanner;

public class Kadai0304 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("CSV String--> ");
		String csvInput = scanner.nextLine();
		System.out.print("Pass Score-->: ");
		int passScore = scanner.nextInt();
		Seiseki seiseki = new Seiseki(csvInput);
		printSeiseki(seiseki, passScore);
		scanner.close();
	}
	private static void printSeiseki(Seiseki seiseki, int passScore) {
		System.out.println("Number : " + seiseki.getNo());
		System.out.println("Name : " + seiseki.getName());
		System.out.printf("Score : %.2f%n", seiseki.getScore());
		System.out.println("Grade : " + seiseki.getGrade(passScore));
	}
	}
