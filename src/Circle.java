
public class Circle {

	public Circle(double radius) {

	}

	public static double getCircumference(int radius) {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}

	public String getFormattedCircumference() {
		double circumference = 0.00;
		return null;
	}

	public double getArea(double radius) {
		double area = Math.PI * (radius * radius);
		return area;
	}

	public String getFormattedArea() {
		double area = 0.00;
		return null;
	}

	private String formatNumber(double x) {
		return null;

	}

	public static int getObjectCount(String choice, int value) {
		if (choice != "n") {// counts the number of times user builds circle object
			value = value + 1;
		}
		return value;
	}

}// end public class Circle
