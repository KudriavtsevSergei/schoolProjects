package k03;

public class Seiseki {
	private String no;
	private String name;
	private double score;

	public Seiseki(String csvStr) {
		String[] data = csvStr.split(",");
		this.no = data[0];
		this.name = data[1];
		double total = 0;
		for (int i = 2; i < data.length; i++) {
			total += Double.parseDouble(data[i]);
		}
		this.score = total / (data.length - 2);
	}

	public String getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	public String getGrade(int passScore) {
		if (score >= passScore) {
			return "合格";
		} else {
			return "不合格";
		}
	}
}