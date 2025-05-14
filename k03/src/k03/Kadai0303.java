package k03;

import java.util.Scanner;

public class Kadai0303 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		System.out.print("文字列-->");
		String base = sc.next();
		sb.append(base);

		System.out.println("現在の文字列:" + sb.toString());

		System.out.print("消去する文字列-->");
		String del = sc.next();
		int length = del.length();
		int length2 = base.length();
		sb.delete(length2 - length, length2 + length);
		System.out.println("現在の文字列:" + sb.toString());
		
		System.out.println();

		System.out.print("追加する文字列-->");
		String plus = sc.next();
		sb.append(plus);
		System.out.println("現在の文字列:" + sb.toString());
		
		System.out.println();
		
		System.out.print("変更する文字列-->");
		String change = sc.next();
		System.out.print("新しい文字列-->");
		String change2 = sc.next();
		int idx = sb.indexOf(change);
		int length3 = change.length();
		sb.replace(idx, idx + length3, change2);
		
		System.out.println();
		
		System.out.println("現在の文字列:" + sb.toString());
		System.out.print("Length:" + sb.toString().length());
	}

}
