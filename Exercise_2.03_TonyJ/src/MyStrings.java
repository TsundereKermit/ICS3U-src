/*
* Description: This is the methods class for Exercise 2.03, most of these methods
* will manipulate strings to return a desired result
* 
* Author: Tony Jiang
* Date: November 1, 2018
*/


//import java.util.Arrays;
public class MyStrings {
            
            
            public static String convertDate(String s) {
                int temp1=s.indexOf("/");
                String month=s.substring(0,temp1); //this gets the month 
                temp1++;
                int temp2=s.indexOf("/",3);
                String date=s.substring(temp1,temp2); //this gets the date
                temp2++;
                int temp3=s.length();
                String year=s.substring(temp2,temp3); //this gets the year
                return date+"-"+month+"-"+year;
            }
            
            public static long convertPhoneNum(String s) {
                s=s.replaceAll("-",""); //
                s=s.replace("(","");
                s=s.replace(")","");
                long returnLong = Long.valueOf(s); //converts the string to a long
                return returnLong;
            }
            
            public static String convertName(String s) {
                int temp1=s.indexOf(" ");
                String first=s.substring(0,temp1); //gets the first name
                int temp2=s.lastIndexOf(" ");
                temp2++;
                int temp3=s.length();
                String last=s.substring(temp2,temp3); //gets the last name
                return last+", "+first;
            }
            
            public static String reverseString(String s) {
                String returnString="";
                int temp1=s.length();
                temp1--;
                for (int i=0; i<=temp1; i++) {
                    char temp2=s.charAt(temp1-i);
                    returnString+=temp2;
                }
                return returnString;
            }
            
            /*
            public static boolean areAnagrams(String s1, String s2) {
                boolean areAnagrams=false;
                s1=s1.toLowerCase();
                s2=s2.toLowerCase();
                s1=s1.replace(" ",""); //removes the spaces
                s2=s2.replace(" ",""); //removes the spaces
                s1=s1.replaceAll("\\W",""); //removes all special chars
                s2=s2.replaceAll("\\W",""); //removes all special chars
                if (s1.length()==s2.length()) {
                    char[] s1AsChar = s1.toCharArray();
                    char[] s2AsChar = s2.toCharArray();
                    Arrays.sort(s1AsChar);
                    Arrays.sort(s2AsChar);
                    areAnagrams = Arrays.equals(s1AsChar, s2AsChar); //compares the two strings
                }
                return areAnagrams;
            }
            */
            
            public static boolean areAnagrams(String s1, String s2) {
                
                //removes spaces, special chars, and makes both strings lower case
                s1=s1.toLowerCase(); 
                s1=s1.replaceAll("\\W","");
                s1=s1.replace(" ","");
                s2=s2.toLowerCase(); 
                s2=s2.replaceAll("\\W","");
                s2=s2.replace(" ","");
                
                if (s1.length()==s2.length()) { //checks for length of both strings
                    
                    for (int i=0; i<s1.length(); i++) { //loops the length of s1
                        char temp1=s1.charAt(i);
                        for (int j=0; j<s2.length(); j++) { //loops the length of s2
                            char temp2=s2.charAt(j);
                            if (temp1==temp2) { //checks for the same char in s1&s2
                                String half1=s2.substring(0,j);
                                j++;
                                String half2=s2.substring(j, s2.length());
                                s2=half1+half2;
                                break;
                            }
                            //returns false if this letter does not appear in s2
                            else if (j+1==s2.length()) 
                                return false;
                        }
                    }
                }
                else //returns false if the length of both strings aren't the same
                    return false;
                return true;
            }
}
