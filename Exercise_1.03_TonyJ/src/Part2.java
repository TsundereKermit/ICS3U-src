/*
* Description: part 2 of the repetition in java program
* Author: Tony Jiang
* Date: Sept. 17, 2018
*/
public class Part2 {
    
    public static void main(String[] args) 
    {
        //Initializing variables and strings
        String spaces="              ",growingNum="", rightSide="1";
        int secondGrow=1;
      
      for (int i=1; i<10; i++)
      {
          growingNum+=i;
          rightSide+=1;
          secondGrow=i+1;
          System.out.println(spaces + growingNum + " x 9 + "+ secondGrow + " = " + rightSide);
          spaces = spaces.substring(1);   
      }
        
    }//End method      

}//End class
