// Definition of class Circle

public class Circle implements Shapeable 
{
	private double radius;
	
	//no argument constructor
	public Circle()
	{
		setRadius(0);
	}

	//constructor
	public Circle(double circleRadius)
	{
		setRadius(circleRadius);
	}
	
	//set radius of Circle
	public void setRadius(double circleRadius)
	{
		radius = (circleRadius >= 0 ? circleRadius: 0);
	}
	
	//get radius of Circle
	public double getRadius()
	{
		return radius;
	}
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double volume()
	{
		return 0.0;
	}
	
	public String toString()
	{
		return "Radius = " + radius;
	}
	
	//return shape name
	public String getName()
	{
		return "Circle";
	}
	
} //end class Circle
