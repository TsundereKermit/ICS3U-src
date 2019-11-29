/** 
 * Describes a DVD object.
 * NOTE: Need to add make this a Comparable Object!
 * @author Mr. Roller
 * @since Nov 27th, 2016
 */
public class DVD implements Comparable
{
   private String movieName;
   private int length;
   
   public DVD()
   {
	   this("No Name", 0);
   }
   
   public DVD(String n)
   {
	   this(n, 100);
   }
   
   /**
    * Constructor method to create a new DVD with a 
    * name stored in n and length stored in d
    * @param n
    * @param d
    */
   public DVD(String n, int d)
   {
	   movieName=n;
	   
	   if (d>0)
	   {
		   length=d;
	   }
	   else
	   {
		   length=-1; //indicate an error
	   }
	   length=d;
   }
   
   public void setMovieName(String m)
   {
	   movieName=m;
   }
   
   public void setLength(int i)
   {
	   length=i;
   }
   
   public String getMovieName()
   {
	   return movieName;
   }
   
   public int getLength()
   {
	   return length;
   }
   
   /**
    * @return A string representation of the DVD object that call the method
    * @see java.lang.Object#toString()
    */
   @Override 
   public String toString()
   {
	   return "DVD Name: " + movieName + "\nLength: " + length +"\n";
   }
   
   @Override
   public int compareTo (Object o) {
       
       DVD david = (DVD) o;
       
       int result = getMovieName().compareTo(david.getMovieName());
       
       if (result==0) {
           if (david.getLength()>getLength())
               return -1;
           else if (david.getLength()<getLength())
               return 1;
           else
               return 0;
       }
       else if (result<0)
           return -1;
       else
           return 1;
   }
   
}  //end class