/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

Overall summary:
Creating two separate method functions, 1 for first index of position and 1 for last position index. Use basically a binary search for both of these first and last, but you want to continue searching and updating the index to the new middle.
*/



class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // this is binary search, O(log n), "sorted array" "target" or "logn" = all binary search
        
        
        // results array w/ size of 2
        int[] answer = new int[2];
        
        
        // modularizing
        answer[0] = findStartIndex(nums, target);
        answer[1] = findEndIndex(nums, target);
        return answer;
    }
    
    
    
    
    
    
    // make another function method...
    public int findStartIndex(int[] nums, int target){
        
        // initalized at -1 for easy return
        int index = -1;
        
        // traditional binary search
        int start = 0;
        int end = nums.length-1;
        
        while (start<=end){
            
            // Java integer overflow protection to find the middle point
            int middle = start + (end-start)/2;
            
            // logic of the loop:
            // if nums[middle] is bigger than target....we haven't found the target yet so we need to look at numbers in this sorted array that's smaller...so make end equal middle - 1.
            // keep searching through the array until you're done with while loop.
            if (nums[middle] >= target){
                end = middle-1;
            } else {
                start = middle+1;
            }
                
            // if nums[middle] is equal to target, update the index variable to the new middle point value.    
            if (nums[middle] == target){
                index = middle;
            }
        }
        
        
        
        return index;
    }
    
    // make another function method...   
    // you're calling two function methods, 2 different times
    public int findEndIndex(int[] nums, int target){
        int index = -1;
        
        int start = 0;
        int end = nums.length-1;
        
        while (start <= end){
            int middle = start + (end-start)/2;
            
            if (nums[middle] <= target){
                start = middle+1;
            } else {
                end = middle-1;
            }
            
            // everytime we find the index is equal to target, we need to update the 
            if (nums[middle] == target){
                index = middle;
            }
        }
        
        return index;
    }
}
