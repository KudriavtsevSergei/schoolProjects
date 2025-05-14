package k06;

public class Student extends Person {
	private String no;
	private int score;
Student(String no, String name, String type,int score){
	super(name,type);
	this.no=no;
	this.score=score;
}
 @Override
 void print() {
	 System.out.println("No:"+no);
	 super.print();
	 System.out.println("Score:"+score);
	 System.out.println("Result:"+getResult());
 }
 String getResult() {
	 String result;
		 if(score>=60) {
			 result="合格";
		 }else {
			 result="不合格";
		 }
		 return result;
 }
 
}
