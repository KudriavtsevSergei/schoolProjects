package k02;

public class BankAccount {
private String number;
private String name;
private int money;
private static double rate; 
static int counter=1001;

BankAccount(String name, int money){
	this.name=name;
	this.money=money;
	this.number="F"+counter;
	counter++;
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

void addInterest() {
	money=(int) (money+((money*rate)/100));
}

static void setRate(double rate) {
	BankAccount.rate=rate;
}
static double getRate() {
return rate;
}



}
