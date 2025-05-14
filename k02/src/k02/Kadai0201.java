package k02;

import java.util.Scanner;

public class Kadai0201 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("name-->");
		String name=sc.next();
		System.out.print("score-->");
		int score=sc.nextInt();
		
		Student s1=new Student(name, score);
		
		System.out.println(s1.getNumber()+"  "+s1.getName()+"  "+s1.getScore()+"  "+s1.getGrade());

		System.out.print("name-->");
		name=sc.next();
		System.out.print("score-->");
		score=sc.nextInt();
		
		Student s2=new Student(name, score);
		
		System.out.println(s2.getNumber()+"  "+s2.getName()+"  "+s2.getScore()+"  "+s2.getGrade());
		
		System.out.print("name-->");
		name=sc.next();
		System.out.print("score-->");
		score=sc.nextInt();
		
		Student s3=new Student(name, score);
		
		System.out.println(s3.getNumber()+"  "+s3.getName()+"  "+s3.getScore()+"  "+s3.getGrade());
		
		System.out.print("name-->");
		name=sc.next();
		System.out.print("score-->");
		score=sc.nextInt();
		
		Student s4=new Student(name, score);
		
		System.out.println(s4.getNumber()+"  "+s4.getName()+"  "+s4.getScore()+"  "+s4.getGrade());
		
		System.out.print("name-->");
		name=sc.next();
		System.out.print("score-->");
		score=sc.nextInt();
		
		Student s5=new Student(name, score);
		
		System.out.println(s5.getNumber()+"  "+s5.getName()+"  "+s5.getScore()+"  "+s5.getGrade());
		
		System.out.println(Student.getCounter());
	}

}
