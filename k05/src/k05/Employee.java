package k05;

public class Employee {
	private String name;
	private String id;
	
	Employee(String name,String id) {
	this.name=name;
	this.id=id;
	}
	
	String getId() {
		return id;
	}
	String getName() {
		return name;
	}
}
