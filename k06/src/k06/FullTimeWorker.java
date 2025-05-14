package k06;

public class FullTimeWorker extends Employee {
	private static int baseOverTimePay=2400;
	private double overTime;
FullTimeWorker(String number, String name, int salary,double overTime) {
		super(number, name, salary);
		this.overTime=overTime;
	}
public void printEmployee() {
	super.printEmployee();
	System.out.println("Base Salary:"+getSalary());
	System.out.println("Over Time:"+overTime);
	System.out.println("Base Over Time Pay:"+baseOverTimePay);
	System.out.println("Total Salary:"+(getSalary()+(baseOverTimePay*overTime)));
}
public void setBaseOverTimePay(int baseOverTimePay) {
	FullTimeWorker.baseOverTimePay=baseOverTimePay;
}
}

