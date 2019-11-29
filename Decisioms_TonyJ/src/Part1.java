/*
*Description: Asks user for a lottery number, filters out invalid responses and 
*checks for the winning entry.
*Author: Tony Jiang
*Date: Sept. 14, 2018
*/
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        
        //asks user for the lottery number
        Scanner lottery= new Scanner(System.in);
        System.out.println("Please enter a five digit lottery ticket number.");
        
        //filters out invalid responses
        if (lottery.hasNextInt())
        {
            int lotteryNum = lottery.nextInt();
            
            //ensures user had entered a 5 digit number
            if (lotteryNum<10000)
            {
                System.out.println("Your number does not have 5 digits.");
            }
            
            else if (lotteryNum==34567)
            {
            System.out.println("You have won $1,000,000.");
            } 
            
            else
            {
                System.out.println("Better luck next time!");
            }
        }
        else
        {
            System.out.println("You didn't enter an integer.");
        }
        
        System.exit(0);

    }
    
}
