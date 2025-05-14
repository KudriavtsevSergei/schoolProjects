package k06;

public class Employee {
private String number;
private String name;
private int salary;
Employee(String number, String name, int salary){
	this.number=number;
	this.name=name;
	this.salary=salary;
}
int getSalary() {
return salary;
}
void printEmployee() {
	System.out.println("Number:"+number);
	System.out.println("Name:"+name);
}
}
