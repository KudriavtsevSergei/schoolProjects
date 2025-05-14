package k07;

import java.util.Scanner;

public class Kadai0702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Figure[] f = new Figure[3];
		for (int i = 0; i < f.length; i++) {
			System.out.print("1:Triangle 2:Rectangle 3:Triangle-->");
			int type = sc.nextInt();
			if (type == 1) {
				System.out.print("Radius-->");
				double radius = sc.nextDouble();
				f[i] = new Circle(radius);
			} else if (type == 2) {
				System.out.print("Side1-->");
				double side1 = sc.nextDouble();
				System.out.print("Side2-->");
				double side2 = sc.nextDouble();
				f[i] = new Rectangle(side1, side2);
			} else if (type == 3) {
				System.out.print("Bottom-->");
				double bottom = sc.nextDouble();
				System.out.print("Height-->");
				double height = sc.nextDouble();
				f[i] = new Triangle(bottom, height);
			}
		}
		for (int i = 0; i < f.length; i++) {
			System.out.println("Area:" + f[i].getArea());
		}
	}

}
