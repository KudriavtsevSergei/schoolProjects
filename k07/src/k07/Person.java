package k07;

public abstract class Person {
		private String name;
		private String type;
		
		Person(String name,String type){
			this.name=name;
			this.type=type;
		}
		
		String getName() {
			return name;
		}
		String getType() {
			return type;
		}
		abstract void out();
}

