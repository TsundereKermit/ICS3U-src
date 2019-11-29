import java.util.Scanner;

public class Balloon_TonyJ {

    
    public static void main(String[] args) { int t; int A; boolean yikes=false;
       
        System.out.println("How many hours are you willing to wait?");
        Scanner inputStuff= new Scanner(System.in);
        
        if (inputStuff.hasNextInt()){
            int M = inputStuff.nextInt();
                if (M<24 || M>0){
                    System.out.println("How humid is it today?");
                        if (inputStuff.hasNextInt()){
                            int h = inputStuff.nextInt();
                                if (h<100 || h>0) {
                                    do {
                                        for (t=1; t<=M; t++){ 
                                            A=-6*t*t*t*t+h*t*t*t+2*t*t+t;
                                                if (A<=0) {
                                                    System.out.println("The balloon will land during " + t + " hours.");
                                                    System.exit(0);
                                                }
                                            }
                                    } while (t<=M);
                                    
                                            if (t>M) {
                                                System.out.println("The balloon will not land in the given time");
                                    }
                                        
                                }
                                else {
                                    System.out.println("You did not enter a valid response, exiting...");
                                    System.exit(0);
                                }
                        }
                        else {
                        System.out.println("You did not enter a valid response, exiting...");
                        System.exit(0);
                        }
                }
                else {
                    System.out.println("You did not enter a valid response, exiting...");
                    System.exit(0);
                }
        }
        else{
            System.out.println("You did not enter a valid response, exiting...");
            System.exit(0);
        }
        
        
        
        
        
    }
    
}
