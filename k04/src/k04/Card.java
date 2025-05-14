package k04;

public class Card {
	private String no;       // カード番号
    private String name;     // 氏名
    private String tel;      // 電話番号
    private Buy[] buyData;   // 購入明細

    // コンストラクタ
    public Card(String no, String name, String tel, Buy[] buyData) {
        this.no = no;
        this.name = name;
        this.tel = tel;
        this.buyData = buyData;
    }

    // インスタンスメソッド
    public void printCardData() {
        System.out.println("Card No --> " + no);
        System.out.println("Name --> " + name);
        System.out.println("Tel --> " + tel);
        System.out.println("Buy Count --> " + buyData.length);
        System.out.println();

        int total = 0;
        for (Buy buy : buyData) {
            buy.printBuyData();
            total += buy.getPrice() * buy.getNum();
        }

        System.out.println("Card No : " + no);
        System.out.println("Name : " + name);
        System.out.println("Tel : " + tel);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-5s %-12s %-8s %-7s %-4s\n", "No", "Date", "ShohinNo", "Price", "Num");

        int count = 1;
        for (int i = 0; i < buyData.length; i++) {
            Buy buy = buyData[i]; 
            System.out.printf("%-5d %-12s %-8s %-7d %-4d\n", count++, buy.getBuyDate(), buy.getShohinNo(), buy.getPrice(), buy.getNum());
        }

        System.out.printf("%45s : %d\n", "Total", total);
    }
}

