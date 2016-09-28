
//		import scanner;
import java.util.Scanner;

/**
 * @author Kimberli
 */
// declare class
public class CircleApp {

	/**
	 * @param args
	 */
	// declare method {
	public static void main(String[] args) {
		
		// declare variables;
		double area;
		int radius;
		String choice = "y";
		int value = 0;
		boolean createObject = true;

		// output and prompts;
		System.out.println("Welcome to the Circle Tester");
		System.out.println();

		while (createObject) {// boolean loop
			System.out.println("Enter radius:  ");
			// identify scanner;
			Scanner k = new Scanner(System.in);
			radius = k.nextInt();
			//Create new object with the radius variable
			Circle c = new Circle(radius);
			// input validation
			while (radius < 1) {// boolean to initiate validation loop
				System.out.println("Please enter a positive number.");
				radius = k.nextInt();
			} // end validation loop

			// program output and calculations;
			System.out.format("Circumference:  " + c.getFormattedCircumference());
			// the above calls getCircumference Method
			System.out.println();// line space for visual appeal

			System.out.format("Area:  " + c.getFormattedArea());// invokes
																	// getArea
																	// Method
			System.out.println();// line space for visual appeal

			// continue y/n
			k.nextLine();
			System.out.println("Continue? y/n");
			choice = k.nextLine();

			if (choice.equals("y")) {
				createObject = true;
				value+=1;
			} else {
				createObject = false;
				System.out.println("Goodbye. You created " + (value +1)  + " Circle objects(s).");
				// the above calls getObjectCount Method (currently not
				// incrementing)
			} // ends if/else

		} // end boolean loop
	}// psvm

}// end class
