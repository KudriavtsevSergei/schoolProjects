package k05;

public class FBankAccount extends BankBase {
    private static double rate;  
    private static int counter = 1001;  


    FBankAccount(String name, int money) {
        super("F" + counter, name, money);
        counter+=10; 
    }
    public void addInterest() {
        int interest = (int) (getMoney() *rate / 100);
        depositMoney(interest);
        
    }

    	public static void setRate(double rate) {
    		FBankAccount.rate = rate;
    	}

    	public static double getRate() {
    		return rate;
    	}
    	
    }
