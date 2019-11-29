/* Original: Mrs. Cullum
 * Modifications: Mr. Roller
 * Date: Mar 23, 2016
 * Description: This program allows us to create rectangles
 * defining the length and width while keeping track of each
 * triangle created and assigning each new rectangle an ID.
 * Accessor methods such as getArea, getPerimeter can also be
 * accessed
 */
public class Rectangle {

	//static (or Class) variables
	private static int numRectangles = 0;
	
	//instance variables
	private int length;
	private int width;
	private final int RECTANGLE_ID;
	
	// constructor with parameters
	// @param len
	// @param wid
	public Rectangle (int len, int wid)
	{
		//initialize instance variables
		length = len;
		width = wid;
	    
		numRectangles++; //note: don't need a constuctor
						//to initialize a static variable
		RECTANGLE_ID = numRectangles;
	}
	
	//non-parameterized overloaded constructor
	public Rectangle ()
	{
		length = 6;
		width = 7;
		
		numRectangles++;
		RECTANGLE_ID = numRectangles;
	}
	
	//accessor method - accesses length
	//@return length of rectangle
	public int getLength()
	{
		return length;
	}
	
	//accessor method - accesses width
	//@return width of rectangle
	public int getWidth()
	{
		return width;
	}
	
	//mutator method - sets length
	//@param len
	//@return void
	
	public void setLength(int len)
	{
		length = len;
	}
	
	//mutator method - sets width
	//@param wid
	//@return void
	public void setWidth(int wid)
	{
		width = wid;
	}
	
	//calculate the area of the rectangle
	//@return area of rectangle
	public int getArea()
	{
		return(length*width);
	}
	
	//calculate the perimeter of the rectangle
	//@return perimeter of rectangle
	public int getPerimeter()
	{
		return(2*length + 2*width);
	}
	
	//accessor method to get the rectangleID
	//@return rectangleID
	public int getRectangleID()
	{
		return RECTANGLE_ID;
	}
	
	//accessor method to get the number of rectangles
	//@return numRectangles
	//Note: numRectangles is a static variable so this
	//must be declared a static method
	public static int getNumberOfRectangles()
	{
		return numRectangles;
	}
	
	
} //end Rectangle class
