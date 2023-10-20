/* Problem: A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward or forward. Given a string , print Yes if it is a palindrome, print No otherwise.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int end = A.length()-1;
        
        /* Enter your code here. Print output to STDOUT. */
        boolean isPal = true;
        
        for (int i=0; i < A.length(); i++){
            if (A.charAt(i) != A.charAt(end)){
               isPal = false;
               System.out.println("No");
               break;
            } else {
               end--;
            }
        }
        if (isPal == true){
            System.out.println("Yes");
        }
    }
}


