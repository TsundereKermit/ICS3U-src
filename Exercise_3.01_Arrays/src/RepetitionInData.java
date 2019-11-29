
/* Description:  
 *
*/
public class RepetitionInData {
        
    
        private int diceValues[];
        private int sides;
        
        public RepetitionInData() {
            diceValues = new int [10];
            fillArray();
        }
        
        public RepetitionInData (int numRolls) {
            if (numRolls>0) {
                diceValues = new int [numRolls];
                sides=6;
            }
            else {
                diceValues = new int [10];
                sides=6;
            }
            fillArray();
        }
        
        public RepetitionInData (int numRolls, int numSides) {
            if (numRolls>0) {
                diceValues = new int [numRolls];
                sides=numSides;
            }
            else {
                diceValues = new int [10];
                sides=numSides;
            }
            fillArray();
        }
        
        
        
        private void fillArray() {
            for (int i=0; i<diceValues.length; i++) {
                diceValues[i]=(int)(Math.random()*sides)+1;
            }
        }
        
        public void displayArray() {
            for (int i=0; i<diceValues.length; i++) {
                System.out.print(diceValues[i]+" ");
            }
        }
        
        public void displayAverage() {
            double tempCounter=0;
            for (int i=0; i<diceValues.length; i++) {
                tempCounter+=diceValues[i];
            }
            System.out.println("\nThe average is: "+tempCounter/diceValues.length);
        }
        
        public void displayFrequency() {
            int[] clone=diceValues.clone();
            System.out.println();
            if (diceValues.length<30) { //if the amount of rolls is small, use method 2
                for (int i=1;i<=sides;i++) {
                    System.out.print(i+": ");
                    for (int j=0; j<clone.length; j++) {
                        if (clone[j]==i)
                            System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else { //if the amount of rolls is too high, use method 1
                int frequencyCounter=0;
                for (int i=1;i<=sides;i++) {
                    System.out.print("#"+i+"'s: ");
                    for (int j=0; j<clone.length; j++) {
                        if (clone[j]==i)
                            frequencyCounter++;
                    }
                    System.out.print(frequencyCounter);
                    System.out.println();
                    frequencyCounter=0;
                }
            }
        }
        
        public void reverseArray() {
            for (int i=1; i<=diceValues.length/2; i++) {
                int num1=diceValues[i-1];
                int num2=diceValues[diceValues.length-i];
                diceValues[i-1]=num2;
                diceValues[diceValues.length-i]=num1;
                }
            
        }
}
