/*
 * Description: This program allows the user to calculate the subtotal 
 * and total price (after taxes) of five items.
 * 
 * Author: Tony Jiang
 * Date: Sept. 7th, 2018
 */
import java.util.Scanner;

public class CashierProgram {

        public static void main(String[] args) {
            
            //receives item prices from user
            Scanner itemOne = new Scanner(System.in);
            System.out.println("Please Enter the price for item 1: ");
            double firstItem = itemOne.nextDouble();
            
            Scanner itemTwo = new Scanner(System.in);
            System.out.println("Please Enter the price for item 2: ");
            double secondItem = itemTwo.nextDouble();
            
            Scanner itemThree = new Scanner(System.in);
            System.out.println("Please Enter the price for item 3: ");
            double thirdItem = itemThree.nextDouble();
            
            Scanner itemFour = new Scanner(System.in);
            System.out.println("Please Enter the price for item 4: ");
            double fourthItem = itemFour.nextDouble();
            
            Scanner itemFive = new Scanner(System.in);
            System.out.println("Please Enter the price for item 5: ");
            double fifthItem = itemFive.nextDouble();
            
            //outputs item prices
            System.out.println("\nItem one: " + String.format("%.2f", firstItem));
            System.out.println("Item two: " + String.format("%.2f", secondItem));
            System.out.println("Item three: " + String.format("%.2f", thirdItem));
            System.out.println("Item four: " + String.format("%.2f", fourthItem));
            System.out.println("Item five: " + String.format("%.2f", fifthItem));
            
            //calculating subtotal, tax and total price
            double subtotal = firstItem+secondItem+thirdItem+fourthItem+fifthItem;
            
            double tax = subtotal*0.13;
            
            double totalPrice = subtotal + tax;
            
            //outputting subtotal, tax and price
            System.out.println("\nSubtotal: " + String.format("%.2f", subtotal));
            
            System.out.println("Tax: " + String.format("%.2f", tax));
            
            System.out.println("Total Price: " + String.format("%.2f", totalPrice));  
        
        }
    
}


