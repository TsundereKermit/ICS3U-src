import java.util.Scanner;
public class Part4 {
    public static void main(String[] args) {
        
        //asks the user for the DVD price
        Scanner dvdPrice= new Scanner(System.in);
        System.out.println("Please enter the purchase price of a DVD movie.");
        
        //filters out invalid responses
        if (dvdPrice.hasNextDouble()) 
        {
            double moviePrice=dvdPrice.nextDouble();
            if (moviePrice>0)
            {
            
            //asks the user for the quantity of DVD's    
            Scanner quantity= new Scanner(System.in);
            System.out.println("Please enter the quantity of DVDs.");
                
                //filters out invalid responses
                if (quantity.hasNextInt())
                {
                    int amount=quantity.nextInt();
                    
                    //filters out negative numbers
                    if (amount>0)
                    {
                        double preTax=amount*moviePrice;
                        double aftTax=preTax*1.13;
                        System.out.println("The subtotal is "+preTax);
                        System.out.println("The total price is "+aftTax);
                    }
                    else
                    {
                        System.out.println("You can't enter a negative number.");
                    }
                }
                
                else
                {
                    System.out.println("You did not enter a whole number.");
                }
            }
            
            else
            {
            System.out.println("The price of the movie can't be under $0.");
            }
        }
        
        else
        {
            System.out.println("You did not enter a number.");
        }
    }
}
