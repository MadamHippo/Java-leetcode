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
     * Complete the 'isPrime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static int isPrime(long n) {
    // Write your code here
    // check if n is Prime.
    // then check whats the smallest divisor larger than 1.
    
    // long = a big integer (like double is a big float)
    // nothing to index, we're not using this for loop for index.
    
    // every number is divisble by itself so you shouldn't use <= ..if you do you would have passed every case where its not prime but failed every case looking for a prime.
    for (int divisor = 2; divisor < n; divisor++){
        if (n % divisor == 0){
            return divisor;
        }
    }
    return 1;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        int result = Result.isPrime(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
