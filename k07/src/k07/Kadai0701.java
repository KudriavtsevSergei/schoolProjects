package k07;

import java.util.Scanner;

public class Kadai0701 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Syain[] syain = new Syain[3];
		for (int i = 0; i < syain.length; i++) {
			System.out.print("1:Eigyo  2:Hanbai-->");
			int type = sc.nextInt();
			if (type == 1) {
				System.out.print("Code-->");
				String code = sc.next();
				System.out.print("Name-->");
				String name = sc.next();
				System.out.println();
				syain[i] = new Eigyou(code, name);
			} else if (type == 2) {
				System.out.print("Code-->");
				String code = sc.next();
				System.out.print("Name-->");
				String name = sc.next();
				System.out.println();
				syain[i] = new Hanbai(code, name);
			}
		}
		for (int i = 0; i < syain.length; i++) {
			System.out.println("Code:" + syain[i].getCode());
			System.out.println("Name" + syain[i].getName());
			syain[i].work();
		}
	}
}
