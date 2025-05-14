package k04;

public class Buy {
private int buyNo;
private String buyDate;
private String shohinNo;
private int price;
private int num;

Buy(int buyNo,String buyDate, String shohinNo, int price,int num){
	this.buyNo=buyNo;
	this. buyDate= buyDate;
	this.shohinNo=shohinNo;
	this.price=price;
	this.num=num;
}

int getPrice() {
	return price;
}
int getNum() {
	return num;
}
void printBuyData() {
        System.out.println("Buy Date --> " + buyDate);
        System.out.println("Shohin No --> " + shohinNo);
        System.out.println("Price --> " + price);
        System.out.println("Num --> " + num);
        System.out.println();
}

String getBuyDate() {
	return buyDate;
}

public String  getShohinNo() {
	return shohinNo;
}

public int getBuyNo() {
	return buyNo;
}

}
