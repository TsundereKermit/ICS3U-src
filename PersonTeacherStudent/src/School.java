public class School {

    public static void main(String[] args) {
        
        //Note: Jeff's birthday here is April 24th, 1980
	Teacher jeff = new Teacher ("Jeff", "Dell", "1 Nepean Avenue", 1980, 4, 24, "Computer Science, Math", "c49123");
	Date today = new Date(2018, 11, 21);  //today is Nov 21, 2018
	System.out.println(jeff);  //Note: added the birthday in the toString method for Teacher!
	System.out.println();
        System.out.println("Age is: " + jeff.getAge(today));

    }
	
}