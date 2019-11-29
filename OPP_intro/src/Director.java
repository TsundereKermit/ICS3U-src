/**
 * This class will be used to test our other classes by creating objects
 * and interacting with them via their methods.
 * @author Ms Cianci
 * @since  Friday, March 1, 2013
 * @modified Mar 10, 2016 by Mr. Roller
 */
public class Director 
{
	public static void main(String[] args)
        {
		Acrobat teddy = new Acrobat();
		System.out.println(teddy.clap(3));
		
		Dice john = new Dice();
                System.out.println(john.roll());
                System.out.println(john.numRolls());
                john.clear();
                System.out.println(john.numRolls());
                
                Calculator tonester = new Calculator();
                System.out.println(tonester.add(1,2));
                System.out.println(tonester.subtract(1,2));
                System.out.println(tonester.multiply(1,2));
	} // end main method
} // end class