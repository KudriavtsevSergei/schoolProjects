package k04;

import java.util.Scanner;

public class Kadai0405 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salary sl[] = new Salary[3];

		for (int i = 0; i < sl.length; i++) {
			System.out.print("Number-->");
			String number = sc.next();
			System.out.print("Name-->");
			String name = sc.next();
			System.out.print("Academic-->");
			int academic = sc.nextInt();
			System.out.print("ExYear-->");
			int exYear = sc.nextInt();
			System.out.print("OverTime-->");
			int overTime = sc.nextInt();
			System.out.println();
			sl[i] = new Salary(number, name, academic, exYear, overTime);
		}
		System.out.println();
		for (int i = 0; i < sl.length; i++) {
			sl[i].printPaySlip();
			System.out.println();
		}

		sc.close();
	}

}
