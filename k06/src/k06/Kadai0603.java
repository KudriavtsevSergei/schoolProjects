package k06;

import java.util.Scanner;

public class Kadai0603 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[3];
		
		for(int i=0;i<e.length;i++) {
			System.out.print("FE:FullTimeWorker  PE:PartTimeWorker-->");
			String type = sc.next();
			if (type.equals("FE")) {
				System.out.print("Number-->");
				String number=sc.next();
				System.out.print("Name-->");
				String name=sc.next();
				System.out.print("Base Salary-->");
				int salary=sc.nextInt();
				System.out.print("Over Time-->");
				double overTime=sc.nextDouble();
				e[i]=new FullTimeWorker(number,name,salary,overTime);
			} else if (type.equals("PE")) {
				System.out.print("Number-->");
				String number=sc.next();
				System.out.print("Name-->");
				String name=sc.next();
				System.out.print("Time Salary-->");
				int salary=sc.nextInt();
				System.out.print("Work Time-->");
				double workTime=sc.nextDouble();
				e[i]=new PartTimeWorker(number,name,salary,workTime);
				
			}else {
				System.out.println("Error!");
			}
		}
		for(int i=0;i<e.length;i++) {
			System.out.println();
			e[i].printEmployee();
		}
		sc.close();
	}
}
