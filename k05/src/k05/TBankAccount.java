package k05;

public class TBankAccount extends BankBase {

    private static int currentYear;
    private static double rate;
    private static int counter = 1001; 

    private int due; 
    private int year; 

    public TBankAccount(String name, int money, int due) {
        super("T" + counter, name, money);
        this.due = due;
        this.year = currentYear;
        counter += 10;
    }

    public int getDue() {
        return due;
    }

    public int getYear() {
        return year;
    }

    public void addInterest() {
    	 int expirationYear = year + due; 
    	    if (currentYear >= expirationYear) { 
    	        int money = getMoney();
    	        double interest = money;
    	        for (int i = 0; i < (expirationYear - year); i++) { 
    	            interest *= (1 + rate); 
    	        }
    	        interest -= money; 
    	        depositMoney((int) interest); // 
    	    }
    	}

    public static void setRate(double rate) {
    	TBankAccount.rate = rate;
    }

    public static double getRate() {
        return rate;
    }

    public static void setCurrentYear(int year) {
    	TBankAccount.currentYear = year;
    }

    public static int getCurrentYear() {
        return currentYear;
    }
}