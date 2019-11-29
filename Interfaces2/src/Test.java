public class Test {
	public static void main(String[] args) {

		Point point_old = new Point(1,1);
		Circle circle_old = new Circle(2);
		Cylinder cylinder_old = new Cylinder(3,3);
		
		//also you can use the name of the interface to instantiate
		//and all of the agreed upon interface methods will work
		Shapeable point_new = new Point(7,11);
		Shapeable circle_new = new Circle(3.5);
		Shapeable cylinder_new = new Cylinder(8,4.5);
		
		System.out.print(point_new.getName() + " ==> " + point_new);
		System.out.println(" Area: " + String.format("%.2f", point_new.area()) 
		+ " Volume: " + String.format("%.2f", point_new.volume()));
		
		System.out.print(circle_new.getName() + " ==> " + circle_new);
		System.out.println(" Area: " + String.format("%.2f", circle_new.area()) 
		+ " Volume: " + String.format("%.2f", circle_new.volume()));
		
		System.out.print(cylinder_new.getName() + " ==> " + cylinder_new);
		System.out.println(" Area: " + String.format("%.2f", cylinder_new.area()) 
		+ " Volume: " + String.format("%.2f", cylinder_new.volume()));
				
		System.out.println();

 		
        //	BUT, you can't use any other features from the respective classes
//     System.out.println("But the Height of a Cylinder is "
//        		+ "specific to the cylinder object...");
        //gives a compiler error
        //System.out.println("Cylinder height: " + cylinder_new.getHeight());
        //but we can still cast to a Cylinder to regain access to all Cylinder functionality
//        System.out.println(((Cylinder)cylinder_new).getHeight());
        //or we can use the following trick...making a copy with cast and then using the copy
//        Cylinder d = (Cylinder)cylinder_new;
//        System.out.println("Cylinder height: " + (d.getHeight()));
//        System.out.println();
        //And of course if it was originally created as a cylinder then 
//        System.out.println("Cylinder height: " + cylinder_old.getHeight());
//        System.out.println();
/*		
		//Can send any Shapeable object and expect a reasonable answer!
          System.out.println("And the Volume Squared is: " + 
		  String.format("%.2f", squareVolume(point_new)));
          System.out.println("And the Volume Squared is: " + 
		  String.format("%.2f", squareVolume(circle_new)));
          System.out.println("And the Volume Squared is: " + 
		  String.format("%.2f", squareVolume(cylinder_new)));
        //But of course as expected this also works...
          System.out.println("And the Volume2 Squared is: " + 
          String.format("%.2f", squareVolume(point_old)));
          System.out.println("And the Volume2 Squared is: " + 
          String.format("%.2f", squareVolume(circle_old)));
          System.out.println("And the Volume2 Squared is: " + 
          String.format("%.2f", squareVolume(cylinder_old)));
 */  
	}
	
	//The beauty here is that all objects that have Shapeable implemented
	//are guaranteed to have the volume function working and hence
	//we can send any of those objects and return a reasonable answer
	public static double squareVolume(Shapeable s1)
	{
		return s1.volume()*s1.volume();
		//Note: making use of one of the agreed upon methods
	}
}
