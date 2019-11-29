/*
*Description: Asks user for two integers and compres for which one is larger 
*Author: Tony Jiang
*Date: Sept. 14, 2018
*/
import java.util.Scanner;

public class Part2 {
     public static void main(String[] args) {
         
        //asks user for the first integer
        Scanner intOne= new Scanner(System.in);
        System.out.println("Please enter the first integer.");
         
        //filters out invalid responses
        if (intOne.hasNextInt()) 
        {
            int firstInt=intOne.nextInt();
            
            //asks user for the first integer
            Scanner intTwo= new Scanner(System.in);
            System.out.println("Please enter the second integer.");
                
                //filters out invalid responses
                if (intTwo.hasNextInt())
                {
                    int secondInt=intTwo.nextInt();
                    
                    //checks for which integer is larger
                    if (firstInt<secondInt)
                    {
                        System.out.println(secondInt+" is larger than "+firstInt);
                    }
                    else
                    {
                        System.out.println(firstInt+" is larger than "+secondInt);
                    }
                }
                
                else
                {
                    System.out.println("You did not enter an integer.");
                }
        }
         
        else
        {
            System.out.println("You did not enter an integer.");
        }
     
        System.exit(0);
    }
}
