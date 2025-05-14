package k04;

public class BankAccount {
	private String number;
	private String name;
	private int money;
	private static double rate;
	private static int counter = 1001;

	BankAccount(String name, int money) {
		this.name = name;
		this.money = money;
		this.number = "F" + counter;
		counter += 10;
	}

	String getNumber() {
		return number;
	}

	String getName() {
		return name;
	}

	int getMoney() {
		return money;
	}

	public void addInterest() {
		money += (int) (money * BankAccount.getRate() / 100);
	}

	public static void setRate(double rate) {
		BankAccount.rate = rate;
	}

	public static double getRate() {
		return rate;
	}
}
