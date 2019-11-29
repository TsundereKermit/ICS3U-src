import java.util.Scanner;

/* This application will ask the user to enter their name
 * and the year they were born.  It will display how old this
 * person will be in 2017
 * Author: Mr. Roller
 * Date: Feb 2nd, 2017
 */
public class KeyboardInput {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Type your name and press [Enter]: ");
		
		String name = console.nextLine(); //could use nextInt if expecting an int
										  //or nextDouble if expecting a double
        System.out.println("\nWelcome " + name);
	
        //use the user's year of birth to calculate and display how
        //old this person will be in 2018
        System.out.print("Please enter your year of birth: ");
        
        int yearOfBirth = console.nextInt();
        
        System.out.println("In 2018 you will be " + (2018-yearOfBirth) + " years old.");
        
	} //end main method

}  //end class