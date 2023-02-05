// https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        // creating scanner:
        Scanner in = new Scanner(System.in);
        
        // n is scanner next int...
        int n = in.nextInt();
        // counter
        int count = 0;
        
        // creating an array of size n
        int[] array = new int[n];
        
        // goes through array via index of n
        for (int i = 0; i < n; i++){
            
            // sum
            int sum = 0;
            
            array[i] = in.nextInt();
            
            for (int j = i; j >= 0; j--){
                sum += array[j];
                if (sum < 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
