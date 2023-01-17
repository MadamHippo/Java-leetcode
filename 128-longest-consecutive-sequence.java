// Problem link: https://leetcode.com/problems/longest-consecutive-sequence/description/
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence. You must write an algorithm that runs in O(n) time.

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums){
            numSet.add(num);
        }

        int lengthSoFar = 0;
    
        for (int num : nums){
            // look left to see if any neighbors
            if (!numSet.contains(num-1)){
                int length = 0;
                while (numSet.contains(num + length)){
                    length++;
                }
                lengthSoFar = Math.max(length, lengthSoFar);
            }

        }
        return lengthSoFar;
        
    }
}
