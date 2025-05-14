package k05;

public class Member extends User {
	private int point;

	Member(String name) {
		super(name);
	}

	Member(String name, int point) {
		super(name);
		this.point = point;
	}

	int getPoint() {
		return point;
	}

	void addPoint(int point) {
		this.point += point;
	}

	int usePoint(int point) {
		if (this.point < point) {
			return -1;
		} else {
			this.point -= point;
			return this.point;
		}
	}
}