package k06;

public class Person {
	private String name;
	private String type;
	
	Person(String name, String type){
		this.name=name;
		this.type=type;
	}
	void print() {
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
	}
}
