package k06;

public class Shohin {
	private String no;
	private String name;
	private int price;

	Shohin(String no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	void printShohin() {
		System.out.println("No:" + no);
		System.out.println("Name:" + name);
		System.out.println("Price:" + price);
	}
}
