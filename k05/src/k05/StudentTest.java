package k05;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		
		System.out.print("Number-->");
		String number=sc.next();
		
		System.out.print("Name-->");
		String name=sc.next();
		
		System.out.print("Type-->");
		String type=sc.next();
		
		System.out.print("Score-->");
		int score=sc.nextInt();
		
		st.setNumber(number);
		st.setName(name);
		st.setType(type);
		st.setScore(score);
		
		System.out.println("Number:"+st.getNumber());
		System.out.println("Name:"+st.getName());
		System.out.println("Type:"+st.getType());
		System.out.println("Score:"+st.getScore());
		sc.close();
	}

}
