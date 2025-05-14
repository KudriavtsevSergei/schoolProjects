package k02;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Count:"+Person.getCount());
		
		System.out.print("name-->");
		String name=sc.next();
		
		System.out.print("age-->");
		int age=sc.nextInt();
		
		Person p1=new Person(name,age);
		
		System.out.print("name-->");
		name=sc.next();
		
		System.out.print("age-->");
		age=sc.nextInt();
		
		Person p2=new Person(name,age);
		
		System.out.print("name-->");
		name=sc.next();
		
		System.out.print("age-->");
		age=sc.nextInt();
		
		Person p3=new Person(name,age);
		
		System.out.println(p1.getName()+" "+p1.getAge());
		System.out.println(p2.getName()+" "+p2.getAge());
		System.out.println(p3.getName()+" "+p3.getAge());
		
		System.out.println("Count:"+Person.getCount());

	}

}
