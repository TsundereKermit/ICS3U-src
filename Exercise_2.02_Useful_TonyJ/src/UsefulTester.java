/*
*Description: this is the second part of "Useful, contains 
*all the calls to te methods
*Author: Tony Jiang
*Date: October, 28, 2018
*/

import java.util.Scanner;

public class UsefulTester {

        public static void main(String[] args) {
    
        int num1=0;
        int num2=0;
        double double1=0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter two integers separated by a space: ");
        num1 = userInput.nextInt();
        num2 = userInput.nextInt();
        System.out.println("Random int: "+Useful.getRandomInt(num1,num2));
        System.out.println("Random double: "+Useful.getRandomDouble(num1,num2));
        System.out.println("Enter a double: ");
        double1 = userInput.nextDouble();
        System.out.println("Rounded: "+Useful.getRounded(double1));
        System.out.println("Please enter a double and an int separated by a space");
        double n=userInput.nextDouble();
        int d=userInput.nextInt();
        System.out.println("Rounded to "+d+Useful.getRounded(n,d));
        System.out.println("Please enter a double: ");
        double money=userInput.nextDouble();
        System.out.println("Money+ "+Useful.getMoney(money));
        
    }
}
