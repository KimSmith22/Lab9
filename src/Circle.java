
public class Circle {
	public double radius;
	
	public Circle(double r) {
		radius = r;
	}

	public double getCircumference() {
		double circumference = 2 * Math.PI *this.radius;
		return circumference;
	}

	public String getFormattedCircumference() {
		String formatNum = String.format("%10.2f%n",getCircumference());
		return formatNum;
	}

	public  double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}

	public String getFormattedArea() {
		String formatNum = String.format("%10.2f%n", getArea());
		return formatNum;
	}

	private String formatNumber(double x) {
		String formatNum = String.format("%10.2f%n", radius);
		return formatNum;

	}

	public static int getObjectCount(String choice, int value) {
		if (choice.equals("y")) {// counts the number of times user builds circle object
			value = value + 1;
		}
		return value;
	}

}// end public class Circle
