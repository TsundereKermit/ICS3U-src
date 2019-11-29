// Original Author: Mrs. Cullum
// Modifications: Mr. Roller
// Date: Mar 23rd, 2016
// Description: This class accesses the Rectangle class and demonstrates
// its features.

public class ShortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	//We create 5 different rectangles
		//Each time a new one is created, the constructor method is called
		//to initialize the object.
		//The constructor method is never called again for this object.
		//You cannot call constructor methods like you do for other methods.
		
		Rectangle banana = new Rectangle();
		Rectangle rachael = new Rectangle(4,5);
		Rectangle bob = new Rectangle(5,2);
		Rectangle buddy = new Rectangle();
		Rectangle susan = new Rectangle(5,2);
		
		System.out.println("Banana's length: " + banana.getLength());
		System.out.println("Banana's width: " + banana.getWidth());
		System.out.println("Rachael's perimeter: " + rachael.getPerimeter());
		System.out.println("Bob's ID: " + bob.getRectangleID());
		System.out.println("Buddy's area: " + buddy.getArea());
		
		
		//getNumberOfRectangles is a CLASS method, so you call it with the
		//class name, rather than with an object name.
		System.out.println("Number of Rectangles: " 
						+ Rectangle.getNumberOfRectangles());

		
	}

}
