package k03;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		System.out.print("String1-->");
		String str1=sc.next();
		System.out.print("String2-->");
		String str2=sc.next();
		
		if(str1.equals(str2)) {
			System.out.println("二つの文字列は等しい");
		}else {
			System.out.println("二つの文字列は異なる");
			System.out.print("辞書順に表示：");
			if(str1.compareTo(str2)<0) {
				System.out.println(str1+" "+str2);
			}else {
				System.out.println(str2+" "+str1);
			}
		}
	}

}
