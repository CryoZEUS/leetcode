class Solution {
    public void reverseString(char[] s) {
        
        int N = s.length;
        int i = 0, j = N - 1;
        
        
        while(i < j) {
            
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
            
        }
        
    }
}