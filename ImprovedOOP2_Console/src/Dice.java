public class Dice 
{
	private int numRolls = 0;
	
	// When you are asked to roll, you should reply with a "random" number between 1 and 6. (Just make one up!). Respond verbally.
	public int roll()
	{
		numRolls++;
		return (int)(Math.random() * 6 + 1);
	}
	
	// When you are asked numRolls, simply reply with the number of times you have been asked to roll. Respond verbally.
	public int numRolls()
	{
		return numRolls;
	}
	
	// When you are asked to reset, change your "internal counter" to zero (pretend that all of the previous roll-s have never happened.)
	public void reset()
	{
		numRolls = 0;
	}
}
