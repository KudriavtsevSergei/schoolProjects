package k09;

import java.util.Scanner;

public class Kadai0902 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius-->");
		double radius=sc.nextDouble();
		Circle c=new Circle();
		try {
			System.out.println("Area:"+c.getArea(radius));
		} catch (Exception e) {
		 System.out.println("Radius Error!");
		}
	}

}
