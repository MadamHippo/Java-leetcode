// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        /* Brute Force Approach:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution found, return the original array (this might not be appropriate)
        return nums;
        */

        // Efficient Approach using Hash Map (hash key is the target - element value, hash value is the index):
        
        // Create a hash map to store complements and their indices
        Map<Integer, Integer> complements = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                // If complement is found, return the indices
                return new int[]{i, complementIndex};
            }
            // Calculate the complement for the current element and store it with its index
            complements.put(target - nums[i], i);
        }
        // If no solution found, return the original array (this might not be appropriate)
        return nums;
    }
}
