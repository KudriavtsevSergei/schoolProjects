package k04;

import java.text.NumberFormat;
import java.util.Locale;

public class Salary {
	private String number;
	private String name;
	private int academic;
	private int exYear;
	private int overTime;
	private static int[] baseSalaryTable = { 231000, 212000, 187000, 165000 };
	private static int baseOverTimePay = 1200;
	private int score;

	Salary(String number, String name, int academic, int exYear, int overTime) {
		this.number = number;
		this.name = name;
		this.academic = academic;
		this.exYear = exYear;
		this.overTime = overTime;
	}

	NumberFormat jpyFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);

	String getNumber() {
		return number;
	}

	String getName() {
		return name;
	}

	int getScore() {
		score = getBaseSalary() + getOverTimePay();
		return score;
	}

	int getBaseSalary() {
		int kihon = (int) (baseSalaryTable[academic] + (baseSalaryTable[academic] * 0.02) * exYear);
		return kihon;
	}

	int getOverTimePay() {
		int zangyo = overTime * baseOverTimePay;
		return zangyo;
	}

	void printPaySlip() {
		System.out.println("給与明細");
		System.out.println(" Number:" + getNumber());
		System.out.println(" Name:" + getName());
		System.out.println(" BaseSalary:" + jpyFormat.format(getBaseSalary()));
		System.out.println(" OverTimePay:" + jpyFormat.format(getOverTimePay()));
		System.out.println(" (OverTime:" + overTime + "H, BaseOverTimePay:" + jpyFormat.format(Salary.baseOverTimePay));
		System.out.println(" Total:" + jpyFormat.format(getScore()));
	}

	static int getBaseSalary(int academic) {
		return baseSalaryTable[academic];
	}

	static int getBaseOverTimePay() {
		return baseOverTimePay;
	}

}
