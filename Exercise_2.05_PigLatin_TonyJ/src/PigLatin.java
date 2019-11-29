/*
* Description: Translates sentences/words to pig latin
*
* Author: Tony Jiang
* Date: November 18, 2018
*/

/*
public class PigLatin {
        
        public static String translateWord(String word) {
            char a = 'a';
            char e = 'e';
            char i = 'i';
            char o = 'o';
            char u = 'u';
            char y = 'y';

            int start = 0;
            int firstVowel = 0;
            int end = word.length();
            //String quCheck=word.substring(0,2); breaks my translateSentence
            for(int j = 0; j < end; j++) {
                char c = Character.toLowerCase(word.charAt(j));
                if(c == a || c == e || c == i || c == o || c == u || c == y) {
                    firstVowel = j;
                    break;
                }
            }
            if (quCheck.compareTo("qu")==0) {
                String endString = word.substring(2,end);
                return endString+"-"+quCheck+"ay";
            }
            else
            //this also breaks my translateSentence
            
            if(start != firstVowel) {
                String startString = word.substring(firstVowel, end);
                String endString = word.substring(start, firstVowel) + "ay";
                return startString+"-"+endString;
            }
            else if(start == firstVowel) {
                return word+"-ay";
            }
            
            return word;
        }
        
        public static String translateSentence (String s) {
            String end="";
            while (s.length()>0) {
                    int firstSpace=s.indexOf(" ");
                    
                    if (s.lastIndexOf(" ")!=-1) {
                        String word=s.substring(0,firstSpace);
                        String newWord=translateWord(word);
                        firstSpace++;
                        s=s.substring(firstSpace,s.length());
                        translated=translated+newWord+" ";
                    }
                    else {
                        String word=s.substring(0,s.length());
                        String newWord=translateWord(word);
                        s="";
                        translated=translated+=newWord;
                    }
                    
                    
                    if (firstSpace!=-1) {
                        String word=s.substring(0,firstSpace);
                        String translatedWord=translateWord(word);
                        firstSpace++;
                        s=s.substring(firstSpace,s.length());
                        end+=translatedWord+" ";
                    }
                    else {
                        String translatedWord=translateWord(s);
                        s="";
                        end+=translatedWord;
                    }
                    
                    
            }
            return end;
        }
        
}
*/
public class PigLatin {
	
	public static String translateWord(String word)
	{	
		if(isVowel(word.charAt(0)))
			return word + "-ay";
		
		if(word.charAt(0) == 'q' && word.charAt(1) == 'u')
			return word.substring(2) + "-" + word.substring(0,2) + "ay";

		int vowelIndex = vowelFinder(word);
		return word.substring(vowelIndex) + "-" 
				+ word.substring(0, vowelIndex) + "ay";
	}
	
	public static String translateSentence(String sentence)
	{
		String newSentence = "";
		
		while(sentence.length() > 0)
		{
			int isCommaPresent = -1;
			int indexOfSpace = sentence.indexOf(" ");
			String word = "";
			
			if (indexOfSpace < 0)
				word = sentence;
			else
				word = sentence.substring(0, indexOfSpace);
			
			isCommaPresent = word.indexOf(",");
			
			if (isCommaPresent >= 0)
				word = word.replace(",","");
			
			word = translateWord(word);	
			
			if (isCommaPresent >= 0)
				word = word + ",";
			
			newSentence = newSentence + " " + word;
			
			if (indexOfSpace < 0)
				sentence = "";
			else
				sentence = sentence.substring(indexOfSpace+1);
		}
		
		return newSentence;
	}
	
	private static boolean isVowel(char letter)
	{
		if (letter == 'a' || letter == 'e' ||
			letter == 'i' || letter == 'o' ||	
			letter == 'u' || letter == 'y')
			return true;

		return false;
	}
	
	private static int vowelFinder(String w)
	{
		for (int i = 0; i < w.length(); i++)
		{
			if(isVowel(w.charAt(i)))
				return i;		
		}
		return 0;
	}

}
