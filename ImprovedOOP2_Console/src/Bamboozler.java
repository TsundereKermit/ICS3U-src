public class Bamboozler 
{
	// When you are asked to add, you will be given two numbers. Give back their sum. 
	// Do so verbally. Note that you can only add two numbers. You cannot add three or more numbers.
	public int add(int a, int b)
	{
		return (a + b);
	}
	
	// When you are asked to subtract, you will be given two numbers. DO NOT give back their difference.
	// Instead, double the first and then give back the difference of the two. Do so verbally. For example, if you were asked to subtract 6 and 4 you would return 8
	public int subtract(int a, int b)
	{
		return (2 * a - b);	
	}
}
