class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        //construct a frequency table array
        int length = nums.length;
        int[] table = new int[length+1];
        List<Integer> result = new ArrayList();
        
        //loop to scroll through nums:
        for(int i=0; i<length; i++) {
            //for every element, count frequency of current element.
            if(nums[i]<length+1){
                table[nums[i]]--;
            }
            
        }
        
        //loop through table
        //skipping 0, because not present as element in nums
        for(int i=1;i<length+1;i++) {
            if(table[i] == 0) result.add(i);
        }
        System.gc();
        return result;
    }
}