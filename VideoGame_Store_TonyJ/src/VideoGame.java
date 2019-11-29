
public class VideoGame {
    
    private static int numVideoGames;
    public final static double TAXRATE=0.13;
    private static double totalCost;
    private static double totalRating;
    
    private double rating=0;
    private String name="?";
    private String choiceOfGenre="?";
    private double averageRating=0;
    private double averagePrice=0;
    private double cost=0;
    
    public VideoGame() {
        this ("Rocket League");
    }
    
    public VideoGame(String n) {
        this (n, 27.99);
    }
    
    public VideoGame (String n, double c) {
        this (n, c, 4.5);
    }
    
    public VideoGame (String n, double c, double r) {
        setName(n);
        setCost(c);
        setRating(r);
        totalCost=totalCost+cost*TAXRATE;
        totalRating+=r;
        numVideoGames++;
    }
    
    public void setRating (double r) {
        rating=r;
    }
    
    public double getRating () {
        return rating;
    }
    
    public void setName (String n) {
        name=n;
    }
    
    public void setCost (double c) {
        cost=c;
    }
    
    public double getCost() {
        return cost;
    }
    
    public String getName() {
        return name;
    }
    
    public double getTotalCost() {
        return totalCost;
    }
    
    public double getTaxedCost() {
        return cost*TAXRATE;
    }
    
    public static int getNumVideoGames() {
        return numVideoGames;
    }
    
    
    public String getGenreChoice (int c) {
        switch (c) {
            case 1:
                choiceOfGenre="Role-playing";
            case 2:
                choiceOfGenre="Shooter";
            case 3:
                choiceOfGenre="Platform";
            case 4:
                choiceOfGenre="Horror";
            case 5:
                choiceOfGenre="Rhythm";
            default:
                choiceOfGenre="MOBA";
                
        }
        return choiceOfGenre;
    }
    
    public double getAverageCost() {
        averagePrice = totalCost/numVideoGames;
        return averagePrice;
    }
    
    public double getAverageRating() {
        averageRating=totalRating/numVideoGames;
        return averageRating;
    }
    
    
}
