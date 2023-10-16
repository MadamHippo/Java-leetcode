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
     * Complete the 'closedPaths' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     
     You are given a number, you have to use math tricks to see if these line of numbers have closed paths, and then count how many closed paths there are altogether.
     */

    public static int closedPaths(int number) {
    
    // We need to take each digit out of int number, can be done with math tricks % and / and then use stack to get the order back since it defaults to reverse order...
    
    // OR we can just convert to String, then do a toCharArray or split string.
    
    // Magic Math % Way:
    
    int lastDigit = 0;
    int sum = 0;
    while (number > 0){
        lastDigit = number % 10;
        if (lastDigit == 0 || lastDigit == 4 || lastDigit == 6 || lastDigit == 9){
            sum+=1;
        }
        
        if (lastDigit == 8){
            sum+=2;
        }
        
        
        number/= 10;
    }
    return sum;
    
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.closedPaths(number);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
