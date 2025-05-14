package k04;

import java.util.Scanner;

public class Kadai0403 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] ba = new BankAccount[3];

		for (int i = 0; i < ba.length; i++) {
			System.out.print("Name --> ");
			String name = sc.next();
			System.out.print("Money --> ");
			int money = sc.nextInt();
			ba[i] = new BankAccount(name, money);
		}
		System.out.println();
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i].getNumber() + "\t" + ba[i].getName() + "\t" + ba[i].getMoney());
		}
		System.out.print("Rate --> ");
		double rate = sc.nextDouble();
		BankAccount.setRate(rate);

		for (int i = 0; i < ba.length; i++) {
			ba[i].addInterest();
		}
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i].getNumber() + "\t" + ba[i].getName() + "\t" + ba[i].getMoney());
		}
		sc.close();
	}
}