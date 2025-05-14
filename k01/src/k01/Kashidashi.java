package k01;

public class Kashidashi {
	private String no;
	private String name;
	private String title;
	private int year;
	private int month;
	private int day;
	private boolean henkyaku;

	Kashidashi(String no, String name, String title, int year, int month, int day) {
		this.no = no;
		this.name = name;
		this.title = title;
		this.year = year;
		this.month = month;
		this.day = day;
		this.henkyaku = false;
	}

	String getNo() {
		return no;
	}

	String getName() {
		return name;
	}

	String getTitle() {
		return title;
	}

	void setHenkyaku(boolean henkyaku) {
		this.henkyaku = henkyaku;
	}

	String getKashidashiDate() {
		String date;
		date = year + "/" + month + "/" + day;
		return date;
	}

	void printKashidashi() {
		System.out.print(no + "\t" + name + "\t" + title + "\t" + getKashidashiDate() + "\t");
		if (henkyaku) {
			System.out.print("返却済");
		} else {
			System.out.print("貸出中");
		}
	}

}
