package k02;

import java.util.Scanner;

public class Kadai0202 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("消費税率-->");
		double tax=sc.nextDouble();
		Shohin.setTax(tax);
		System.out.println();
		System.out.print("商品名--＞");
		String name=sc.next();
		
		System.out.print("税抜価格--＞");
		int price=sc.nextInt();
		System.out.println();
		Shohin sho1=new Shohin(name, price);
		
		System.out.print("商品名--＞");
		name=sc.next();
		
		System.out.print("税抜価格--＞");
		price=sc.nextInt();
		System.out.println();
		Shohin sho2=new Shohin(name, price);
		
		System.out.println("商品名:"+sho1.getName());
		System.out.println("税抜価格:"+sho1.getPrice());
		System.out.println("税込価格:"+sho1.getPriceIncludeTax());
		System.out.println();
		System.out.println("商品名:"+sho2.getName());
		System.out.println("税抜価格:"+sho2.getPrice());
		System.out.println("税込価格:"+sho2.getPriceIncludeTax());
		System.out.println();
		
		System.out.print("消費税率(現在"+Shohin.getTax()+")-->");
		tax=sc.nextDouble();
		Shohin.setTax(tax);
		System.out.println();
		System.out.println("商品名:"+sho1.getName());
		System.out.println("税抜価格:"+sho1.getPrice());
		System.out.println("税込価格:"+sho1.getPriceIncludeTax());
		System.out.println();
		System.out.println("商品名:"+sho2.getName());
		System.out.println("税抜価格:"+sho2.getPrice());
		System.out.println("税込価格:"+sho2.getPriceIncludeTax());
	}

}
