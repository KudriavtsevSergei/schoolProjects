package k05;

import java.util.Scanner;

public class Kadai0504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Current Year --> ");
		int currentYear = sc.nextInt();
		TBankAccount.setCurrentYear(currentYear);

		TBankAccount[] tba = new TBankAccount[3];

		for (int i = 0; i < tba.length; i++) {
			System.out.print("Name --> ");
			String name = sc.next();
			System.out.print("Money --> ");
			int money = sc.nextInt();

			System.out.print("Due (1/3/5) --> ");
			int due = sc.nextInt();
			while(due !=1 && due!=3 && due!=5) {
				System.out.print("Chose(1/3/5) --> ");
				due = sc.nextInt();
			}
			tba[i] = new TBankAccount(name, money, due);
		}

		System.out.println();
		for (int i = 0; i < tba.length; i++) {
			System.out.println(
					tba[i].getNumber() + "\t" + tba[i].getName() + "\t" + tba[i].getMoney() + "\t" + tba[i].getDue());
		}

		System.out.print("\nCurrent Year --> ");
		currentYear = sc.nextInt();
		TBankAccount.setCurrentYear(currentYear);

		System.out.print("Rate --> ");
		double rate = sc.nextDouble();
		TBankAccount.setRate(rate);

		for (int i = 0; i < tba.length; i++) {
			tba[i].addInterest();
		}

		System.out.println();
		for (int i = 0; i < tba.length; i++) {
			System.out.println(tba[i].getNumber() + "\t" + tba[i].getName() + "\t" + tba[i].getMoney());
		}

		sc.close();
	}
}