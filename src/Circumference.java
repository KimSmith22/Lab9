
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
public class Circumference {

	/**
	 * @param args
	 */
	// declare method {
	public static void main(String[] args) {

		// declare variables;
		String choice = "y";
		String value = null;

		// output and prompts;
		System.out.println("Welcome to the Circle Tester");
		System.out.println();

		do { // begin do-while loop
			System.out.println("Enter radius:  ");
			// identify scanner;
			Scanner k = new Scanner(System.in);
			int radius = k.nextInt();
			//input validation
			while(radius < 1) {// boolean to initiate validation loop
				System.out.println("Please enter a positive number.");
				radius = k.nextInt();
			}//end validation loop
			// program output and calculations;

			// continue y/n
			k.nextLine();
			System.out.println("Continue? y/n");
			choice = k.nextLine();
		} while (choice.equals("y")); // end do-while loop
			if(choice != "n" ){//counts the number of times user builds circle object
				value = value + 1;
			}//ends circle object count
			if(choice.equals("n")){
				System.out.println("Goodbye. You created " + value + " Circle objects(s).");
			}// ends if statement

	}// psvm

}// end class
