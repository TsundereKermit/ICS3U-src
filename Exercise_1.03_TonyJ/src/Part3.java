/*
* Description: part 3 of the repetition in java program
* Author: Tony Jiang
* Date: Sept. 19, 2018
*/
public class Part3 {
    
    public static void main(String[] args) 
    {
        //Initializing variables and strings
        String spaces="                ",multiplyNum="1", rightSide="1",rightFirst="1",rightSecond="";
        int rightSecondAdd;
        
        System.out.println("                  1 x 1 = 1");
      
      for (int i=2; i<10; i++)
      {
          rightSecondAdd=i-1;
          multiplyNum+=1;
          rightFirst+=i;
          rightSecond=rightSecondAdd+rightSecond;
          
          rightSide=i+rightSide+i;
          System.out.println(spaces + multiplyNum + " x " +  multiplyNum + " = " + rightFirst + rightSecond);
          spaces = spaces.substring(2);   
      }
        
    }//End method      

}//End class