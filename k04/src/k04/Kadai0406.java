package k04;

import java.util.Scanner;

public class Kadai0406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Card No--> ");
		String cardNo = sc.next();

		System.out.print("Name--> ");
		String name = sc.next();

		System.out.print("Tel-->");
		String tel = sc.next();

		System.out.print("Buy Count--> ");
		int buyNo = sc.nextInt();

		Buy[] buyData = new Buy[buyNo];

		for (int i = 0; i < buyNo; i++) {

			System.out.print("Buy Date-->");
			String buyDate = sc.next();
			
			System.out.print("Shohin No--> ");
			String shohinNo = sc.next();
			
			System.out.print("Price-->");
			int price = sc.nextInt();
			
			System.out.print("Num-->");
			int num = sc.nextInt();
			System.out.println();
			buyData[i] = new Buy(buyNo, buyDate, shohinNo, price, num);
		}
		Card card = new Card(cardNo, name, tel, buyData);
		card.printCardData();
		sc.close();
	}
}