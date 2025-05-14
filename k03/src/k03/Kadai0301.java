package k03;

import java.util.Scanner;

public class Kadai0301 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Num1-->");
		int num1 = sc.nextInt();
		System.out.print("Num2-->");
		int num2 = sc.nextInt();
		
		System.out.println();
		System.out.print("Command(tasu/hiku/kakeru/waru/end)-->");
		String command = sc.next();
	
		while (!command.equals("end")) {
			if (command.equals("tasu")) {
				System.out.println("Result:" +  (num1 + num2));
			} else if (command.equals("waru")) {
				System.out.println("Result:" +  (num1 / num2));
			} else if (command.equals("kakeru")) {
				System.out.println("Result:" +  (num1 * num2));
			} else if (command.equals("hiku")) {
				System.out.println("Result:" +  (num1 - num2));
			} else {
				System.out.println("Command Error");
			}
			System.out.println();
			System.out.print("Command(tasu/hiku/kakeru/waru/end)-->");
			command = sc.next();
		
		}
	}

}
