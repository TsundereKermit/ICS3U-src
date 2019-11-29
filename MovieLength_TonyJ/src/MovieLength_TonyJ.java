/*
*Description: Allows user to input the amount of seconds to determine a movie's
*length in hours, minutes, and seconds
*Name: Tony Jiang
*Date: Sep. 10, 2018
*/

import java.util.Scanner;

public class MovieLength_TonyJ {

    public static void main(String[] args) {
        
        Scanner movieSeconds = new Scanner(System.in);
            System.out.println("Please enter the length of yout movie in seconds: ");
            int seconds = movieSeconds.nextInt();
        
        int hours = (seconds-(seconds%3600))/3600;
        int secondMinutes = seconds-hours*3600;
        int minutes = (secondMinutes-(secondMinutes%60))/60;
        int secondsFinal = seconds-hours*3600-minutes*60;
        
        if (hours>1) {
            System.out.print(hours+" hours ");
        } else {
            System.out.print(hours+" hour ");
        }
        
        if (minutes>1) {
            System.out.print(minutes+" minutes ");
        } else {
            System.out.print(minutes+" minute ");
        }
        
        if (secondsFinal>1) {
            System.out.print(secondsFinal+" seconds ");
        } else {
            System.out.print(secondsFinal+" second ");
        }
    
    }
    
}
