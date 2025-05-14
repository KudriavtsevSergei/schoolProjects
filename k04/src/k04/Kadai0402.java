package k04;

import java.util.Scanner;

public class Kadai0402 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Kamoku[] kamoku = {
				new Kamoku("1023", "アルゴリズム"),
				new Kamoku("3951", "プログラミング"),
				new Kamoku("6700", "Win プログラミング"),
				new Kamoku("1159", "Web プログラミング"),
				new Kamoku("4401", "Linux"),
				new Kamoku("8211", "卒業制作"),
		};
		System.out.print("KamokuCode or end--＞＞");
		String kaCode = sc.next();

		while (!kaCode.equals("end")) {
			int i = 0;
			for (i = 0; i < kamoku.length; i++) {
				if (kaCode.equals(kamoku[i].getKamokuCode())) {
					System.out.println(kamoku[i].getKamokuName());
					break;
				}
			}
			if (i >= kamoku.length) {
				System.out.println("'" + kaCode + "'" + " NOT FIND: ");
			}
			System.out.print("KamokuCode or end--＞＞");
			kaCode = sc.next();
		}
		sc.close();
	}

}
