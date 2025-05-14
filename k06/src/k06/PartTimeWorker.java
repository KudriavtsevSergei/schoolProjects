package k06;

public class PartTimeWorker extends Employee {
		private double workTime;
	PartTimeWorker(String number, String name, int salary,double workTime) {
		super(number, name, salary);
		this.workTime=workTime;
	}
	@Override
	public int getSalary() {
	    int salary = (int)(super.getSalary() * workTime);
	    return salary;
	}
	
	public void printEmployee() {
		super.printEmployee();
		System.out.println("Time Salary:"+super.getSalary());
		System.out.println("Work Time:" + workTime);
		System.out.println("Total Salary:"+getSalary());
		
	}

}
