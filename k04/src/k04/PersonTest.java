package k04;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		Person[]person=new Person[4];
		for(int i =0; i<person.length;i++) {
			System.out.print("Name-->");
			String name=sc.next();
			System.out.print("Age-->");
			int age=sc.nextInt();
			
			person[i]=new Person(name,age);
			
		}
		System.out.println();
		for(int i=0; i <person.length;i++) {
			System.out.println(person[i].getName()+"  "+person[i].getAge());
		}
		sc.close();
	}

}
