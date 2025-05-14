package k10;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("User1 No-->");
		int no=sc.nextInt();
		System.out.print("User1 Name-->");
		String name=sc.next();
		
		User u1=new User(no,name);
		
		System.out.print("User2 No-->");
		 no=sc.nextInt();
		System.out.print("User2 Name-->");
		name=sc.next();
		
		User u2=new User(no,name);
		
		if(u1.equals(u2)) {
			System.out.println("2つのUserは等しい");
		}else {
			if(u1.compareTo(u2)<0) {
				u1.print();
				u2.print();
			}else {
				u2.print();
				u1.print();
			}
		}

	}

}
