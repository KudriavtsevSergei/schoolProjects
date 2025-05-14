package k06;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		System.out.print("No-->");
		String no=sc.next();
		
		System.out.print("Name-->");
		String name=sc.next();
		
		System.out.print("Type-->");
		String type=sc.next();
		
		System.out.print("Score-->");
		int score=sc.nextInt();
		
		Student student=new Student(no, name,type,score);
		
		System.out.println();
		student.print();
		sc.close();
	}

}
