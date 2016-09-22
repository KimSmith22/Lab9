
//		import scanner;
import java.util.Scanner;

/**
 * @author Kimberli
 *this version of program is a first draft.  i use a standard outline which makes
 *building the program an easier (guided) process.  additional versions of the 
 *program will focus on including methods, and algorithms associated with 
 *program output
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

		// output and prompts;
		System.out.println("Welcome to the Circle Tester");
		System.out.println();

		do { // begin do-while loop
			System.out.println("Enter radius:  ");
			// identify scanner;
			Scanner k = new Scanner(System.in);
			 radius = k.nextInt();
			//input validation
			while(radius < 1) {// boolean to initiate validation loop
				System.out.println("Please enter a positive number.");
				radius = k.nextInt();
			}//end validation loop
			
			// program output and calculations;
			System.out.println("Circumference:  " + Circle.getCircumference(radius));
			//the above calls getCircumference Method
			System.out.println();//line space for visual appeal
			
			System.out.println("Area:  " + Circle.getArea(radius));//invokes getArea Method
			System.out.println();//line space for visual appeal
			
			// continue y/n
			k.nextLine();
			System.out.println("Continue? y/n");
			choice = k.nextLine();
		} while (choice.equals("y")); // end do-while loop
			
				System.out.println("Goodbye. You created " + Circle.getObjectCount(choice, value) + " Circle objects(s).");
				//the above calls getObjectCount Method (currently not incrementing)
				
			}// psvm

	}// end class


