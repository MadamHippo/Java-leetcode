class Solution {
    public int[] sortedSquares(int[] nums) {
        
        /* Sort O(nlogn) using array.
        
        int[] array = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
            
            // add element to the new array
            array[i] = nums[i];
        }

        
        Arrays.sort(array);
        
        return array;
        */
        
        
        
        
        
        
        
        /*
        
        Time: O(N)
        
        Trick: 2 pointers at each end and process squaring num inwards....
        
        we intitalize an empty result array
        
        start left pointer at 0 [start of array of nums]...
        
        put right pointer at end of nums....
        
        create while loop and WHILE left is less than or equal to right (so when left and right meet, stop)
        
        square the left and right pointer numbers, compare them to each other, take the larger number and append it to empty result list
        
        decrease the count by 1 whichever pointer you added to the result
        
        at the end of the while loop, your result will be largest number to smallest number.
        
        But they're asking for non-decreasing order so return the reverse of it so use [::-1]
        
    
        */
        
        
        int[] array = new int[nums.length];
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int index = nums.length-1;

        while (index != 0){
            if (nums[leftPointer] * nums[leftPointer] > nums[rightPointer] * nums[rightPointer]){
                array[index] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
            } else {
                array[index] = nums[rightPointer] * nums[rightPointer];
                rightPointer--;
            }
            index--;
        }
        return array;
        
    }
}


