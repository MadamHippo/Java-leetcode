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
import java.util.Collections;



class Result {

    /*
     * Complete the 'doubleSize' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY arr
     *  2. LONG_INTEGER b
    
     NOTE: ARR MAY NOT BE IN ORDER --
     */
     
     

    public static long doubleSize(List<Long> arr, long b) {
    
    /* Write your code here:
    
    Run time: O(nlogn), space is O(1)
    
    // Sort and the search method...
    
    Collections.sort(arr);
    
    for (long each:arr){
        // For primitive data types you should use ==.
        // And for objects you should use the equals function.
        if (each == b){
            b = each*=2;
        }
    }
    return b; 
    }
    */
    
    
    
    
    // Using HashSet O(n) - fastest way.
    
    HashSet<Long> set = new HashSet<>();
    
    for (long each:arr){
        set.add(each);
    }
    
    while (set.contains(b)){
        b = b*2;
    }
    return b;
    }
    
    // helpful explanation of the exact problem: 
    // https://www.geeksforgeeks.org/find-final-value-if-we-double-after-every-successful-search-in-array/
    

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Long::parseLong)
            .collect(toList());

        long b = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.doubleSize(arr, b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
