class Solution {
    public int pivotIndex(int[] nums) {
        //edge case
        if(nums.length == 0) return -1;
        int length = nums.length;
        
        int totalsum = 0;
        int leftsum = 0;
        
        for(int i : nums)
            totalsum += i;
        
        for(int i = 0; i < length; i++) {
            if(leftsum == (totalsum - nums[i])) return i;
            
            else {
                leftsum += nums[i];
                //keep reducing elements that are not pivot
                totalsum -= nums[i];
            }
        }
        
        return -1;
    }
}