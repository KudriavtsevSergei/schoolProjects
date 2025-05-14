package k09;

public class Person {
	private String name;
	private String type;
	
	Person(String name,String type) throws Exception{
		this.name=name;
		if("male".equals(type) || "female".equals(type)){
			this.type=type;
		}else {
			throw new Exception("Type Error");
		}
	}
	String getName() {
		return name;
	}
	String getType() {
		return type;
	}
}
