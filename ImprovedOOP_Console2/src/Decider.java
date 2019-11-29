 /* @author Ms Cianci
 * @since  Friday, March 1, 2013
 * @modified Thursday, Oct 16th, 2017 Mr. Roller */

public class Decider 
{
	// When you are asked dayOfWeek, you will be given a month and a day 
	// in the current calendar year. 
	// Reply verbally with the day of the week on which that date falls.
 	public String dayOfWeek(String month, int day)
 	{
 		if(month.equalsIgnoreCase("January"))
 			return dayOfWeek(1, day);
 		else if(month.equalsIgnoreCase("Febuary"))
 			return dayOfWeek(2, day);
 		else if(month.equalsIgnoreCase("March"))
  			return dayOfWeek(3, day);
  		else if(month.equalsIgnoreCase("April"))
  			return dayOfWeek(4, day);
 		else if(month.equalsIgnoreCase("May"))
  			return dayOfWeek(5, day);
 		else if(month.equalsIgnoreCase("June"))
  			return dayOfWeek(6, day);
  		else if(month.equalsIgnoreCase("July"))
  			return dayOfWeek(7, day);
  		else if(month.equalsIgnoreCase("August"))
 			return dayOfWeek(8, day);
 		else if(month.equalsIgnoreCase("September"))
  			return dayOfWeek(9, day);
 		else if(month.equalsIgnoreCase("October"))
  			return dayOfWeek(10, day);
  		else if(month.equalsIgnoreCase("November"))
  			return dayOfWeek(11, day);
 		else if(month.equalsIgnoreCase("December"))
 			return dayOfWeek(12, day);
  		else
  			return "Invalid Input";
 	}
 	
 	public String dayOfWeek(int month, int day)
 	{
 		switch(month-1)
 		{
 			case 12:
 				day += 31;
 			case 11:
 				day += 30;
 			case 10:
 				day += 31;
 			case 9:
 				day += 30;
 			case 8:
 				day += 31;
 			case 7:
 				day += 31;
 			case 6:
 				day += 30;
 			case 5:
 				day += 31;
 			case 4:
 				day += 30;
 			case 3:
 				day += 31;
 			case 2:
 				day += 28;  //2018 is NOT a leap year
 			case 1:
 				day += 31;
 		}
 		day = day%7;
 		
		switch(day)//2018 started on a Monday
 		{
 			case 1:
 				return "Monday";
 			case 2:
 				return "Tuesday";
 			case 3:
 				return "Wednesday";
 			case 4:
 				return "Thursday";
 			case 5:
 				return "Friday";
 			case 6:
 				return "Saturday";
 			case 0:
 				return "Sunday";  //Note 7%7=0 not 7
  		}
 		
 		return "";
 	}


	//  you are asked to rate, you will be given a name. Reply verbally 
 	// wWhenith the rating of that person as given below:
	//	Daniel Alfredsson	athletic
	//	Albert Einstein		genius
	//	Russell Peters		very funny
	//	Anyone else		do not know
	public String rate(String name)
	{
		if(name.equalsIgnoreCase("Daniel Alfredsson"))
			return "athletic"; //Note: No braces {} needed for single line in if
		else if(name.equalsIgnoreCase("Albert Einstein"))
			return "genius";
		else if(name.equalsIgnoreCase("Russell Peters"))
			return "very funny";
		else
			return "do not know";
	}
}
