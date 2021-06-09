class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        /*
        int[] ans = new int[2];
        
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                if (numbers[i]+numbers[j] == target)
                {
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }
            }
        }
        
        return ans;
        */
        
        //Faster implementation
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i<j)
        {
            if (numbers[i]+numbers[j]==target)
                return new int[]{i+1, j+1};
            else if(numbers[i]+numbers[j]<target)
                i++;
            else
                j--;
        }
        return new int[]{-1, -1};
    }
}