// problem: https://www.hackerrank.com/challenges/java-strings-introduction

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        
        
        //  Sum of A + B
        int sum = A.length() + B.length();
        System.out.println(sum);
        
        
        // For the second line, write Yes if A is lexicographically greater than  B otherwise print No instead.
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        
        // Capitalize the first letter in  A and B and print them on a single line, separated by a space.
        // Getting Characters by Index from a String. The index of the first character is 0; the index of the last is length()-1
        A = A.substring(0, 1).toUpperCase()+A.substring(1);
        // System.out.println(A);
        
        B = B.substring(0,1).toUpperCase()+B.substring(1);
        
        // System.out.println(B);

        System.out.println(A + " " + B);
        
        
        
    }
}



