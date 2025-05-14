package k10;

public class Kadai1002 {

	public static void main(String[] args) {
		
		Goods[]goods={
			new Goods("NotePC-13.3",180000),
			new Goods("Cleaner",35000),
			new Goods("Washer",120000),
			new Goods("Microwawe",72000),
			new Goods("Television",50000),
		};
		
		for(int i=0;i<goods.length-1;i++) {
			int min=i;
			for(int j=i+1;j<goods.length;j++) {
				if(goods[j].compareTo(goods[min])<0) {
					min=j;
				}
			}
			if(min!=i) {
				Goods tmp=goods[i];
				goods[i]=goods[min];
				goods[min]=tmp;
			}
		}
		for(int i=0;i<goods.length;i++) {
		goods[i].print();
	}
}
}
