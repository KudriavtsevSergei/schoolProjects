package k10;

public class Goods implements Comparable<Goods> {
	private String goodsName;
	private int price;
	
	Goods(String goodsName, int price){
		this.goodsName=goodsName;
		this.price=price;
	}
	
	void print() {
		System.out.println(goodsName+"\t"+price);
	}
	@Override
	public int compareTo(Goods o) {
			return price-o.price;
		}
}

