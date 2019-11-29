/*
* Description: part 1 of the repetition in java program
* Author: Tony Jiang
* Date: Sept. 17, 2018
*/
public class Part1 
{

    public static void main(String[] args) 
    {
        //Initializing strings
        String spaces="         ",growingNum="", rightSide="";
      
        for (int i=1; i<10; i++)
        {
            growingNum+=i;
            rightSide+=(10-i);
            System.out.println(spaces + growingNum + " x 8 + "+ i + " = " + rightSide);
            spaces = spaces.substring(1);   
        }
      
      
    }//End Method
    
}//End Class


