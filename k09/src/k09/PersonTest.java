package k09;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Name-->");
			String name=sc.next();
			
			System.out.print("Type-->");
			String type=sc.next();
			
			Person person=new Person(name,type);
			
			System.out.println("Name:"+person.getName());
			System.out.println("Type:"+person.getType());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
