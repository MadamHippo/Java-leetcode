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

    public static int getMinDeletions(String s) {

    /*
    
    [PROBLEM PROMPT]
    
    Give a string, reduce it in such a way that all of its substrings are distinct. To do so, you may delete any characters at any index. 
    What is the minimum number of deletions needed?
    
    Example: "abab"
    By deleting one "a" and one "b", the string becomes "ab" or "ba" so all of its substrings are distinct. The solution is 2 deletions.
    
    Return the number of times you deleted something.
    
    
    
 
    
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     
     
     // Solution 1: 
     
     NOT MY CODE:
     
    int length = s.length();

    int minMoves = 0;
    
    int charBank[] = new int[26];
    for (int i = 0; i < charBank.length; i++)
    {
        charBank[i] = 0;
    }
    
    for (int i = 0; i < length; i++)
    {
        if (charBank[s.charAt(i) - 'a'] == 0)
        {
            minMoves++;
            charBank[s.charAt(i) - 'a']++;
        }
    }
    return (length - minMoves);
    
    */
     

    // My solution: 

    Set<Character> set1 = new HashSet<>();
    
    int minMoves = 0;
    for (char c : s.toCharArray()){
        if (!set1.contains(c)){
            set1.add(c);
        } else {
            minMoves++;
        }
    }
    return minMoves;
    }
}














public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getMinDeletions(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
