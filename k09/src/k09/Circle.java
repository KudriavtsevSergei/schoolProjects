package k09;

public class Circle {

	double radius;

	double getArea(double radius) throws Exception {
		double area;
		if (radius >= 0) {
			area = Math.pow(radius, 2) * 3.14;
		} else {
			throw new Exception("Radius Error");
		}
		return area;
	}
}
