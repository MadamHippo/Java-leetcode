/*
136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
https://www.codingbroz.com/single-number-leetcode-solution/
 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1

Constraints: 
Each element in the array appears twice except for one element which appears only once.

*/


class Solution {
    public int singleNumber(int[] nums) {
        // we use bitwise XOR to solve this problem : It works only as long as you know each other number appears exactly twice
        // If input bits are the same, then the output will be false(0) else true(1).
        // You must implement a solution with O(n) and space O(1)
        
        int result = 0;
        
        for (int num : nums) {
            result ^= num; // 0^=2 is 2.....
                           // 2^=2 is 0......
                           // 0^=1 is 1.......final output is 1.
        } return result;        


        
    }
}
