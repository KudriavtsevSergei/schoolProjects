package k01;

public class Sale {
	private int[] no = { 1, 2, 4, 5, 8, 9, 10, 12, 13, 14 };
	private int[] price = { 230, 315, 198, 520, 450, 180, 320, 760, 500, 250 };
	private int[] num = new int[10];

	Sale() {
		for (int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
	}

	int[] getNo() {
		int[] no2 = new int[no.length];
		for (int i = 0; i < no2.length; i++) {
			no2[i] = no[i];
		}
		return no2;
	}

	int addNum(int no, int num) {
		int i = 0;
		while (i < this.no.length && this.no[i] != no) {
			i++;
		}
		int ret = -1;
		if (i < this.no.length) {
			this.num[i] += num;
		}
		return ret;
	}

	int[] getSales() {
		int[] sales = new int[no.length];
		for (int i = 0; i < no.length; i++) {
			sales[i] = this.num[i] * price[i];
		}
		return sales;
	}
}