package k01;

import java.util.Scanner;

public class Kadai0103 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("電話番号--＞");
		String number=sc.next();
		System.out.print("名義--＞");
		String name=sc.next();
		System.out.print("基本料金--＞");
		int baseCharge=sc.nextInt();
		System.out.print("１分当たりの通話料金--＞");
		int freeTrafic=sc.nextInt();
		System.out.print("無料通信量（GB）--＞");
		int freeTraffic=sc.nextInt();
		System.out.print("無料分超過の１ＧＢ当たりの通信料金--＞");
		int unitComCharge=sc.nextInt();
		
		Cellphone phone = new Cellphone(number, name, baseCharge, freeTrafic, freeTraffic, unitComCharge);
		
		System.out.println();
		System.out.println("電話番号--＞"+phone.getNumber());
		System.out.println("名義--＞"+phone.getName());
		System.out.println("基本料金--＞"+phone.getBaseCharge());
		System.out.println("１分当たりの通話料金--＞"+phone.getUnitCallCharge());
		System.out.println("無料通信量（GB）--＞"+phone.getFreeTraffic());
		System.out.println("無料分超過の１ＧＢ当たりの通信料金--＞"+phone.getUnitComCharge());
		
		System.out.println();
		
		System.out.println("メニュー選択");
		System.out.println("1：通話");
		System.out.println("2：通信");
		System.out.println("9：終了");
		System.out.println("選択-->");
		int sentaku = sc.nextInt(); 
		while (sentaku != 9) { 
		    if (sentaku == 1) {
		        System.out.println("通話時間-->");
		        int airtime = sc.nextInt();
		        phone.addAirtime(airtime); 
		    } else if (sentaku == 2) {
		        System.out.println("通信量-->");
		        double traffic = sc.nextDouble();
		        phone.addTraffic(traffic);
		    } else {
		        System.out.println("unknown command");
		    }
		    System.out.println("選択-->");
		    sentaku = sc.nextInt();
		}
		phone.printAccount();
		}
	}
