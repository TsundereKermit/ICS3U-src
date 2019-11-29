import java.util.Scanner;

/* Description: The console display of RepetitionInData
 * 
 * Author: Tony Jiang
 * Date: Dec. 1, 2018
*/
public class AnalyzingData {
    public static void main(String args[]) {
            
            int rolls=0;
            Scanner userInput = new Scanner(System.in);
            
            do {
		System.out.println("Welcome to the dice rolling station!");
                System.out.println("How many times would you like to roll?");
		while(!userInput.hasNextInt()) {
                    System.out.println("Invalid entry, please enter a positive integer.");
                    userInput.nextLine();
		}
		rolls=userInput.nextInt();
            } while(rolls<0);
            
            int sides=0;
            do {
		System.out.println("Please enter the amount of sides this dice has:");
		while(!userInput.hasNextInt()) {
                    System.out.println("Invalid entry, please enter a positive integer.");
                    userInput.nextLine();
		}
		sides=userInput.nextInt();
            } while(sides<0);
            
            RepetitionInData dice = new RepetitionInData(rolls,sides);
            
            while(true){
                System.out.println("\n\n\nWhich action would you like do?");
                System.out.println("1. Display all of your dice rolls"
                        + "\n2. Display the average of all of your rolls"
                        + "\n3. Display the frequency of each roll"
                        + "\n4. Reverse the order of the dice rolls"
                        + "\n5. Exit the program");
                int response=0;
                while(!userInput.hasNextInt()) {
                    System.out.println("Invalid entry, please enter an integer.");
                    userInput.nextLine();
                }
                response=userInput.nextInt();
                if (response>0 || response<6) {
                    switch (response) {
                            case 1: 
                                dice.displayArray();
                                break;
                            case 2: 
                                dice.displayAverage();
                                break;
                            case 3: 
                                dice.displayFrequency();
                                break;
                            case 4: 
                                dice. reverseArray();
                                System.out.println("Reversed! Type 1 to check it out!");
                                break;
                            case 5: 
                                System.out.println("Goodbye!");
                                    System.exit(0);
                            default: 
                                System.out.println("Invalid number");
                                break;
                            
                        }
                    }
            }
        
    }
}
