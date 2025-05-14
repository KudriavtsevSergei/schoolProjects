package k02;

import java.util.Scanner;

public class Kadai0203 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.print("利率-->");
		double rate=sc.nextDouble();
		BankAccount.setRate(rate);
		System.out.println();
		System.out.print("口座名義--＞");
		String name=sc.next();
		
		System.out.print("貯金額--＞");
		int money=sc.nextInt();
		System.out.println();
		BankAccount ba1=new BankAccount(name, money);
		
		System.out.println();
		System.out.print("口座名義--＞");
		name=sc.next();
		
		System.out.print("貯金額--＞");
		money=sc.nextInt();
		System.out.println();
		BankAccount ba2=new BankAccount(name, money);
		
		ba1.addInterest();
		ba2.addInterest();
		
		System.out.println("口座番号:"+ba1.getNumber());
		System.out.println("口座名義:"+ba1.getName());
		System.out.println("口座残高:"+ba1.getMoney());
		System.out.println();
		System.out.println("口座番号:"+ba2.getNumber());
		System.out.println("口座名義:"+ba2.getName());
		System.out.println("口座残高:"+ba2.getMoney());
		System.out.println();
		
		System.out.print("利率-->");
		rate=sc.nextDouble();
		BankAccount.setRate(rate);
		
		ba1.addInterest();
		ba2.addInterest();
		
		System.out.println();
		System.out.println("口座番号:"+ba1.getNumber());
		System.out.println("口座名義:"+ba1.getName());
		System.out.println("口座残高:"+ba1.getMoney());
		System.out.println();
		System.out.println("口座番号:"+ba2.getNumber());
		System.out.println("口座名義:"+ba2.getName());
		System.out.println("口座残高:"+ba2.getMoney());
		System.out.println();
	}

}
