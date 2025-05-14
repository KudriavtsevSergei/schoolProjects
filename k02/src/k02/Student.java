package k02;

public class Student {
 private String number="24JN0";
 private String name;
 private int score;
 
 private static int counter=101;
 
 Student(String name, int score){
	 this.name=name;
	 this.score=score;
	 this.number="22JN0"+counter;
	 counter++;
 }
 
 String getNumber() {
		return number;
 }
 String getName() {
		return name;
	}
 int getScore() {
		return score;
 }
	static int getCount() {
		return counter;
}
	String getGrade() {
		String grade=null;
		if(score<60) {
			grade="D";
		return grade;
		}else if(score<70) {
			grade="C";
		return grade;
		}else if(score<80) {
			grade="B";
		return grade;
		}else if(score<90) {
			grade="A";
		return grade;
		}else {
			grade="S";
		return grade;
		}
	}
	static int getCounter() {
		return counter;
	}
}
