import java.util.Scanner;

/**
 * Calculate someone's body mass index to indicate whether
 * or not that person is at a healthy body weight.
 *
 * @author  Ms Cianci
 * @since   Monday, September 15, 2008
 * 
 * edited by: Tony Jiang
 * Date: Oct. 10, 2018
 */
public class Exercise_105_TonyJ
{
	// constants used to represent the posible user's choices
	private static final int IMPERIAL_CHOICE = 1;
	private static final int METRIC_CHOICE = 2;	

	// create a Scanner object so that input can be obtained 
	// from within any method
	private static Scanner console = new Scanner(System.in);

	
	/** 
	 * Call on appropriate methods to get input from the user so that the
	 * corresponding BMI can be calculated and displayed
	 */
	public static void main(String[] args) 
	{			
		// display title
		System.out.println("\nHOW HEALTHY ARE YOU?");
		
		int choice = getChoice();
			
		int weight = getWeight(choice);
		double height = getHeight(choice);
			
		int bmi = getBMI(weight, height, choice);
			
		System.out.println("\n\nThe corresponding BMI is " + bmi + ".");
			
		displayHealthMessage(bmi);
			
	} // end main
	
	
	/**
	 * Ask the user to enter one for imperial and two for metric.
	 * Continue to ask the user to enter one or two if they enter 	 
	 * any other numeric value.
 	 */
	public static int getChoice() 
	{
            int userInput=0;
            do
		{
			System.out.println("Please enter 1 for imperial and 2 for metric: ");
			while (!console.hasNextInt())
			{
				
				System.out.println("Invalid input, please enter either 1 or 2: ");
				console.nextLine();  //Gets rid of anything in the buffer by flushing it
			}
			userInput = console.nextInt();
                        console.nextLine();  //Flush out the LF in case Scanner is used for string input in the future
		} while (!(userInput== 1) && !(userInput == 2));

            return userInput;
	}
	
	
	/**
	 * Get the user's weight (from the console) in either pounds or kgs and return the input.
	 * @param c Represents either imperial or metric units
	 * @return  The weight entered by the user (either in pounds or kilograms)
	 * NOTE: THIS METHOD HAS BEEN COMPLETED FOR YOU! JUST READ AND UNDERSTAND IT...
	 */
	public static int getWeight(int c) 
	{
		int w = -1;			// initial with a "default value"
		
		if(c == IMPERIAL_CHOICE)
		{
			// get weight in pounds
			System.out.print("\nEnter weight in pounds: \t\t");
			String temp = console.next();
			w = Integer.parseInt(temp);
		}
		
		else if(c == METRIC_CHOICE)
		{
			// get weight in kilograms
			System.out.print("\nEnter weight in kilograms: \t\t\t\t");
			String temp = console.next();
			w = Integer.parseInt(temp);
		}
		
		return w;
	} // end getWeight method

	
	/**
	 * Get the user's height (from the console) in either feet and inches or in meters and 
	 * return the height (in either inches or meters)
	 * @param c The user's choice, (representing either imperial or metric)
	 * @return The height entered by the user (either in inches or meters)
	 */
	public static double getHeight(int c)
	{
		double h = 0;
		
		if(c == IMPERIAL_CHOICE)
		{
			// get height in feet and inches
                        System.out.println("Please enter your height in feet and inches "
                                + "separated by a space: ");
			double feet = console.nextDouble();
                        double inch = console.nextDouble();
			// calculate corresponding height in inches only and store in h			
			h+=feet*12+inch;
                        console.nextLine(); //flushes LF
		}
		
		else if(c == METRIC_CHOICE)
		{
			// get height in meters
			System.out.println("Please enter your height in meters: ");
			double meters = console.nextDouble();
                        h+=meters;
                        console.nextLine(); //flushes LF
		}
		
		return h;
	} // end getheight method
	

	/**
	 * @param w  The weight (in pounds or kilograms)
	 * @param h  The height (in inches or meters)
	 * @param c  The user's choice, (representing either imperial or metric)
	 * @return   The corresponding BMI
	 * NOTE: THIS METHOD HAS BEEN COMPLETED FOR YOU. YOU NEED TO READ AND UNDERSTAND IT.
	 */
	public static int getBMI(int w, double h, int c)
	{
		// if the user chose imperial then bmi = 703 x weight in pounds / height in inches squared
		if(c == IMPERIAL_CHOICE)
			return (int)(w * 703 / (h * h));
		
		// if the user chose metric then bmi = weight in kilograms / height in meters squared
		else if(c == METRIC_CHOICE)
			return (int)(w / (h * h));
		
		return -1;			// this should "never" be reached but the method always needs to return something
	} // end getBMI method
	
	
	/**
	 * Display a message describing a person's health with the given BMI
	 * @param bmi Someone's body mass index
	 * NOTE: THIS METHOD HAS BEEN COMPLETED FOR YOU. YOU NEED TO READ AND UNDERSTAND IT.
	 */
	public static void displayHealthMessage(int bmi)
	{
			// display a message describing if this is a healthy weight
			if(bmi < 18.5)
				System.out.println("This person is underweight.\n\n");
                        else if(bmi < 24.9)
				System.out.println("This person is at a normal weight.\n\n");
			else if(bmi < 29.9)
				System.out.println("This person is overweight.\n\n");
			else
				System.out.println("This person is obese.\n\n");
	
	} // end displayHealthMessage method		
		
} // end class