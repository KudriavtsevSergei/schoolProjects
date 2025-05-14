package k02;

public class Person {
private String name;
private int age;

private static int count;
Person(String name, int age){
	this.name=name;
	this.age=age;
	count++;
}
String getName() {
	return name;
}
int getAge() {
	return age;
}
static int getCount() {
	return count;
}

}
