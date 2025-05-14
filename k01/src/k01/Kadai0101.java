package k01;

import java.util.Scanner;

public class Kadai0101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("no-->");
		String no = sc.next();
		System.out.print("name-->");
		String name = sc.next();
		System.out.print("title-->");
		String title = sc.next();
		System.out.print("year-->");
		int year = sc.nextInt();
		System.out.print("month-->");
		int month = sc.nextInt();
		System.out.print("day-->");
		int day = sc.nextInt();
		Kashidashi kd = new Kashidashi(no, name, title, year, month, day);

		System.out.println("No:" + kd.getNo());
		System.out.println("Name:" + kd.getName());
		System.out.println("Title:" + kd.getTitle());
		System.out.println("Date:" + kd.getKashidashiDate());

		System.out.print("Henkyaky(true: Yes false: No)-->");
		boolean henkyaku = sc.nextBoolean();
		kd.setHenkyaku(henkyaku);
		kd.printKashidashi();
	}

}
