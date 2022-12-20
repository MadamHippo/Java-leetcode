/*
problem: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*
        Find ALL Missing Numbers...
        Ok numbers went missing in an array to goes from [1, n]. Find those numbers, all of them.
        
        
        Set Method:
        
        Add all numbers in the input array to a SET.
        
        Now get all numbers from 1 to length of array...
        
        Now if numbers from the set is not contained in input array, put that number into Missing.
        
        Return Missing. 
        
        Time and Space: O(n)
        
        */
        
        
        
        //add all unique elements in the set

        Set<Integer> set = new HashSet<Integer>();
        
        for (int num:nums){
            set.add(num);
        }
        
        ArrayList<Integer> missing = new ArrayList<Integer>();
        
        
        // iterate through 1 to n and check if it is not present in the set
        // i is not index...this time...its the iteration variable, we can name it whatever we want... so like...
        // for (int num = 1; num <=nums.length; num++){

        for (int i = 1; i <=nums.length; i++){
            if (!set.contains(i)){
                missing.add(i); // <- @ Hippo. wait not nums[i]?? Answer: because i isn't index. It's a variable, variables can be named as anything. This time i is the literal values of the list, NOT index.
            }
        }
        return missing;
        
    }
}

