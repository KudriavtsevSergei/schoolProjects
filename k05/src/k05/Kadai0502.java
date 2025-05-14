package k05;

import java.util.Scanner;

public class Kadai0502 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Name-->");
		String name=sc.next();
		
		Member m1=new Member(name);
		
		System.out.print("Name-->");
		name=sc.next();
		System.out.print("Point-->");
		int point=sc.nextInt();
		
		Member m2=new Member(name,point);
		
		System.out.println("No:"+m1.getNo());
		System.out.println("Name:"+m1.getName());
		System.out.print("Add Point-->");
		point=sc.nextInt();
		m1.addPoint(point);
		System.out.println("Point:"+m1.getPoint());
		
		System.out.println("No:"+m2.getNo());
		System.out.println("Name:"+m2.getName());
		System.out.print("Add Point-->");
		point=sc.nextInt();
		m2.addPoint(point);
		System.out.println("Point:"+m2.getPoint());
		
		System.out.println("No:"+m1.getNo());
		System.out.println("Name:"+m1.getName());
		System.out.print("Use Point-->");
		point=sc.nextInt();
		m1.usePoint(point);
		if(m1.usePoint(point)!=-1) {
		System.out.println("Point:"+m1.getPoint());
		}else {
			System.out.println("ERROR! Point:"+m1.getPoint());
		}
		
		System.out.println("No:"+m2.getNo());
		System.out.println("Name:"+m2.getName());
		System.out.print("Use Point-->");
		point=sc.nextInt();
		m2.usePoint(point);
		if(m2.usePoint(point)!=-1) {
			System.out.println("Point:"+m2.getPoint());
			}else {
			System.out.println("ERROR! Point:"+m2.getPoint());
			}
		sc.close();
		
	}

}
