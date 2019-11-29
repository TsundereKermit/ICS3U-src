public class TestDVD {

	public static void main(String[] args) {
		DVD m1= new DVD("Jaws", 135);
		DVD m2= new DVD("Moby Dick", 143);
		DVD m3= new DVD("Moby Dick", 147);
		DVD m4= new DVD("Moby Dick", 147);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m1.compareTo(m2));
		System.out.println(m2.compareTo(m1));
		System.out.println(m2.compareTo(m3));
		System.out.println(m3.compareTo(m4));
   
	}

}