class Solution {
    public String addBinary(String a, String b) {
        
        //Use StringBuilder for mutability
        StringBuilder sb = new StringBuilder(); 
        //two pointers starting from the back
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        
        
        while (i >= 0 || j >= 0) {
            
            int sum = carry; //if there is a carry from the last addition, add it to carry 
            
            //we subtract '0' to get the int value of the char from the ascii
            if (j >= 0) sum += b.charAt(j--) - '0'; 
            
            if (i >= 0) sum += a.charAt(i--) - '0';
            
            //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 
            sb.append(sum % 2);
            //if sum==2 we have a carry, else no carry 1/2 rounds down to 0
            carry = sum / 2; 
        }
        
        //leftover carry, add it
        if (carry != 0) sb.append(carry); 
        
        return sb.reverse().toString();
    }
}