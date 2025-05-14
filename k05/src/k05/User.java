package k05;

public class User {
	private static int seqNo = 1001;
	private int no;
	private String name;

	User(String name) {
		no = seqNo;
		seqNo++;
		this.name = name;
	}

	int getNo() {
		return no;
	}

	String getName() {
		return name;
	}
}
