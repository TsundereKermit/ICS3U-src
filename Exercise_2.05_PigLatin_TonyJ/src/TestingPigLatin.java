/*
* Description: Tests the pig latin translation methods
*
* Author: Tony Jiang
* Date: November 18, 2018
*/


public class TestingPigLatin {

	public static void main(String[] args) {

		//System.out.println("button --> " + PigLatin.translateWord("button"));
		
		PLTester("button");
		PLTester("star");
		PLTester("three");
		PLTester("question");
		PLTester("eagle");
		PLTester("style");
		PLTester("system");
		PLTester("squeal");
		PLTester("you");
		PLTester("fly");
		PLTester("bye");
		PLTester("yttrium");
		PLTester("MSN");
		PLTester("Cianci");
		
		
		PLSTester("Happy Birthday Leo");
		PLSTester("Sorry for missing your birthday James");
		PLSTester("Good work Amelie");
		PLSTester("Wheres Ryan Frohar");
	}
	
	public static void PLTester(String word)
	{
		System.out.println(word + " --> " + PigLatin.translateWord(word));
	}
	
	public static void PLSTester(String sentence)
	{
		System.out.println(sentence + " --> " + PigLatin.translateSentence(sentence));
	}

}