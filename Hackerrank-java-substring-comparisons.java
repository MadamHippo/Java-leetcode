/*
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
*/

    public static String getSmallestAndLargest(String s, int k) {
        
        
        String smallest = s.substring(0, k);
;
        String largest = s.substring(0, k);
;
        int length = s.length();
        // Complete the function
        
        for (int i=0; i<=length-k; i++){
            // -k because bc you will go out of bounds if you keep looping past the length of the string itself
            
            if(s.substring(i, i+k).compareTo(smallest) <= 0){
                smallest = s.substring(i, i+k);
            }
            
            if(s.substring(i, i+k).compareTo(largest) >= 0){
                largest = s.substring(i, i+k);
            }
        }
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

