/*
744. Find Smallest Letter Greater Than Target

You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 

Constraints:

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.

Hint:
Try to find whether each of 26 next letters are in the given string array.

*/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        /* You're doing a brute force linear search O(n) whereas this is a classic binary search O(log n) problem. This solution will not be acceptable in any interview.
        
        // go through each element via index in letters...
        for (int i=0; i<letters.length; i++){
            
            // if the letter element is bigger than target...
            if (letters[i] > target){
                // return target
                return letters[i];
            }
        }
        return letters[0];
        */
        
        // Optimized solution (binary search) is the one you should use in an interview!!!
        
        // to handle the wrap around, we'll set result's default to the first letter of the character array
        int answer = letters[0];
        
        // perform regular binary two-pointer search...
        int left_pointer = 0;
        int right_pointer = letters.length-1;
        
        
        while (left_pointer <= right_pointer){
            // find middle element by dividing total in 2...but the Java way
            int middle = left_pointer + (right_pointer - left_pointer) / 2;
            
            // if tar
            if (target >= letters[middle]) {
                left_pointer = middle + 1;
            } else {
                right_pointer = middle - 1;
                
            }
                
            
        } //wrap around condition met (when s>e)
        return letters[left_pointer%letters.length];     

    }
}

     
     
