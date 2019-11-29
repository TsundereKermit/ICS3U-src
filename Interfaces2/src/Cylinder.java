//Definition of class Cylinder

public class Cylinder implements Shapeable 
{
	private double radius;
	private double height; 
	
	//no-argument constructor
	public Cylinder()
	{
		this(0,0);
	}
	
	//constructor
	public Cylinder(double cylinderHeight, double cylinderRadius)
	{
		setHeight(cylinderHeight);
		setRadius(cylinderRadius);
	}
	
	public void setRadius(double cylinderRadius)
	{
		radius = (cylinderRadius >= 0 ? cylinderRadius : 0);
	}
	
	public void setHeight (double cylinderHeight)
	{
		height = (cylinderHeight >= 0 ? cylinderHeight :0);
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double area()
	{
		return 2 * Math.PI * radius * radius + 2*Math.PI * radius * height;
	}
	
	//calculate the volume of a Cylinder
	public double volume()
	{
		return Math.PI * radius * radius * height;
	}

	public String toString()
	{
		 return "Radius = " + radius + " , Height = " + height;
	}
	
	public String getName()
	{
		return "Cylinder";
	}
	
} //end class Cylinder
