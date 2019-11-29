/*
* Description: part 4 of the repetition in java program
* Author: Tony Jiang
* Date: Sept. 21, 2018
*/
public class Part4 {
    
public static void main(String[] args) 
    {
        //Initializing variables and strings
        String spaces="        ",shrinkingNum="9", rightSide="88";
        int shrinkingNumAdd; int shrinkingNumTwo=7;
     
        System.out.println("         9 x 9 + 7 = 88");
        for (int i=1; i<8; i++)
        {
            shrinkingNumAdd=9-i;
            shrinkingNum+=shrinkingNumAdd;
            shrinkingNumTwo-=1;
            rightSide+=8;
            System.out.println(spaces + shrinkingNum + " x 9 + " + shrinkingNumTwo + " = " + rightSide);
            spaces = spaces.substring(1); 
        }
        
    }//End method      

}//End class
