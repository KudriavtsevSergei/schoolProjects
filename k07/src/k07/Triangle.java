package k07;

public class Triangle implements Figure {
	private double bottom;
	private double height;

	Triangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}

	@Override
	public double getArea() {
		double area = (bottom * height) / 2;
		return area;
	}

}
