package k05;

public class Engineer extends Employee{
	private String projectName;
	Engineer(String name, String id,String projectName) {
		super(name, id);
		this.projectName=projectName;
	}
	Engineer(String name, String id) {
		super(name, id);
	}
	void setProjectName(String projectName) {
		this.projectName=projectName;
	}
	void printEngineer() {
		System.out.println("Id:"+this.getId());
		System.out.println("Name:"+this.getName());
		System.out.println("Project Name:"+projectName);
	}
}
