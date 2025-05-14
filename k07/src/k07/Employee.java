package k07;

public class Employee extends Person {

	Employee(String name, String type) {
		super(name, type);
	}
	@Override
	void out() {
		System.out.println("Out:Company");
	}
}
