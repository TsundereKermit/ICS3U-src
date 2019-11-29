/**
 * This class will describe an acrobat object that is able to clap
 * and do kneebends and also count a total number of exercises.
 * @author Ms Cianci updates: Mrs. Cullum
 * @modifications: Mr. Roller
 * @since  Mar 24th, 2017
 */
public class Acrobat {

	//static variable counting the number of Acrobats created by Circus.
	private static int numAcrobats = 0;
	
	//instance variables
	private int numExercises;
	private String acrobatName;
	
	//constructor
	public Acrobat(String name){
		
		//initialize instance variables
		numExercises = 0;
		
		//increment the number of Acrobats that exist
		numAcrobats++;
		
		//acrobat name
		acrobatName = name;
	}

	/**
	 * @param n	The number of times the acrobat will do a clap
	 * @return  	A string containing the word Clap n times
	 */
	public String clap(int n)
	{
		String clapper = "";
		
		for(int i = 0; i < n; i++)
		{
			clapper += "Clap ";
			numExercises++;
		}
		
		return clapper;
	} // end clap method
	
	/**
	 * @param n The number of times the acrobat will do a kneebend
	 * @return  A string containing the words Kneebend n times
	 */
	public String kneebend(int n)
	{
		String kneebender = "";
		
		for(int i = 0; i < n; i++){
			kneebender += "Kneebend ";
			numExercises++;
		}
		
		return kneebender;
	} // end kneebend method
	
	/**
	 * @return The total number of exercises that have been completed
	 */
	public int getNumExercises()
	{
		return numExercises;
	} // end getNumExercises method

	
	public String getName()
	{
		return acrobatName;
	} //end getName method
	
	/** 
	 * This static method returns the number of Acrobats that have been created.
	 * @return number of Acrobats created
	 * */
	public static int getNumAcrobats(){
		
		return numAcrobats;
	} //end getNumAcrobats method
	
}//end class