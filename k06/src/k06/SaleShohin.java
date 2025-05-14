package k06;

public class SaleShohin extends Shohin {
	private double discountRate;

	SaleShohin(String no, String name, int price, double discountRate) {
		super(no, name, price);
		this.discountRate = discountRate;
	}

	void printShohin() {
		super.printShohin();
		System.out.println("Discount Rate:" + discountRate);
		System.out.println("Discount Price:" + getPrice());
	}

	@Override
	int getPrice() {
		int discountPrice = (int) (super.getPrice() * (1 - discountRate));
		return discountPrice;

	}
}
