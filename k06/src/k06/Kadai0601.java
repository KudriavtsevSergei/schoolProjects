package k06;

import java.util.Scanner;

public class Kadai0601 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("No-->");
		String no = sc.next();
		System.out.print("Name-->");
		String name = sc.next();
		System.out.print("Price-->");
		int price = sc.nextInt();
		System.out.print("Discount Rate-->");
		double discountRate = sc.nextDouble();

		SaleShohin s = new SaleShohin(no, name, price, discountRate);

		s.printShohin();
		System.out.println();
		System.out.println("Discount Price:" + s.getPrice());
		sc.close();
	}

}
