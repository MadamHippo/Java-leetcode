// problem: https://leetcode.com/problems/counting-bits/
// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.


class Solution {
    public int[] countBits(int n) {
        
        // initalize empty int array to return later
        int[] answer = new int[n+1];
        
    
        // edge case:
        if (n == 0){
            return answer;
        }
        
        // main code:
        for (int i = 1; i <= n; i++){
            
            // even
            if (i % 2 == 0) {
                answer[i] = answer[i/2];
            } else {
                // odd
                answer[i] = answer[i-1] + 1;
            }
        }
        return answer;
    }
}

    
