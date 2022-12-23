// problem: https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        /*
        write in O(log n) time, everytime you can eliminate by half until you find target. Log(base2 of N)...how many times n can be divided by 2.
        # pre-sorted in ASCENDING order
        
        # Two pointers, Left at start and Right at the end.
        # Inside each while loop iteration, recalcuate the new midway point and see if it's bigger or smaller than target
        
        # If midway point value is larger than target...
            Move the right pointer to new_mid - 1;
        # If midway point value is smaller than target...
            Move left pointer to new_mid +1;
            
        # Else if it lands on the exact target then just return the new midway point
        
        # Return -1 if nothing is found outside of the while loop
        */
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right){
            
            int new_middle = (left + right) / 2;
            
            if (nums[new_middle] > target){
                right = new_middle-1;
            }
            if (nums[new_middle] == target){
                return new_middle;
            }
            if (nums[new_middle] < target){
                left = new_middle+1;
            }
        }
        return -1;
        
        
        
    }
}
