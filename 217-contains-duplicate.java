// problem: https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
     /*
     * Using Sort 
     
     * Time Complexity: O(N log N)
     
     * Space Complexity: O(Space used by sorting algorithm)

        
        
        if (nums == null || nums.length < 2) {
            return false;
        }
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;

        
    }
}

    
    */
        
        
        
     /**
     
      * Using HashSet
      *
      * Time Complexity: O(N)
      *
      * Space Complexity: O(N)

        
        if (nums == null){
            return false;
        }
        
        if (nums.length < 2){
            return false;
        }
        
        
        // Create a Integer HashSet that will contain Integer values:
        Set<Integer> set = new HashSet<Integer>();
        
        for (int num : nums){
            // set returns true if the set did not already contain the specified element...
            // if YOU didn't add anything mmore to the set then return true because it didn't add it since it was a duplicate and sets don't do duplicates...
            if (!set.add(num)){
                return true;
            }
            
        }
        return false;
    }
}

     */
        
        
        
        
     /**
     
      * Using HashSet...Another way of writing it.

      * Time Complexity: O(N)
     
      * Space Complexity: O(N)
      
    */
        
        if (nums.length < 2){
            return false;
        }
        
        
        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums){
            set.add(num);
        }
        // sets don't have order so use .size()
        if (set.size() != nums.length){
            return true;
        }
        return false;
    }
}
