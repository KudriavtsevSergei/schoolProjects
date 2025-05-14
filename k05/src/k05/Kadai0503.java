package k05;

import java.util.Scanner;


public class Kadai0503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FBankAccount[] ba = new FBankAccount[3];

		for (int i = 0; i < ba.length; i++) {
			System.out.print("Name --> ");
			String name = sc.next();
			System.out.print("Money --> ");
			int money = sc.nextInt();
			ba[i] = new FBankAccount(name, money);
		}
		System.out.println();
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i].getNumber() + "\t" + ba[i].getName() + "\t" + ba[i].getMoney());
		}
		System.out.println("入金処理");
		for (int i = 0; i < ba.length; i++) {
			System.out.println("Number:"+ba[i].getNumber());
			System.out.print("Deposit Money-->");
			int money=sc.nextInt();
			ba[i].depositMoney(money);
		}
		System.out.println("講座一覧");
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i].getNumber() + "\t" + ba[i].getName() + "\t" + ba[i].getMoney());
		}
		
		System.out.println("出金処理");
		for (int i = 0; i < ba.length; i++) {
			System.out.println("Number:"+ba[i].getNumber());
			System.out.print("Deposit Money-->");
			int money=sc.nextInt();
			if(ba[i].paymentMoney(money)==-1) {
				System.out.println("残高不足です");
				
			}
		}
		System.out.println("講座一覧");
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i].getNumber() + "\t" + ba[i].getName() + "\t" + ba[i].getMoney());
		}
		
		
		System.out.print("Rate --> ");
		double rate = sc.nextDouble();
		FBankAccount.setRate(rate);

		for (int i = 0; i < ba.length; i++) {
			ba[i].addInterest();
		}
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i].getNumber() + "\t" + ba[i].getName() + "\t" + ba[i].getMoney());
		}
		sc.close();

}
}