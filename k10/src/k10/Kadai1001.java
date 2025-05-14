package k10;

import java.util.Scanner;

public class Kadai1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		Student[] stu = {
				new Student("24JN0001", "AoyamaIchiro"),
				new Student("24JN0002", "KagawaSaori"),
				new Student("24JN0003", "SasakiSyouta"),
				new Student("24JN0004", "TakanoMinori"),
				new Student("24JN0005", "NakaiKenta"),
		};

		System.out.print("GakusekiNo-->");
		String gakusekiNo = sc.next();
		System.out.print("GakuseiName-->");
		String gakuseiName = sc.next();

		Student stud = new Student(gakusekiNo, gakuseiName);

		int i = 0;
		while (i < stu.length && !stu[i].equals(stud)) {
			i++;
		}
		if (i < stu.length) {
			System.out.println("Search Successfull.Index:" + i);
		} else {
			System.out.println(" NOT FIND");
		}
	}
}
