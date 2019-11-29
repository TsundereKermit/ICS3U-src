/**
 * This class will describe an acrobat object that is able to clap,
 * knee bend and count a total number of exercises.
 * @author Ms Cianci
 * @since  Friday, March 1, 2013
 */
public class Acrobat 
{
	private int numExercises;
	
	/**
	 * @param n	The number of times the acrobat will clap
	 * @return  A string containing the word clap n times
	 */
	public String clap(int n)
	{
		String clapping = "";
		
		for(int i = 0; i < n; i++)
		{
			clapping += "CLAP ";
			numExercises++;
		}
		
		return clapping;
	} // end clap method
	
	/**
	 * @param n The number of times the acrobat will kneeBend
	 * @return  A string containing the words knee bend n times
	 */
	public String kneeBend(int n)
	{
		if(n > 0)
			numExercises += n;
		
		String kneeBending = "";
		
		for(int i = 0; i < n; i++)
			kneeBending += "KNEEBEND ";
		
		return kneeBending;
	} // end kneeBend method
	
	/**
	 * @return The total number of exercises that have been completed
	 */
	public int count()
	{
		return numExercises;
	} // end clap method
} // end class 