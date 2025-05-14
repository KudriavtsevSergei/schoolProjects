package k05;

public class BankBase {
	private String number;
	private String name;
	private int money;

	BankBase(String number, String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
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

	void depositMoney(int money) {
		this.money += money;
	}

	int paymentMoney(int money) {
		if (this.money < money) {
			return -1;
		} else {
			this.money -= money;
			return this.money;
		}

	}
}