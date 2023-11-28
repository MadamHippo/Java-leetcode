import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'countNumberOfSubarrays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */

    public static long countNumberOfSubarrays(List<Integer> arr, int k) {
    // Write your code here
    // Sliding Window Technique is a subset of Dynamic Programming.
    
    
    
    
    // Brute force / naiive for both negative and positive!!
    
    int currSum = 0;
    int i = 0; 
    int j = 0;
    int n = arr.size();
    int count = 0;
    
    // starting point:
    for (i = 0; i < n; i++) {
        currSum = 0;
        
        // try all subarrays starting with 'i'
        for (j = i; j < n; j++) {
            currSum = currSum + arr.get(j);
            
            if (currSum == k){
                count++;
            }
        }
    } return count;
    }
    
    
    
    
    /* if problem has no negatives (efficient!)
    
    int currentSum = arr.get(0);
    int left = 0;
    int i;
    int n = arr.size();
    int count = 0;
    
     // Pick a starting point
    for (i = 1; i <= n; i++){
        // If currentSum exceeds the sum,
        // then remove the starting elements
        
        while (currentSum > k && left < i-1){
            currentSum = currentSum - arr.get(left);
            left++;
        }
        
        // If currentSum becomes equal to sum,
        // increase count
        if (currentSum == k){
            count++;
            
        } else if (currentSum < k){
            currentSum += arr.get(i);
        }    
    }
    return count;
    }
    
    LINK: https://www.geeksforgeeks.org/find-subarray-with-given-sum/
    LINK 2: https://www.geeksforgeeks.org/find-subarray-with-given-sum-in-array-of-integers/
    */
    

    // if problem contains negatives, u can use hash map.
    
}
