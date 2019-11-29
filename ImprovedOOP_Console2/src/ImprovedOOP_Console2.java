/*
 * This program will allow the user to choose the class that they want
 * to interact with - the classes used are from the Object Oriented
 * Role Playing script.
 *
 * This class is a non-graphical interface that 
 * allows you to interact with objects of each
 * of the role playing classes that you have
 * written over the past week.
 *
 * Written by:	Helena Liu		Sept. 29, 2006
 * Modified by:	Miss Cianci		Oct. 2, 2006
 * 
 */
 import java.util.Scanner;
 
 public class ImprovedOOP_Console2
 {
 	private static Scanner console = new Scanner(System.in);
 	
 	// Using a global Acrobat new DirectorConsole();variable will allow the program to 
 	// count the total number of excerises that have been completed
 	private Acrobat jerry = new Acrobat();
 	private static Acrobat joe = new Acrobat();
 	
 	public static void main(String [] args)
 	{
 		new ImprovedOOP_Console2();
 	} //end main
 	
 	public ImprovedOOP_Console2()
 	{
 		System.out.println("Welcome!\n");
 		System.out.print("Type 1 to enter or 2 to exit\t");
 		String userInput = console.nextLine();
 		
 		while(userInput.equals("1"))
 		{
 			System.out.println("\n1. Acrobat");
	 		System.out.println("2. Bamboozler");
	 		System.out.println("3. Blackboard");
	 		System.out.println("4. Calculator");
	 		System.out.println("5. Decider");
	 		System.out.println("6. Dice");
	 		System.out.println("7. LazyCalculator");
	 		System.out.print("Enter 1 - 7 to choose:\t");
	 		String response = console.nextLine();
	 		int choice = Integer.parseInt(response); 
	 		
	 		System.out.println();		
	 		
	 		if(choice == 1)
	 			acrobat();
	 	
	 		else if(choice == 2)
	 			bamboozler();
	 	
	 		else if(choice == 3)
	 			blackboard();
	 	
	 		else if(choice == 4)
	 			calculator();
	 	
	 		else if(choice == 5)
	 			decider();
	 	
	 		else if(choice == 6)
	 			dice();
	 	
	 		else if(choice == 7)
	 			lazyCalculator();
	 		
	 		System.out.print("\n\nEnter 1 to enter again or 2 to exit\t");
 			userInput = console.nextLine();
	 		
 		}
 		
 		if(userInput.equals("2"))
 		{
 			System.out.println("\nGoodbye!\n");
 			System.exit(1);
 		}
 		
 	} // end UserInterface constructor method
 	
 	
 	// method:		acrobat
 	// description:	Called when the user chooses to interact with an Acrobat
 	public void acrobat()
 	{
 		System.out.print("Would you like to clap, kneebend or count?\t");
		String response = console.nextLine();
		response = response.toLowerCase();
		
		if(response.equals("count"))
		{
			System.out.println(jerry.count() + " exercises have been performed.");

		}
		else if(response.equals("clap"))
		{
			System.out.print("How many times would you like to clap?\t");
			int numTimes = Integer.parseInt(console.nextLine());
			
			System.out.println(jerry.clap(numTimes));
		}
		else if(response.equals("kneebend"))
		{
			System.out.print("How many times would you like to kneebend?\t");
			int numTimes = Integer.parseInt(console.nextLine());
		
			System.out.println(jerry.kneeBend(numTimes));
		}
		else
		{
			System.out.println("ERROR");
		}
		
 	} //end acrobat
 	
 	
	// method:		bamboozler
	// description:	Called when the user chooses to interact with a Bamboozler
 	public void bamboozler()
 	{
 		Bamboozler ann = new Bamboozler();
 		System.out.print("Would you like to add or subtract?\t");
 		String response = console.nextLine();
 		response = response.toLowerCase();
 		
 		System.out.print("Enter the first number that you would like to " + response + "\t");
 		String firstNum = console.nextLine();
 		int num1 = Integer.parseInt(firstNum);
 		System.out.print("Enter the second number that you would like to " + response + "\t");
 		String secondNum = console.nextLine();
 		int num2 = Integer.parseInt(secondNum);
 		
 		if(response.equals("add"))
 		{
 			System.out.println(num1 + " + " + num2 + " is " + ann.add(num1, num2));
 		}
 		else if(response.equals("subtract"))
 		{
 			System.out.println(num1 + " - " + num2 + " is " + ann.subtract(num1, num2));
 		}
 		else
 		{
 			System.out.print("ERROR");
 		}

 		
 	} // end bamboozler

 	// method:		blackboard
 	// description:	Called when the user chooses to interact with a Blackboard
 	public void blackboard()
 	{
 		Blackboard ann = new Blackboard();
 		System.out.print("Would you like to draw a square, circle or text?\t");
 		String response = console.nextLine();
 		response = response.toLowerCase();
 		
 		if(response.equals("square"))
 		{
 			System.out.println(ann.drawSquare());
 		}
 		else if(response.equals("circle"))
 		{
 			System.out.println(ann.drawCircle());
 		}
 		else if(response.equals("text"))
 		{
 			System.out.print("What text would you like to see?\t");
 			String text = console.nextLine();
 			System.out.println();
 			System.out.println(ann.drawText(text));
 		}
 		else
 		{
 			System.out.println("ERROR");
 		}
 	} // end blackboard
 	
 	
 	// method:		calculator
 	// description:	Called when the user chooses to interact with a Calculator
 	public void calculator()
 	{
 		Calculator ann = new Calculator();
 		System.out.print("Would you like to add, subtract or multiply?\t");
 		String response = console.nextLine();
 		response = response.toLowerCase();
 		
 		System.out.print("Enter the first number that you would like to " +response+ "\t");
 		String firstNum = console.nextLine();
 		int num1 = Integer.parseInt(firstNum);
 		System.out.print("Enter the second number that you would like to " +response+ "\t");
 		String secondNum = console.nextLine();
 		int num2 = Integer.parseInt(secondNum);
 		
 		if(response.equals("add"))
 		{
 			System.out.println(num1 + " + " + num2 + " is " + ann.add(num1, num2));
 		}
 		else if(response.equals("subtract"))
 		{
 			System.out.println(num1 + " - " + num2 + " is " + ann.subtract(num1, num2));
 		}
 		else
 		{
 			System.out.print("ERROR");
 		}
 	} //end calculator
 	

	// method:		decider
	// description:	Called when the user chooses to interact with a Decider
 	public void decider()
 	{
 		Decider ann = new Decider();
 		System.out.print("Would you like to 1. calculate the day of the week or 2. rate a person?\t");
 		String response = console.nextLine();
 		response = response.toLowerCase();
 		
 		if(response.equals("1"))
 		{
 			System.out.print("Enter the month (as a string)\t");
 			String month = console.nextLine();
 			
 			System.out.print("Enter the day\t");
 			String str = console.nextLine();
 			int date = Integer.parseInt(str);
 			
 			System.out.println("The day of week is: " + ann.dayOfWeek(month, date));
 		}
 		else if(response.equals("2"))
 		{
 			System.out.print("Enter the name of the person that you want to rate\t");
 			String name = console.nextLine();
 			
 			System.out.println(name + " - " + ann.rate(name));
 		}
 		else
 		{
 			System.out.print("ERROR");
 		}
 		
 	} //end decider
 	

	// method:		dice
	// description:	Called when the user chooses to interact with a Dice
 	public static void dice()
 	{
 		Dice ann = new Dice();
 		System.out.print("Roll? (yes or no)\t");
 		String response = console.nextLine();
 		
 		while(response.equals("yes") || response.equals("reset"))
 		{
 			if(response.equals("reset"))
 			{
 				ann.reset();
 				System.out.println("\nDie count has been reset to zero.\n");
 			}
 			else
 			{

 				joe.kneeBend(5);
 				System.out.println("Joe has done " + joe.count() + " kneebends!");
 				System.out.println("\nThe dice landed on " +ann.roll());
 				System.out.println("You have rolled " + ann.numRolls() + " times");
 			}
 			System.out.print("\nRoll again? (yes, no or reset)\t");
 			response = console.nextLine();
 		}

		System.out.print(""); 		
 	} //end dice
 	
 	
 	// method:		lazyCalculator
 	// description:	Called when the user chooses to interact with a LazyCalculator
 	public void lazyCalculator()
 	{
 		LazyCalculator ann = new LazyCalculator();
 		System.out.print("Add 2 or 4 numbers?\t");
 		String response = console.nextLine();
 		
 		if(response.equals("2"))
 		{
 			System.out.print("Enter the first number that you would like to add\t");
	 		String firstNum = console.nextLine();
	 		int num1 = Integer.parseInt(firstNum);
	 		System.out.print("Enter the second number that you would like to add\t");
	 		String secondNum = console.nextLine();
	 		int num2 = Integer.parseInt(secondNum);
	 		
	 		System.out.println(num1 + " + " + num2 + " is " + ann.add(num1, num2));
 		}
 		else if(response.equals("4"))
 		{
 			System.out.print("Enter the first number that you would like to add\t");
	 		String firstNum = console.nextLine();
	 		int num1 = Integer.parseInt(firstNum);
	 		System.out.print("Enter the second number that you would like to add\t");
	 		String secondNum = console.nextLine();
	 		int num2 = Integer.parseInt(secondNum);
	 		System.out.print("Enter the third number that you would like to add\t");
	 		String thirdNum = console.nextLine();
	 		int num3 = Integer.parseInt(thirdNum);
	 		System.out.print("Enter the fourth number that you would like to add\t");
	 		String fourthNum = console.nextLine();
	 		int num4 = Integer.parseInt(fourthNum);
	 		
	 		System.out.println(num1 + " + " + num2 + " + " + num3 + " + " +
	 			num4 + " is " + ann.add(num1, num2, num3, num4));
 		}
 	
 	} //end lazyCalculator
 	
 } //end class