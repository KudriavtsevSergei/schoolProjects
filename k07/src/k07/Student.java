package k07;

public class Student extends Person {
		Student(String name,String type){
			super(name,type);
		}
		@Override
		void out() {
			System.out.println("Out: School");
		}
}
