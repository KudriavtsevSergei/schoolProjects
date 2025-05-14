package k07;

public class Circle implements Figure {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = Math.pow(radius, 2) * 3.14;
		return area;
	}

}
