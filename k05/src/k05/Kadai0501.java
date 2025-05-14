package k05;

import java.util.Scanner;

public class Kadai0501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ID-->");
		String id = sc.next();

		System.out.print("Name-->");
		String name = sc.next();

		Engineer en1 = new Engineer(id, name);

		System.out.print("ID-->");
		id = sc.next();

		System.out.print("Name-->");
		name = sc.next();

		System.out.print("Project Name-->");
		String projectName = sc.next();

		Engineer en2 = new Engineer(id, name, projectName);

		en1.printEngineer();
		en2.printEngineer();

		System.out.print("Aoyama's New Project Name-->");
		projectName = sc.next();
		en1.setProjectName(projectName);

		en1.printEngineer();
		sc.close();
	}
}
