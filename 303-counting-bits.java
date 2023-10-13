// Problem: https://leetcode.com/problems/counting-bits/
// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.


class Solution {
    public int[] countBits(int n) {
        
        // Initialize an empty integer array to store the results
        int[] answer = new int[n+1];
    
        // Edge case: If n is 0, there are no bits to count, so return the empty array
        if (n == 0){
            return answer;
        }
        
        // Main code: Iterate through the integers from 1 to n
        for (int i = 1; i <= n; i++){
            
            // If the current number is even
            if (i % 2 == 0) {
                answer[i] = answer[i/2]; // The number of set bits is the same as half of the previous number
            } else {
                // If the current number is odd
                answer[i] = answer[i-1] + 1; // The number of set bits is one more than the previous number
            }
        }
        return answer; // Return the array with the count of set bits for each number from

    
