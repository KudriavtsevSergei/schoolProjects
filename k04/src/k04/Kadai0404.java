package k04;

import java.util.Scanner;

public class Kadai0404 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Seiseki[] students = new Seiseki[4];

		for (int i = 0; i < students.length; i++) {
			System.out.print("Number --> ");
			String number = sc.next();
			System.out.print("Name --> ");
			String name = sc.next();
			System.out.print("Score --> ");
			int score = sc.nextInt();
			students[i] = new Seiseki(number, name, score);
		}

		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1 - i; j++) {
				if (students[j].getScore() < students[j + 1].getScore() ||
						(students[j].getScore() == students[j + 1].getScore()
								&& students[j].getNumber().compareTo(students[j + 1].getNumber()) > 0)) {

					Seiseki temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getNumber() + "\t" + students[i].getName() + "\t" + students[i].getScore());
		}

		sc.close();
	}

}
