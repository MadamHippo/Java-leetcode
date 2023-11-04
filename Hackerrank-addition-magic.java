import java.io.*;
import java.math.RoundingMode;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//This one is about method overloading.
// Addition Magic: Using method overloading, complete the implementation of the class AdditionMagic with 3 methods:

class AdditionMagic{

    // method overloading...

    public String add(double a, String b){
        return a + b;
    }

    public String add(double a, double b){
        double c = a + b;
        c = Math.round(c * 100.0) / 100.0;
        return Double.toString(c);
    }


    public String add(String a, String b) {
        return a + b;
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        int n = Integer.parseInt(sub);
        for(int i=0;i<n;i++) {
            String[] temp = sc.nextLine().split(" ");
            Boolean  firstDouble = isFloat(temp[0]);
            Boolean  secondDouble = isFloat(temp[1]);
            AdditionMagic additionMagic = new AdditionMagic();
            if(firstDouble && secondDouble){
                System.out.println(additionMagic.add(Double.parseDouble(temp[0]), Double.parseDouble(temp[1])));
            }else {
                System.out.println(additionMagic.add(temp[0], temp[1]));
            }
        }
    }
    private static final Pattern DOUBLE_PATTERN = Pattern.compile(
            "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)" +
                    "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|" +
                    "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))" +
                    "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");

    public static boolean isFloat(String s)
    {
        return DOUBLE_PATTERN.matcher(s).matches();
    }
}
