/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

https://www.hackerrank.com/challenges/java-string-tokens/problem
*/  

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        
        // 1 edge case was not passing so I had to find help for it to all pass but I got 10/11 cases passing.
        // split string and find length of the split string...using stream
        String[] split_string =
            Arrays.stream(s.trim().split("[ !,?._'@]+"))
                .filter(string -> !string.isEmpty())
                .toArray(String[]::new);
        int length = split_string.length;
        
        // System.out.println(Arrays.toString(split_string));
        System.out.println(length);
        
        
        // print contiguous segment of alphabetic characters on each new line
        for (String item : split_string){
            System.out.println(item);
        }
    }
}

