
public class MyCircle {

    private double radius;
    private String units;
    
    public final static double PI = Math.PI;
    private static int numCircles;
    
    public MyCircle (double r, String u) {
        setRadius(r);
        setUnits(u);
        numCircles++;
    }
    
    public MyCircle (double r) {
        this(r, "units");
    }
    
    public MyCircle() {
        this (1);
    }
    
    public void setRadius (double r) {
        if (r>0)
            radius=r;
        else 
            radius=1;
    }
    
    public void setUnits (String s) {
        units=s;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getDiameter() {
        return radius*2;
    }
    
    public String getUnits() {
        return units;
    }
    
    public static int getNumCircles() {
        return numCircles;
    }
    
    public double getCircumference() {
        return PI*radius*2;
    }
    
    public double getArea() {
        return PI*radius*radius;
    }
    
    public static double getCircumference(double r) {
        if (r>0)
            return 2*r*PI;
        else
            return -1;
    }
    
    public static double getArea(double r) {
        if (r>0)
            return r*r*PI;
        else 
            return -1;
    }
    
    public boolean equals(Object c){	
	boolean trueFalse = false;	
	if (c instanceof MyCircle)		
            if ( ((MyCircle) c).radius == this.radius)
		trueFalse = true;
	return trueFalse;
    } 
    
    public String toString(){
		
	String back;
	back = "The radius is " + radius + " " + units;
	return back;
    }
}
