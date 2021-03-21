class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int length = nums.length;
        int[] sorted = new int[length];
        int startP = 0;
        int endP = length-1;

        
        for(int i=length-1; i>=0; i--) {
            
            if(nums[endP]>=Math.abs(nums[startP])) {
                sorted[i] = nums[endP] * nums[endP--];
            }
            
            else if(nums[endP]<Math.abs(nums[startP])) {
                sorted[i] = nums[startP] * nums[startP++];
            }
            
            else{
                sorted[i++] = nums[endP] * nums[endP--];
                sorted[i] = nums[startP] * nums[startP++];
            }
             
        }
        
        return sorted;
    }
}