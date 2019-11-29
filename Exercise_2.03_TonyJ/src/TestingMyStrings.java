import java.util.Scanner;

/**
 * A console based user interface that can be used to call
 * upon and test each of the five methods written in the
 * MyStrings class.
 *
 * THIS CLASS SHOULD MOST DEFINATELY 
 *                NOT 
 * BE MODIFIED OR CHANGED IN ORDER
 * TO INTERACT WITH YOUR METHODS!!!
 *
 * You may only make improvements to this class AFTER you have it  
 * working together with your class and with each of your methods.
 *
 * @author 	Ms Cianci
 * @since	October 2006 (modified September 2008)
 */
public class TestingMyStrings
{
	private	Scanner s = new Scanner(System.in);
	
	
	/**
	 * Call on the constructor method to begin the program
	 * @param args Not used
	 */
	public static void main(String[] args)
	{
		new TestingMyStrings();
	} // end main


	/**
	 * Continue to ask the user what they would like to do
	 * and call upon the appropriate method as soon as they
	 * make a choice.
	 */
	public TestingMyStrings()
	{	
		System.out.println("WELCOME TO THE STRING MANIPULATION PROGRAM!\n\n");

		while(true)
		{		
			System.out.println("Please choose one of the following options:");
			System.out.print("   1.  Convert a date\n" +
							 "   2.  Convert a phone number\n" +
							 "   3.  Convert a name\n" +
							 "   4.  Reverse a word\n" +
							 "   5.  Check if two phrases are anagrams\n" +
							 "   6.  EXIT\n\n--->   ");
			try
			{
				int choice = Integer.parseInt(s.nextLine());
				
				switch(choice)
				{
					case 1:
						date();
						break;
					case 2:
						phoneNumber();
						break;
					case 3:
						name();
						break;
					case 4:
						reverse();
						break;
					case 5:
						areAnagrams();
						break;
					case 6:
						System.out.println("\n\n\nCiao!\n");
						System.exit(1);
						break;
					default:
						System.err.println("\nERROR: You did not make a valid entry.\n");
				} // end switch
			} // end try
			catch(NumberFormatException e)
			{
				System.out.println("\nERROR: You need to enter an integer.\n");
			} // end catch
		} // end while
		
	} // end UsingMyStrings constructor method


	/**
	 * Ask the user for a date and display it in a different format
	 */
	public void date()
	{
		System.out.print("\nPlease enter a date in the format mm/dd/yyyy:  ");
		String original = s.nextLine();
		System.out.println("\nYour date can also be written as " + MyStrings.convertDate(original) + "\n");
		
		s.nextLine();
	} // end method date
		
	
	/**
	 * Ask the user for a phone number and display only the digits of it
	 */
	public void phoneNumber()
	{
		System.out.print("\nPlease enter a phone number in the format (xxx)xxx-xxxx:  ");
		String number = s.nextLine();
		System.out.println("\nTo phone this number simply dial: " + MyStrings.convertPhoneNum(number) + "\n");
		
		s.nextLine();			
	} // end method phoneNumber
	
	
	/**
	 * Ask the user for their name and display it with the last name first
	 */
	public void name()
	{
		System.out.print("\nPlease enter a first name followed by a last name (separated with a space):  ");
		String name = s.nextLine();
		System.out.println("\nWritten with the last name first it becomes: " + MyStrings.convertName(name) + "\n");
		
		s.nextLine();		
	} // end method name
	
	
	/**
	 * Ask the user for a string and display it in reverse order
	 */
	public void reverse()
	{
		System.out.print("\nPlease enter any word of your choice:  ");
		String word = s.nextLine();
		System.out.println("\nWriting your word backwards yields: " + MyStrings.reverseString(word) + "\n");
		System.out.println("\nNOTE:  If this happens to be identical to the word you entered" +
						   "\n       then your word is called a PALINDROME!\n");
		s.nextLine();		
		
	} // end method reverse
		
	
	/**
	 * Ask the user for two strings and display whether or not they are anagrams
	 */
	public void areAnagrams()
	{
		System.out.print("\nPlease enter a phrase of your choice: ");
		String phrase1 = s.nextLine();
		System.out.print("\nPlease enter a second phrase of your choice: ");
		String phrase2 = s.nextLine();
		
		String not = " not ";
		
		// if the phrases truly are anagrams then the string variable should no longer store 
		// the word "not"
		if(MyStrings.areAnagrams(phrase1, phrase2))
			not = " ";
		
		System.out.println("The two phrases you entered are" + not + "anagrams.");
	} // end method areAnagrams
	
} // end class