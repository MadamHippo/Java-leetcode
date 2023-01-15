class Solution {
    public int[] twoSum(int[] nums, int target) {

        /* brute force:
        for (int i=0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        } return nums;
        */
      
      

        // efficient using hashy map (hashkey is the target-index, hashvalue is the index):

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null){
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
