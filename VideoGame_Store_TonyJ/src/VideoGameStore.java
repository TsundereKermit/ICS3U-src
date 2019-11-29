import java.util.Scanner;
import static java.lang.System.out;

public class VideoGameStore {
        public static Scanner userInput = new Scanner(System.in);
        public static void main(String[] args) { double p; double r; String name; int genreChoice; String genre; int num=-1;
                out.println("Welcome to the video game store!");
                do {
                    out.println("How many video games would you like to buy? (1-4)");
                    while (!userInput.hasNextInt())
                    {
                        System.out.println("invalid entry");
                        userInput.nextLine();
                    }
                    num=userInput.nextInt();
                } while (num<1||num>4);
                switch (num) {
                    case 1:
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game "+num);
                        r=getRating();
                        out.println("Enter the price of game "+num);
                        p=getPrice();
                        out.println("Enter the genre of game "+num);
                        VideoGame one = new VideoGame(name, p, r);

                    case 2:
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame on = new VideoGame(name, p, r);
                        num--;
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame two = new VideoGame(name, p, r);

                    case 3:
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame o = new VideoGame(name, p, r);
                        num--;
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame tw = new VideoGame(name, p, r);
                        num--;
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame three = new VideoGame(name, p, r);

                    case 4:
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame un = new VideoGame(name, p, r);
                        num--;
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame t = new VideoGame(name, p, r);
                        num--;
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame thre = new VideoGame(name, p, r);
                        num--;
                        out.println("Enter the name of game "+num);
                        name=getName();
                        out.println("Enter the rating of game"+num);
                        r=getRating();
                        out.println("Enter the price of game"+num);
                        p=getPrice();
                        VideoGame four = new VideoGame(name, p, r);
                }

                out.println("All the games have been initialized.");
                String statsAgain="No";
                out.println("Would you like to see the stats of the games?(y/n)");
                if (statsAgain.compareTo("y")==0 || statsAgain.compareTo("Y") == 0 || 
                       statsAgain.compareTo("yes") == 0 || statsAgain.compareTo("Yes")==0) {
                    switch (num) {
                        case 1: int s;
                                do {
                                while(!userInput.hasNextInt())
                                {
                                    System.out.println("invalid entry");
                                    userInput.nextLine();
                                }
                                s=userInput.nextInt();
                                } while(s<1||s>1);
                                userInput.nextLine();
                    }
                    seeStats();
                    do {
                        out.println("Would you like to see another stat?");
                        statsAgain=userInput.nextLine();
                        seeStats;
                    } while (statsAgain.compareTo("y")==0 || statsAgain.compareTo("Y") == 0 || 
                           statsAgain.compareTo("yes") == 0 || statsAgain.compareTo("Yes")==0);
                }
                else
                    System.exit(0);
            
        }
        
        public static String getName() {
            String returnName="";
            while (!userInput.hasNext())
                {
                    System.out.println("invalid entry");
                    userInput.nextLine();
		}
            returnName=userInput.nextLine();
            return returnName;
        }
        
        public static double getRating() {
            double returnRating;
            while (!userInput.hasNextDouble())
                {
                    System.out.println("invalid entry");
                    userInput.nextLine();
		}
            returnRating=userInput.nextDouble();
            return returnRating;
        }
        
        public static double getPrice() {
            double returnPrice;
            while (!userInput.hasNextDouble())
                {
                    System.out.println("invalid entry");
                    userInput.nextLine();
		}
            returnPrice=userInput.nextDouble();
            return returnPrice;
        }
        
        
        
        public static void seeStats(VideoGame x) {
            out.println("Type a number to choose the stat to see: "
                    + "1. Cost"
                    + "2. Total Cost"
                    + "3. Taxed Cost"
                    + "4. Average Cost"
                    + "5. Rating"
                    + "6. Average Rating"
                    + "7, Name"
                    + "8. Amount of video games");
            int c;
            while (!userInput.hasNextInt())
                {
                    System.out.println("invalid entry");
                    userInput.nextLine();
		}
            c=userInput.nextInt();
            switch (c) {
                case 1: 
                out.println("The cost is "+x.getCost());
                case 2: 
                out.println("The total cost is "+x.getTotalCost());
                case 3: 
                out.println("The taxed cost is "+x.getTaxedCost());
                case 4: 
                out.println("The average cost is "+x.getAverageCost());
                case 5: 
                out.println("The rating is "+x.getRating());
                case 6: 
                out.println("The average rating is "+x.getAverageRating());
                case 7: 
                out.println("The name is "+x.getName());
                case 8: 
                out.println("The amount of video games is "+VideoGame.getNumVideoGames());
            }
        }
}
