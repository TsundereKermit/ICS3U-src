public class Acrobat {

	private int numExercises=0;
	
	public String clap(int n) {
		String clapping="";
		
		for (int i=0; i<n; i++)
		{
			clapping += "CLAP ";
			numExercises++;
		}
		return clapping;
	} //end of clap method
	
	
	public String kneeBend(int n) {
		String kneeBending = "";
		
		for (int i=0; i<n; i++)
		{
			kneeBending += "KNEEBEND ";
			numExercises++;
		}
		return kneeBending;
	}
	
	public int count()
	{
		return numExercises;
	}

}