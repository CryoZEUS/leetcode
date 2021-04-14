class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int length = nums.length;
        int index = -1;
        
        for(int i = 0; i < length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        
        for(int i = 0; i < length; i++) {
            if(nums[i] != max && nums[i] > secondmax) {
                secondmax = nums[i];
            }
        }
        
        if(max >= (2 * secondmax)) {
            return index;
        }
        
        return -1;
    }
}