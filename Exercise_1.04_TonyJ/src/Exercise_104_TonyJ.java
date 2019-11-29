/*
* Description: This program asks for a number (each representing a shape), a character
* to draw the shape with, and the height to draw a shape, afterwards, the programs
* asks whether the user would like to draw another shape
*
* Author: Tony Jiang
* Date: Sep. 29, 2018
*/

import java.util.Scanner;

public class Exercise_104_TonyJ {
	
	public static Scanner userInput = new Scanner(System.in); 
	
	public static void main(String[] args) 
        {
	//Initialize Variables
            int shape=-1;
            char singleChar;
            int height =-1;
            String playAgain="No";    //Force user to put in something intelligent to keep playing

            do
            {
		shape=getUserChoice();  //function returns int between 1 and 5
                singleChar = getUserChar(); //function returns a char
		height = getUserHeight(); //function returns an int from 1 to 10

		switch(shape)
		{
                    case 1: 
			drawSquare(singleChar, height);
			break;
                    case 2:
			drawRightTriangle(singleChar, height);
			break;
                    case 3:
			drawPyramid(singleChar, height);
			break;
                    case 4:
			drawHourglass(singleChar, height);
			break;
                    case 5:
			drawDiamond(singleChar, height);
			break;
                    default:
			System.out.println("Sorry, An Error Occurred. Terminating program");
			System.exit(0);
		}

		System.out.println("\nWould you like to draw another shape? (y/n) ");
		playAgain = userInput.nextLine();

            } while(playAgain.compareTo("y")==0 || playAgain.compareTo("Y") == 0 || 
			playAgain.compareTo("yes") == 0 || playAgain.compareTo("Yes")==0);		
		
            System.out.println("Good-bye!");
            userInput.close();  //close scanner
	}
	
	public static void drawSquare(char c, int h)
	{
            // draw h rows of the square
            System.out.println();
            for (int i = 0; i < h; i++)
            {
		// draw ONE ROW of the square
		for (int j = 0; j < h; j++)
		{
                    System.out.print(c + " ");
		}
			
		// move to the next line so the next row 
		// of the square can be drawn
		System.out.println();
		
            } // end for
	} // end drawSquare method
        
        public static void drawRightTriangle(char c, int h) {
            // draws h rows of the right angle triangle
            System.out.println();
            for (int i = 1; i <= h; i++) {
                // draw one row of the right angle triangle
                for (int j = 0; j < i; j++) {
                    System.out.print(c + " ");
                }
                // creates a new line to draw the next line of the triangle
                System.out.println();
            } //end of for loop
        } //end of drawRightTriangle

        public static void drawPyramid(char c, int h) {
            //draws h rows of the pyramid
            for(int i=0;i<h;i++) {
                //creates the space in front of each row
                for(int j=0;j<h-i;j++) {
                    System.out.print("  ");
                }
                //draw one row of the pyramid
                for(int k=0;k<=i*2;k++) {
                    System.out.print(c + " ");
                }
                //creates a new line for the next line of the pyramid
                System.out.println();  
            } //end of for loop
        } //end of drawPyramid
        
        public static void drawHourglass(char c, int h) {
           
            int minus = (int)Math.floor(h / 2);
            //draws half of h (rounded up) rows of the hourglass
            for(int i=h-minus;i>=1;i--){
                //creates the spaces in front of each row
                for(int j=i;j<h;j++) {
                    System.out.print("  ");
                }
                //draws one row of the top half of the hourglass
                for(int j=1;j<=i*2-1;j++) {
                    System.out.print(c + " ");
                }
                //creates a new line for the next line of the hourglass
                System.out.println();
            }
            
            //decides whether to repeat middle line or not
            if (h%2==0) {
                //draws half of h (rounded down) rows of the hourglass
                for(int i=1;i<=h-minus;i++) {
                    //creates the spaces in front of each row
                    for(int j=i;j<h;j++) {
                        System.out.print("  ");
                    }
                    //draws one row of the bottom half of the hourglass
                    for(int j=1;j<=i*2-1;j++) {
                        System.out.print(c + " ");    
                    }
                    //creates a new line for the next line of the hourglass
                    System.out.println();
                } //end of for loop
            }
            else {
                //draws one less than half of h rows of the hourglass
                for(int i=2;i<=h-minus;i++) {
                    //creates the spaces in front of each row
                    for(int j=i;j<h;j++) {
                        System.out.print("  ");
                    }
                    //draws one row of the bottom half of the hourglass
                    for(int j=1;j<=i*2-1;j++) {
                        System.out.print(c + " "); 
                    }
                    //creates a new line for the next line of the hourglass
                    System.out.println();
                } //end of for loop
            }    
        } //end of drawHourglass
        
        
        public static void drawDiamond(char c, int h) {
            int minus = (int)Math.floor(h / 2);
            //draws half of h (rounded up) rows of the diamond
            for(int i=1;i<=h-minus;i++) {
                //creates the spaces in front of each row
                for(int j=i;j<h;j++) {
                    System.out.print("  ");
                }
                //draws one row of the bottom half of the diamond
                for(int j=1;j<=i*2-1;j++) {
                    System.out.print(c + " ");    
                }
                //creates a new line for the next line of the diamond
                System.out.println();
            } //end of for loop
            //decides whether to repeat middle line or not
            if (h%2==0) {
                //draws half of h rows of the diamond
                for(int i=h-minus;i>=1;i--){
                    //creates the spaces in front of each row
                    for(int j=i;j<h;j++) {
                        System.out.print("  ");
                    }
                    //draws one row of the top half of the diamond
                    for(int j=1;j<=i*2-1;j++) {
                        System.out.print(c + " ");
                    }
                    //creates a new line for the next line of the diamond
                    System.out.println();
                }
            }//end of for loop
            else {
                //draws half of h rows of the diamond
                for(int i=h-minus;i>=2;i--){
                    //creates the spaces in front of each row
                    for(int j=i-1;j<h;j++) {
                        System.out.print("  ");
                    }
                    //draws one row of the top half of the diamond
                    for(int j=3;j<=i*2-1;j++) {
                        System.out.print(c + " ");
                    }
                    //creates a new line for the next line of the diamond
                    System.out.println();
                }    
            }//end of for loop
        } //end of drawDiamond

	public static int getUserChoice()
	{
            int s=-1;
            do
            {
		System.out.println("You can enter any of the following shapes");
		System.out.println("1. square\n2. right angle triangle\n3. pyramid\n4. hourglass\n5. diamond\n");
		System.out.println("Enter in an integer to choose a shape: ");
		
		while(!userInput.hasNextInt())
                {
                    System.out.println("invalid entry");
                    userInput.nextLine();
		}
		s=userInput.nextInt();
            } while(s<1 || s>5);
            userInput.nextLine();//buffer flush
		
            return s;
	} // end getUserChoice method
	
	
	public static char getUserChar()
	{
            System.out.println("Please Enter a character with which to draw your shape: ");
            String printChar=userInput.nextLine();
            char sC = printChar.charAt(0); //Take the first character of the string
            return sC;
	} // end getUserChar method
	
	
	public static int getUserHeight()
	{
            int h=-1;
            do
            {
		System.out.println("Enter a height for your shape: ");
		while(!userInput.hasNextInt())
		{
                    System.out.println("Invalid entry...try again...");
                    userInput.nextLine();
		}
		h=userInput.nextInt();
            } while(h<1 || h>10);
            userInput.nextLine();//buffer flush
		
            return h;
	} // end getUserChoice method
}