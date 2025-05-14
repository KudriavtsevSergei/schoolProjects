package k06;

import java.util.Scanner;

public class Kadai0602 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Syain s[] = new Syain[3];

		for (int i = 0; i < s.length; i++) {
			System.out.print("1:Eigyo  2:Hanbai-->");
			int type = sc.nextInt();
			if (type == 1) {
				System.out.print("Code-->");
				String code = sc.next();
				System.out.print("Name-->");
				String name = sc.next();
				System.out.println();
				s[i] = new Eigyo(code, name);
			} else if (type == 2) {
				System.out.print("Code-->");
				String code = sc.next();
				System.out.print("Name-->");
				String name = sc.next();
				System.out.println();
				s[i] = new Hanbai(code, name);
			} else {
				System.out.println("ERROR");
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println();
			System.out.println(s[i].getCode());
			System.out.println(s[i].getName());
			if (s[i] instanceof Eigyo) {
				((Eigyo) s[i]).work();
			} else if (s[i] instanceof Hanbai) {
				((Hanbai) s[i]).work();
			}
			sc.close();
		}
	}
}