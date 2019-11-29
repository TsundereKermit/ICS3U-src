/*
*Description: this is the second part of "Useful, contains 
*all the methods
*Author: Tony Jiang
*Date: October, 28, 2018
*/


import java.text.NumberFormat;
import java.util.Locale;

public class Useful {

    
    public static int getRandomInt(int n1, int n2) {
        int r=0;
        if (n1>n2) 
        r = (int) (Math.random() * (n1 - n2)) + n2;
        else 
        r = (int) (Math.random() * (n2 - n1)) + n1;
        return r;
    }
    
    public static double getRandomDouble(int n1, int n2) {
        double r=0;
        if (n1>n2) 
        r = (Math.random() * (n1 - n2)) + n2;
        else 
        r = (Math.random() * (n2 - n1)) + n1;
        return r;
    }
    
    public static int getRounded(double n1) {
        return (int) (n1+0.5);
    }
    
    public static double getRounded(double n, int d) { int temp1; double temp2;
        temp1= (int) (n*Math.pow(10,d)+0.5);
        temp2= (double) (temp1/Math.pow(10,d));
        return temp2;
    }
    
    public static String getMoney(double n) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String back = format.format(n);
        return back;
    }
}

