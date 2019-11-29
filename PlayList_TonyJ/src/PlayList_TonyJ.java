/*
* Description: This program will ask for the amount of songs in a playlist, the length of each song,
* and the amount of time the user has. It will then output whether the user has enough time to listen
* to all the songs or not.
* 
* Author: Tony Jiang
* Date: September 26, 2018
*/
import java.util.Scanner;
public class PlayList_TonyJ { 

    public static void main(String[] args) {
        
        //Sets up a scanner to get the amount of songs that the user is planning to listen to
        int listLength;
        System.out.println("Enter the number of songs in your playlist between 1 and 10: ");
        Scanner userInput = new Scanner(System.in);
        
        //Filters out anything that isn't an integer
        if (userInput.hasNextInt()) {
            listLength = userInput.nextInt();
            
            //Further limiting the input to only work between 1 and 10
            if (listLength>=1 && listLength<=10) {
                
                //Gets the total length of the playlist
                int playListLength=0;
                for (int i=1; i<=listLength; i++) {

                    System.out.println("Enter the length of song " + i + " in minutes and seconds separated by a space.");
                    int minutes = userInput.nextInt();
                    int seconds = userInput.nextInt();
                    playListLength+= minutes * 60 + seconds;
                    userInput.nextLine();

                }
                
                //Gets the amount of time that the user has
                int userTime=0;
                System.out.println("Now enter the length of time you have to listen to music in minutes and seconds separated by a space: ");
                int userMinutes = userInput.nextInt();
                int userSeconds = userInput.nextInt();
                userInput.nextLine();
                userTime += userMinutes * 60 + userSeconds;
                
                //Outputs the total length of the playlist
                int playListMinutes = (playListLength-(playListLength%60))/60;
                int playListSeconds = playListLength%60;
                System.out.println("The current playlist is " + playListMinutes + " minute(s) " + playListSeconds + " second(s) long.");
                
                //Outputs the amount of time that the user has
                int userMinutesOutput = (userTime-(userTime%60))/60;
                int userSecondsOutput = userTime%60;
                System.out.println("Mr. Hulabaloo has " + userMinutesOutput + " minute(s) " + userSecondsOutput + " second(s) to listen to music.");
                
                //Outputs whether the user will be able to finish the playlist or not
                if (userTime>=playListLength) {
                    System.out.println("Awesome Mr. Hulabaloo, it looks like you can listen to your entire playlist!");
                }
                else {
                    System.out.println("Sorry Mr. Hulabaloo, it looks like you cannot listen to your entire playlist!");
                }
                
            }
            
            //Filters out any numbers that aren't between 1 and 10
            else {
                System.out.println("You need to enter a number between 1 and 10, exiting...");
                System.exit(0);
            }
        }
        
        //Filters out any inputs that aren't integers
        else {
            System.out.println("You did not enter an integer, exiting...");
            System.exit(0);
        }
        
        //Closes scanner and program
        userInput.close();
        System.exit(0);
        
    }//End Method
    
}//End class
