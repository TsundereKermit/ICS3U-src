//Definition of class Point

public class Point implements Shapeable
{
	private int x, y; //coordinates of the Point
	
	//no-argument constructor
	public Point()
	{
		setPoint(0,0);
	}
	
	//constructor
	public Point(int xCoordinate, int yCoordinate)
	{
		setPoint(xCoordinate, yCoordinate);
	}
	
	//Set x and y coordinates of Point
	public void setPoint(int xCoordinate, int yCoordinate)
	{
		x = xCoordinate;
		y = yCoordinate;
	}
	
	//get x coordinate
	public int getX()
	{
		return x;
	}
	
	//get y coordinate
	public int getY()
	{
		return y;
	}
	
	//convert point into String representation
	public String toString()
	{
		return "[" + x + ", " + y + "]";
	}
	
	//calculate area
	public double area()
	{
		return 0.0;
	}
	
	//calculate volume
	public double volume()
	{
		return 0.0;
	}
	
	//return shape name
	public String getName()
	{
		return "Point";
	}
	
} //end class Point

