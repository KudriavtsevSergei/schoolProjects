package k09;

import java.util.Scanner;

public class Kadai0901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Score-->");
			int score = sc.nextInt();
			if (score < 0 || score > 100) {
				throw new Exception("Imput Error!! Score:" + score);
			} else if (score >= 60) {
				System.out.println("合格");
			} else {
				System.out.println("不合格");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
