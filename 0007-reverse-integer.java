class Solution {
    public int reverse(int x) {
        int digit=0;
        long num=0;
        if(x >= Integer.MAX_VALUE || x<Integer.MIN_VALUE) {
            return 0;
        }
        while(x != 0) {
            digit = x%10;

            num*=10;
            num+=digit;
            if(num >= Integer.MAX_VALUE || num<Integer.MIN_VALUE) {
                return 0;
            }
            
            x = (x/10);
        }

        return (int)num;
    }
}