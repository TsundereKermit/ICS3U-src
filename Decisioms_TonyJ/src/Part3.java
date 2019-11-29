/*
*Description: Asks the user for 3 integers
*/
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        
        System.out.println("You have been selected to test my new game!");
        System.out.println("You will be asked to enter three numbers.");
        System.out.print("If any combinations of the frist two numbers");
        System.out.print("is euqal to the third number, you win!\n");
        
        //asks the user for the first integer
        Scanner intOne= new Scanner(System.in);
        System.out.println("Please enter the first integer.");
        
        //filters out invalid responses
        if (intOne.hasNextInt()) 
        {
            int firstInt=intOne.nextInt();
            
            //asks the user for the second integer
            Scanner intTwo= new Scanner(System.in);
            System.out.println("Please enter the second integer.");
            
                //filters out invalid responses
                if (intTwo.hasNextInt())
                {
                    int secondInt=intTwo.nextInt();
                    
                    //asks the user for the third integer
                    Scanner intThree= new Scanner(System.in);
                    System.out.println("Please enter the third integer.");
                    
                        //filters out invalid responses
                        if (intThree.hasNextInt())
                        {
                            int thirdInt=intThree.nextInt();
                            
                            //checks for the win condition of addition
                            if (firstInt+secondInt==thirdInt)
                            {
                                System.out.println("Congratulations! You won!");
                            }
                            
                            //checks for the win condition of multiplication
                            else if (firstInt*secondInt==thirdInt)
                            {
                                System.out.println("Congratulations! You won!");
                            }
                            
                            //checks for the win condition of subtraction
                            else if (secondInt-firstInt==thirdInt||firstInt-secondInt==thirdInt)
                            {
                                System.out.println("Congratulations! You won!");
                            }
                            
                            //checks for the win condition of division
                            else if (secondInt!=0&&firstInt/secondInt==thirdInt&&firstInt%secondInt==0)
                            {
                                System.out.println("Congratulations! You won!");
                            }
                            if (firstInt!=0&&secondInt/firstInt==thirdInt&&secondInt%firstInt==0)
                            {
                                System.out.println("Congratulations! You won!");
                            }
                            
                            else
                            {
                                System.out.println("You lose.");
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
        }
        
        else
        {
            System.out.println("You did not enter an integer.");
        }
        
        System.exit(0);
    }
}
