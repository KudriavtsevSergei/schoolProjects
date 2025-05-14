package k04;

public class Seiseki {
private String number;
private String name;
private int score;
private static int counter=0;

Seiseki(String number, String name, int score){
	this.number=number;
	this.name=name;
	this.score=score;
	counter++;
}
public static int getCounter() {
	return counter;
}
String getNumber() {
	return number;
}
String getName() {
	return name;
}
int getScore(){
	return score;
}


}
