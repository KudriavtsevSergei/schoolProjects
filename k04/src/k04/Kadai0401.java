package k04;

import java.util.Scanner;

public class Kadai0401 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]osmei= {"Android","IOS","BlackBerry","FirefoxOS","Ubuntu"};
		
		System.out.print("Index(-1:End)-->");
		int index=sc.nextInt();
		while(index!=-1) {
		if(index>=0&&index<osmei.length) {
			System.out.println("OS Name:"+osmei[index]);
		}else {
			System.out.println("Index Error!");
		}
		System.out.print("Index(-1:End)-->");
		index=sc.nextInt();
		}
		sc.close();
	}
}
