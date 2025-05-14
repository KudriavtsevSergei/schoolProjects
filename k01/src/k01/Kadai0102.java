package k01;

import java.util.Scanner;

public class Kadai0102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sale sale = new Sale();
		int[] no = sale.getNo();
		for (int i = 0; i < no.length; i++) {
			System.out.print("No:" + no[i] + "  " + "num-->");
			int num = sc.nextInt();
			sale.addNum(no[i], num);
		}
		int[] sales = sale.getSales();
		for (int i = 0; i < sales.length; i++) {
			int max = i;
			for (int j = i + 1; j < sales.length; j++) {
				if (sales[j] > sales[max]) {
					max = j;
				}
			}
			if (max != i) {
				int tmp = sales[i];
				sales[i] = sales[max];
				sales[max] = tmp;
				int tmp2 = no[i];
				no[i] = no[max];
				no[max] = tmp2;
			}
		}
		for (int i = 0; i < sales.length; i++) {
			System.out.println("No:" + no[i] + "   " + sales[i]);
		}
		for (int i = 0; i < no.length; i++) {
			int max = i;
			for (int j = i + 1; j < sales.length; j++) {
				if (no[j] < no[max]) {
					max = j;
				}
			}
			if (max != i) {
				int tmp = sales[i];
				sales[i] = sales[max];
				sales[max] = tmp;
				int tmp2 = no[i];
				no[i] = no[max];
				no[max] = tmp2;
			}
		}
		for (int i = 0; i < sales.length; i++) {
			System.out.println("No:" + no[i] + "   " + sales[i]);
		}
	}
}