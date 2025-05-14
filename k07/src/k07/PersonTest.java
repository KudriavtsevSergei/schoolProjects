package k07;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Name-->");
		String name=sc.next();
		System.out.print("Type-->");
		String type=sc.next();
		
		Person person1=new Student(name,type);
		
		System.out.print("Name-->");
		name=sc.next();
		System.out.print("Type-->");
		type=sc.next();
		
		Person person2=new Employee(name,type);
		
		System.out.println();
		System.out.println(person1.getName());
		System.out.println(person1.getType());
		person1.out();
		
		System.out.println();
		System.out.println(person2.getName());
		System.out.println(person2.getType());
		person2.out();
	}

}
