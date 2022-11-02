/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"

*/

class Solution {
    public String removeDuplicates(String s) {
        
        // itialize stack
        Stack<Character> stack = new Stack();
        
        // iterate through string
        for (char letter : s.toCharArray()){
            //check if top of stack is equal to this character
            if (!stack.isEmpty() && stack.peek() == letter) {
                // remove char
                stack.pop();
                
            } else {
                // add to stack
                stack.push(letter);
            }
        }
        // use string builder for result
        StringBuilder result = new StringBuilder();
        // empty stack out (everything left is not an adjacent duplicate)
        while (!stack.isEmpty()){
            result.append(stack.pop());


    }   // result
        return result.reverse().toString();
    
    } // closing method bracket
} // closing class bracket
