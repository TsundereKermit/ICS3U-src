public class LazyCalculator 
{
	// When you are asked to add, you may be given two numbers. 
	// Find a calculator and ask the calculator to add them. 
	// Then reply verbally (to your "boss") with the sum.
	public int add(int a, int b)
	{
		Calculator c = new Calculator();
		
		int sum = c.add(a, b);
		
		return sum;
	}
	
	// When you are asked to add, you may be given four numbers. 
	// In this case, find a calculator � get it to add the first two, 
	// then get it to add the last two, then get it to add those two sums. 
	// Reply verbally (to your "boss") with the sum.
	public int add(int a, int b, int c, int d)
	{
		Calculator calc = new Calculator();
		
		int sum1 = calc.add(a, b);
		int sum2 = calc.add(c, d);
		int sum = calc.add(sum1, sum2);
		
		return sum;
	}
	
}
