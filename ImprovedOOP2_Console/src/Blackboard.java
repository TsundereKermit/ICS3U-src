public class Blackboard 
{
	// When you are asked to drawSquare, do so � anywhere within the confines of your drawing space
	public String drawSquare()
	{
		int r = (int)(Math.random()*5 + 2);
		String sq = "";
			
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < r; j++)
			{
				sq += "@ ";
			}
			sq += "\n";
		}
		return sq;
	}
	
	// When you are asked to drawCircle, do so � anywhere within the confines of your drawing space
	public String drawCircle()
	{
		return "O";
	}
	
	// When you are asked to drawText, you will also be given a word (or phrase). Draw it somewhere within the confines of your drawing space.
	public String drawText(String t)
	{
		return t;
	}
	
	// When you are asked to clear, erase your drawing space. (Leave the boundary lines)
	public String clear()
	{
		return "ERASING EVERYTHING...";
	}
	
}
